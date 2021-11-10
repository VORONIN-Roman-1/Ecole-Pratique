import { Injectable } from '@angular/core';
import { Employe } from './Employe';
import { EMPLOYES } from './mock-employes';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs'; // RxJS 6, à utiliser
import { catchError, map, tap } from 'rxjs/operators';


@Injectable()
export class EmployeService {
  constructor(private http: HttpClient) { }
  
  private employesUrl = 'api/employes';

  // Retourne tous les employes
  getEmployes(): Observable<Employe[]> {
    return this.http.get<Employe[]>(this.employesUrl).pipe(
      tap(_ => this.log(`fetched employes`)),
      catchError(this.handleError(`getEmployes`, []))
    )
  }
  private log(log: string) {
    console.info(log);
  }
  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.log(error);
      console.log(`${operation} failed: ${error.message}`);
      return of(result as T);
    }
  }


  // Retourne l'employe avec l'identifiant passé en paramètre
  getEmploye(id: number): Observable<Employe> {
    const url = `${this.employesUrl}/${id}`;
    return this.http.get<Employe>(url).pipe(
      tap(_ => this.log(`fetched employe id=${id}`)),
      catchError(this.handleError<Employe>(`getEmploye id=${id}`))
    );
  }

  getEmployeRoles(): string[] {
    return ['architect', 'dev', 'testeur', 'business_analyst', 'chef_de_projet',
      'alternant'];
  }

}
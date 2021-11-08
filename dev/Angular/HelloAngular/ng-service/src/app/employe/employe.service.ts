import { Injectable } from '@angular/core';
import { Employe } from './Employe';
import { EMPLOYES } from './mock-employes';
  
@Injectable()
export class EmployeService {
  
    // Retourne tous les employes
    getEmployes(): Employe[] {
      return EMPLOYES;
    }
      
    // Retourne un employe avec l'identifiant passé en paramètre
    getEmploye(id: number): Employe {
      let employes = this.getEmployes();
      
      for(let index = 0; index < employes.length; index++) {
        if(id === employes[index].id) {
          return employes[index];
        }
      }
      return employes[0];
    }
}
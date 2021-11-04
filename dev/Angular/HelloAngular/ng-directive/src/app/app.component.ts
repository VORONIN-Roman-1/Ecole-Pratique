import { Component } from '@angular/core';
import{ OnInit} from '@angular/core'; 
import { EMPLOYES } from './EMPLOYES';
import { Employe } from './Employe';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'ng-directive';
  employes:Employe[] | undefined ;
  ngOnInit(): void {
    this.employes=EMPLOYES;
   } 
   selectEmploye(employe : Employe){
    alert("vous avez cliqué sur l'employé : "+employe.name)
  }
}

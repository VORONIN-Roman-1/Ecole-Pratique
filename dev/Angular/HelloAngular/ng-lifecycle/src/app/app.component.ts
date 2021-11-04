import { Component } from '@angular/core';
import{ OnInit} from '@angular/core'; 
import { EMPLOYES } from './EMPLOYES';
import { Employe } from './employe';
@Component({
  selector: 'root',
  //  template: `<h1>Hello g{{firstname}} {{name}} avec tete {{color}}. Qui habite {{maison.id}}</h1>`
  templateUrl: './app/app.component.html',
  // styleUrls:[`./app/app.component.css`]
})
export class AppComponent implements OnInit {
  employes:Employe[];
  
  ngOnInit(): void {
    this.employes=EMPLOYES;
   } 
   selectEmploye(employe : Employe){
    alert("vous avez cliqué sur l'employé : "+employe.name)
  }
    
}
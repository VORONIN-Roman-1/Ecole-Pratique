import { Component } from '@angular/core';
import{ OnInit, OnDestroy} from '@angular/core'; 
import { EMPLOYES } from './EMPLOYES';
import { Employe } from './employe';
@Component({
  selector: 'root',
  //  template: `<h1>Hello g{{firstname}} {{name}} avec tete {{color}}. Qui habite {{maison.id}}</h1>`
  templateUrl: './app/app.component.html',
  styleUrls:[`./app/app.component.css`]
})
export class AppComponent implements OnInit {
  name:string="Tom";
     
    constructor(){ this.log(`constructor`); }
    ngOnInit() { this.log(`onInit`); }
 
    ngOnDestroy() { this.log(`onDestroy`); }
 
    private log(msg: string) {
        console.log(msg);
    }
    
}
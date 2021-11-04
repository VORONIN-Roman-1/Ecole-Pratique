import { Component } from '@angular/core';
import{ OnInit} from '@angular/core'; 
import { EMPLOYES } from './EMPLOYES';
import { Employe } from './employe';



@Component({
  selector: 'root',
  //  template: `<h1>Hello g{{firstname}} {{name}} avec tete {{color}}. Qui habite {{maison.id}}</h1>`

  templateUrl: './app/app.component.html',
  styleUrls:[`./app/app.component.css`]
})
export class AppComponent {
  // employes:Employe[];
  // ngOnInit(): void {
  //   this.employes=EMPLOYES;

  // } 
  firstname : any="Mr";
  name = 'Smith';
  position: 'right';
  color: string = 'red'; 
  localPath:string ="assets/images/angular_logo.png";
  urlPath:string ="https://sensorstechforum.com/wp-content/uploads/2016/10/linuxubuntu-vulnerabilities-stforum.png";
  isClient:boolean=true;
  age: number=33;
  majeur:boolean=true;
  maison: Maison= {id:1, type:'individuel'};


  isSpecial:boolean=true;
  count:number = 2 ;

  // TypeScript Arrays
  months:any = ["January", "Feburary", "March", "April", 5, 
  "June", "July", "August", "September",
  'O', "November", "December"];
  days:string[]=["Lundi", "Mardi", "Mercredi", "Jeudi", 
  "Vendredi", 
  "Samedi", "Dimanche"];
  onClick() { console.log("Click !");}


  value: string = 'Event marche';

  onKey(event:any){ 
    this.value= 'Bonjour ' + event.target.value; 
  }
  value2: string = '';
  onKeyw(event:KeyboardEvent){
    this.value2= 'Bonjour ' + (<HTMLInputElement>event.target).value;
  }
  onKey3(value: string){
    this.value= 'Bonjour ' +  value;
  }

  entry: string = '';
  onBlur(value: string){
    this.entry= 'Blur = ' +  value;
  }


  employes:Employe[]= [ { "id": 1, "level": 3, "seniority": 8,"name": "Dupont","picture":
  "assets/photos/photo01.jpg", "roles": [ "architect"],"birthDate": new Date("1984-05-16")},
  { "id": 2, "level": 2, "seniority": 3,"name": "Rocriguez","picture":
  "assets/photos/photo02.jpg", "roles": [ "lead dev"],"birthDate": new Date("1999-12-12")} , 
  { "id": 3, "level": 0, "seniority": 1,"name": "Rocriguez","picture":
  "assets/photos/photo03.png", "roles": [ "lead dev"],"birthDate": new Date("2000-10-12")} 
  ];


}
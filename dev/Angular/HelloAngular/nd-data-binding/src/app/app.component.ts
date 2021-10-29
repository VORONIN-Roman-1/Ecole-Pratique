import { Component } from '@angular/core';


@Component({
  selector: 'root',
  //  template: `<h1>Hello g{{firstname}} {{name}} avec tete {{color}}. Qui habite {{maison.id}}</h1>`

  templateUrl: './app/app.component.html',
  styleUrls:[`./app/app.component.css`]
})
export class AppComponent  { 
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
}
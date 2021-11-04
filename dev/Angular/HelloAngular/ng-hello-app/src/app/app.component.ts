import { Component } from '@angular/core';

@Component({
  selector: 'root',
  // template: `<h1>Hello {{name}}</h1>`,
  templateUrl: './app/app.component.html',
  styleUrls:[`./app/app.component.css`]
})
export class AppComponent  { 
  firstname : any="Mr";
  name = 'Smith';
  color: string = 'red'; 
  localPath:string ="assets/images/angular_logo.png";
  urlPath:string ="https://sensorstechforum.com/wp-content/uploads/2016/10/linuxubuntu-vulnerabilities-stforum.png";
  isClient:boolean=true;
}
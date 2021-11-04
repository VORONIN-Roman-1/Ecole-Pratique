import { Component } from '@angular/core';
import { LANGAGES } from './LANGAGES';
import { Langage } from './Langage';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ng-tp';
  langages: Langage[]=LANGAGES;
}

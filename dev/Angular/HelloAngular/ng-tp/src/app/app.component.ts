import { Component } from '@angular/core';
import { LANGAGES } from './LANGAGES';
import { Langage } from './Langage';
import { mdiLanguageJava } from '@mdi/js';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ng-tp';
  langages: Langage[]=LANGAGES;z
}

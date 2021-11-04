import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { PourtourDirective } from './pourtour.directive';

import { AppComponent } from './app.component';

@NgModule({
imports: [ BrowserModule ],
declarations: [ AppComponent, PourtourDirective ],
bootstrap: [ AppComponent ]
})

export class AppModule { }
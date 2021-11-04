import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { PourtourDirective } from './pourtour.directive';

import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent ,
    PourtourDirective
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

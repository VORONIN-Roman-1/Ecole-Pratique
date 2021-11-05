import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { EmployeModule } from './employe/employe.module';


@NgModule({
  declarations: [
    AppComponent ,
  ],
  imports: [
    BrowserModule,
    EmployeModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

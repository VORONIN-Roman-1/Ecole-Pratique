import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule  } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeModule } from './employe/employe.module';
import { HttpClientModule } from '@angular/common/http';
import { HttpClientInMemoryWebApiModule } from 'angular-in-memory-web-api';
import { InMemoryDataService } from './in-memory-data.service';



@NgModule({
  declarations: [
    AppComponent ,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    HttpClientInMemoryWebApiModule.forRoot(InMemoryDataService, {dataEncapsulation: false}),
    EmployeModule,
    AppRoutingModule 
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
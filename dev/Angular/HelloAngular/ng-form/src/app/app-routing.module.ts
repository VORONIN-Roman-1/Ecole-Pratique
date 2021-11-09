import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListEmployeComponent } from './employe/list-employe.component';
import { DetailEmployeComponent } from './employe/detail-employe.component';
import { EditEmployeComponent } from './employe/edit-employe.component';

// routes
const appRoutes: Routes = [
  { path: 'employes', component: ListEmployeComponent },
  { path: 'employe/:id', component: DetailEmployeComponent },
  { path: 'employe/edit/:id', component: EditEmployeComponent },
  {
    path: ''
    , redirectTo: 'employes', pathMatch: 'full'
  }
];
@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListEmployeComponent } from './employe/list-employe.component';
import { DetailEmployeComponent } from './employe/detail-employe.component';
import { EditEmployeComponent } from './employe/edit-employe.component';
import { AuthGuard } from './auth-guard.service';


// routes
const appRoutes: 
// Routes = [
//   { path: 'employes', component: ListEmployeComponent },
//   { path: 'employe/:id', component: DetailEmployeComponent },
//   { path: 'employe/edit/:id', component: EditEmployeComponent, 
//   canActivate: [AuthGuard]  },
//   {
//     path: ''
//     , redirectTo: 'employes', pathMatch: 'full'
//   }
// ];
Routes = [ {
  path: 'employe',
  canActivate: [AuthGuard],
  children:[
  { path: 'all', component: ListEmployeComponent },
  { path: 'edit/:id', component: EditEmployeComponent , 
  canActivate: [AuthGuard]},
  { path: ':id', component: DetailEmployeComponent }  ]},
  { path: '', redirectTo: 'employe/all', pathMatch: 'full' }
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

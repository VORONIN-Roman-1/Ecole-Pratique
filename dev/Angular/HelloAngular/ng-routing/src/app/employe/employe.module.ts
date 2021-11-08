import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
import { ListEmployeComponent } from './list-employe.component';
import { DetailEmployeComponent } from './detail-employe.component';
import { PourtourDirective } from './pourtour.directive';
// import { EmployeRoleColorPipe } from './employe-role-color.pipe';
  
@NgModule({
    imports: [
        CommonModule
    ],
    declarations: [
        ListEmployeComponent,
        DetailEmployeComponent,
        PourtourDirective,
        // EmployeRoleColorPipe
    ],
    providers: []
})
export class EmployeModule { }

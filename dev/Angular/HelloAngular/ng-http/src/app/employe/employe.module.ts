import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';


import { RouterModule } from '@angular/router';
import { ListEmployeComponent } from './list-employe.component';
import { DetailEmployeComponent } from './detail-employe.component';
import { PourtourDirective } from './pourtour.directive';
import { EmployeRoleColorPipe } from './employe-role-color.pipe';
import { EmployeService } from './employe.service';
import { EditEmployeComponent } from './edit-employe.component';
import { EmployeFormComponent } from './employe-form.component';
import { EmployeSearchComponent } from './search-employe.component';

import { LoaderComponent } from '../loader.component';


  
@NgModule({
    imports: [
        CommonModule,
        FormsModule
    ],
    declarations: [
        ListEmployeComponent,
        DetailEmployeComponent,
        EmployeFormComponent,
        EmployeSearchComponent,
        LoaderComponent,
        EditEmployeComponent,
        PourtourDirective,
        EmployeRoleColorPipe
    ],
    providers: [EmployeService]
})
export class EmployeModule { }

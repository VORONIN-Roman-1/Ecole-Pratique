import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { OnInit } from '@angular/core';
import { EMPLOYES } from './mock-employes';
import { Employe } from './Employe';
import { EmployeService } from './employe.service';
@Component({
    selector: 'list-employe',
    templateUrl: './list-employe.component.html',
    providers: []

})
export class ListEmployeComponent implements OnInit {
    employes!: Employe[];
    constructor(private router: Router, 
        private employeService: EmployeService ) { }

    ngOnInit(): void {
        this.getEmployes();
    }
    getEmployes(): void {
        this.employeService.getEmployes()
        .subscribe(employes => this.employes =
        employes );
        }
        

    selectEmploye(employe: Employe) {
        //alert("vous avez cliqué sur l'employé : " + employe.name)
        let link = ['/employe', employe.id];
        this.router.navigate(link);
    }
}

import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { OnInit } from '@angular/core';
import { EMPLOYES } from './mock-employes';
import { Employe } from './Employe';
@Component({
    selector: 'list-employe',
    templateUrl: './list-employe.component.html'
})
export class ListEmployeComponent implements OnInit {
    employes!: Employe[];
    constructor(private router: Router) { }

    ngOnInit(): void {
        this.employes = EMPLOYES;
    }

    selectEmploye(employe: Employe) {
        alert("vous avez cliqué sur l'employé : " + employe.name)
        let link = ['/employe', employe.id];
        this.router.navigate(link);
    }
}

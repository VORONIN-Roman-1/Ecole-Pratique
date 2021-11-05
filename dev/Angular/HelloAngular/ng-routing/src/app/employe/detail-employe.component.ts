import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, Params } from '@angular/router';
import { Employe } from './Employe';
import { EMPLOYES } from './mock-employes';
@Component({
    selector: 'detail-employe',
    templateUrl: './detail-employe.component.html'
})
export class DetailEmployeComponent implements OnInit {
    employes!: Employe[];
    employe!: Employe;
    constructor(private route: ActivatedRoute, private router: Router) { }
    ngOnInit(): void {
        this.employes = EMPLOYES;
        let id = this.route.snapshot.paramMap.get('id');
        for (let i = 0; i < this.employes.length; i++) {
            if (<unknown>this.employes[i].id == id) {
                this.employe = this.employes[i];
            }
        }
    }
    goBack(): void {
        this.router.navigate(['/employes']);
    }
}

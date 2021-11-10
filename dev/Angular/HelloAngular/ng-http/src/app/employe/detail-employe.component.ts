import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, Params } from '@angular/router';
import { Employe } from './Employe';
import { EmployeService } from './employe.service';

@Component({
    selector: 'detail-employe',
    templateUrl: './detail-employe.component.html',
    providers: []
})
export class DetailEmployeComponent implements OnInit {
    employes!: Employe[];
    employe!: Employe;
    constructor(private route: ActivatedRoute, private router: Router, private employeService: EmployeService) { }
    ngOnInit(): void {
        let id = +this.route.snapshot.paramMap.get('id')!;
        this.employeService.getEmploye(id)
            .subscribe(employe => this.employe = employe);
    }

    goBack(): void {
        this.router.navigate(['/employes']);
    }
    goEdit(employe: Employe): void {
        let link = ['/employe/edit', employe.id];
        this.router.navigate(link);
    }

}

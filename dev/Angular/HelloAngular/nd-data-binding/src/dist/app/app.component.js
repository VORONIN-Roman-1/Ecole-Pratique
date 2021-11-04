"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
var AppComponent = /** @class */ (function () {
    function AppComponent() {
        // employes:Employe[];
        // ngOnInit(): void {
        //   this.employes=EMPLOYES;
        // } 
        this.firstname = "Mr";
        this.name = 'Smith';
        this.color = 'red';
        this.localPath = "assets/images/angular_logo.png";
        this.urlPath = "https://sensorstechforum.com/wp-content/uploads/2016/10/linuxubuntu-vulnerabilities-stforum.png";
        this.isClient = true;
        this.age = 33;
        this.majeur = true;
        this.maison = { id: 1, type: 'individuel' };
        this.isSpecial = true;
        this.count = 2;
        // TypeScript Arrays
        this.months = ["January", "Feburary", "March", "April", 5,
            "June", "July", "August", "September",
            'O', "November", "December"];
        this.days = ["Lundi", "Mardi", "Mercredi", "Jeudi",
            "Vendredi",
            "Samedi", "Dimanche"];
        this.value = 'Event marche';
        this.value2 = '';
        this.entry = '';
        this.employes = [{ "id": 1, "level": 3, "seniority": 8, "name": "Dupont", "picture": "assets/photos/photo01.jpg", "roles": ["architect"], "birthDate": new Date("1984-05-16") },
            { "id": 2, "level": 2, "seniority": 3, "name": "Rocriguez", "picture": "assets/photos/photo02.jpg", "roles": ["lead dev"], "birthDate": new Date("1999-12-12") },
            { "id": 3, "level": 0, "seniority": 1, "name": "Rocriguez", "picture": "assets/photos/photo03.png", "roles": ["lead dev"], "birthDate": new Date("2000-10-12") }
        ];
    }
    AppComponent.prototype.onClick = function () { console.log("Click !"); };
    AppComponent.prototype.onKey = function (event) {
        this.value = 'Bonjour ' + event.target.value;
    };
    AppComponent.prototype.onKeyw = function (event) {
        this.value2 = 'Bonjour ' + event.target.value;
    };
    AppComponent.prototype.onKey3 = function (value) {
        this.value = 'Bonjour ' + value;
    };
    AppComponent.prototype.onBlur = function (value) {
        this.entry = 'Blur = ' + value;
    };
    AppComponent = __decorate([
        core_1.Component({
            selector: 'root',
            //  template: `<h1>Hello g{{firstname}} {{name}} avec tete {{color}}. Qui habite {{maison.id}}</h1>`
            templateUrl: './app/app.component.html',
            styleUrls: ["./app/app.component.css"]
        })
    ], AppComponent);
    return AppComponent;
}());
exports.AppComponent = AppComponent;
//# sourceMappingURL=app.component.js.map
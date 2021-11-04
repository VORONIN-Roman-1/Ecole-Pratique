"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
var EMPLOYES_1 = require("./EMPLOYES");
var AppComponent = /** @class */ (function () {
    function AppComponent() {
    }
    AppComponent.prototype.ngOnInit = function () {
        this.employes = EMPLOYES_1.EMPLOYES;
    };
    AppComponent.prototype.selectEmploye = function (employe) {
        alert("vous avez cliqué sur l'employé : " + employe.name);
    };
    AppComponent = __decorate([
        core_1.Component({
            selector: 'root',
            //  template: `<h1>Hello g{{firstname}} {{name}} avec tete {{color}}. Qui habite {{maison.id}}</h1>`
            templateUrl: './app/app.component.html',
        })
    ], AppComponent);
    return AppComponent;
}());
exports.AppComponent = AppComponent;
//# sourceMappingURL=app.component.js.map
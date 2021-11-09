import { Pipe, PipeTransform } from '@angular/core';

/* Affiche la couleur correspondant au role de l'employé.  Prend en argument le role de l'employé
 * Exemple d'utilisation:  {{ employe.role | employeRoleColor }} */
@Pipe({name: 'employeRoleColor'})
export class EmployeRoleColorPipe implements PipeTransform {
    transform(role: string): string {
        let color: string;
      
        switch (role) {
            case "chef_de_projet":
                color = "blue lighten-2";
                break;
            case "architect":
                color = "deep-purple lighten-2";
                break;case 'dev':
                color = "teal accent-4";
                break;
            case "business_analyst":
                color = "red accent-2";
                break;
            case "testeur":
                color = "orange";
                break;
            case "alternant":
                color = "grey lighten-3";
                break;
            default:
                color = "lime accent-2";
                break;
            }


      return "chip "+color;
    }
}

export class Employe {
    id: number;
    level: number;
    seniority: number;
    name: string;
    picture: string;
    roles: Array<string>;
    birthDate: Date;

  constructor(
    id: number, 
    level: number, 
    seniority: number, 
    name: string, 
    picture: string, 
    roles: Array<string>, 
    birthDate: Date
) {
    this.id = id
    this.level = level
    this.seniority = seniority
    this.name = name
    this.picture = picture
    this.roles = roles
    this.birthDate = birthDate
  }

    }
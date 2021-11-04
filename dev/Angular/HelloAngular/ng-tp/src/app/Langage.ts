export class Langage {
    title:string;
    niveau:number;
    description: string;
    icon:string;

  constructor(
    title: string, 
    niveau: number, 
    description: string, 
    icon: string
) {
    this.title = title
    this.niveau = niveau
    this.description = description
    this.icon = icon
  }

}
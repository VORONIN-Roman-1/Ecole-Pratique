import { Directive, ElementRef, HostListener, Input } from '@angular/core';
  
@Directive({
  selector: '[employePreSelect]'})
export class PourtourDirective {
   private initialColor: string = '#f5f5f5';
   private defaultColor: string ='#00695f';
   private defaultHeight: number = 180;
    constructor(private el: ElementRef) {
        this.setBorder( this.initialColor);
        this.setHeight( this.defaultHeight);
    }
  
    @Input ('employePreSelect') borderColor: string | undefined; // avec alias
    
    @HostListener('mouseenter') onMouseEnter() {
        this.setBorder(this. borderColor ||this.defaultColor); }
    @HostListener ('mouseleave') onMouseLeave(){
        this.setBorder( this.initialColor);}
    private setBorder(color: string) {
        let border = 'solid 4px ' + color;
        this.el.nativeElement.style.border = border;}
  
    private setHeight(height: number) {
        this.el.nativeElement.style.height = height + 'px';}
}

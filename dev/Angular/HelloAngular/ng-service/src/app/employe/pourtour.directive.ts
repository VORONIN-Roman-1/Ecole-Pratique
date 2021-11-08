import { Directive, ElementRef } from '@angular/core';
  
@Directive({
  selector: '[employePreSelect]'
})
export class PourtourDirective {
    constructor(private el: ElementRef) {
        this.setBorder('#f5f5f5'); //bordure grise
        this.setHeight(180);
    }
  
    private setBorder(color: string) {
        let border = 'solid 4px ' + color;
        this.el.nativeElement.style.border = border;
    }
  
    private setHeight(height: number) {
        this.el.nativeElement.style.height = height + 'px';
    }
}
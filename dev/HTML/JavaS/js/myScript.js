function display(){
    document.write("Matin");
    display = function(){
        document.write("Jour");
    }
}
var displayMessage = display;
display(); 
display();
displayMessage(); 
displayMessage(); 
var displayMessage = display;
displayMessage(); 
displayMessage(); 
let next = document.getElementById("next");
next.addEventListener("click", nextClient);
const persones = ["man", "femme", "reine", "alf"];
function nextClient() {
    // alert("work");
    let = "reine";
    persones.forEach(persone => {var next = document.getElementById(persone);
        next.setAttribute("class", "hidden");
    });
    document.getElementById(persones[Math.floor(Math.random() * 3)]).setAttribute("class", "present")
    
}
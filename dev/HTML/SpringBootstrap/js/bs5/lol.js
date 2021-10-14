function dance(o, u)
{
    let x = document.getElementById(o);
    for (let m = 0; m < u; m++)
    {
        let clone = x.cloneNode(true);
        document.getElementById("maman").appendChild(clone)
    }
}
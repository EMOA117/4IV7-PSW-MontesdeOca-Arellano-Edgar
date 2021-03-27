/*
vamos a crear una función que se encargue de 
validar que el usuario deba escribir mas de 5 
caracteres en el campo nombre
*/

function validar (formulario){
    //obtener valores del formulario
    if(formulario.nombre.value.lenght < 5){
        alert("Escribe mas de 5 caracteres en el campo nombre");
        formulario.nombre.focus();
    return false;
    }

    //Opcion de solo ingresar letras en Nombre
    var checkOK = " qwertyuiopasdfghjklñzxcvbnm"
    + "QWERTYUIOPASDFGHJKLÑZXCVBNM";

    var checkStr = formulario.nombre.value;

    var allvalid = true;

    for (var i = 0; i < checkStr.lenght; i++) {
        var ch = checkStr.charAt(i);
        for (var j = 0; j < checkOK.lenght; j++)
        if (ch == checkOK.charAt(j))
            break;
        if (j == checkOK.length){
            allvalid = false;
            break;
        } 
        
    }

    if(!valid){
        alert("Escribe solo letras en el campo nombre");
        formulario.nombre.focus();
        return false;
    }

    var checkOK = "1234567890";

    var checkStr = formulario.edad.value;

    var allvalid = true;

    for (var i = 0; i < checkStr.lenght; i++) {
        var ch = checkStr.charAt(i);
        for (var j = 0; j < checkOK.lenght; j++)
        if (ch == checkOK.charAt(j))
            break;
        if (j == checkOK.length){
            allvalid = false;
            break;
        } 
        
    }

    if(!valid){
        alert("Escribe solo numero en el campo edad");
        formulario.edad.focus();
        return false;
    }

    var txt = formulario.email.value;

    var b = /^[^@\s]+@[^@\.\s]+(\.[^@\.\s]+)+$/;

    alert("Email " + (b.test(txt)?"":" no ")+" valido");

    return b.test(txt);
}
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function Validar(){

    if(formulario.nombre.value.length == 0) {
        alert('No has escrito nada en nombre');
        return;
    }
    
    if(formulario.nombre.value.length > 20) {
        alert('Escribe un nombre de usuario mas pequeño');
        return;
    }
    if(formulario.appat.value.length == 0) {
        alert('No has escrito nada en apellido paterno');
        return;
    }
    
    if(formulario.appat.value.length > 20) {
        alert('Escribe un apellido paterno mas pequeño');
        return;
    }
    if(formulario.appmat.value.length == 0) {
        alert('No has escrito nada en apellido materno');
        return;
    }
    
    if(formulario.appmat.value.length > 20) {
        alert('Escribe un apellido materno mas pequeño');
        return;
    }
    if(formulario.edad.value.length == 0) {
        alert('No has escrito nada en edad');
        return;
    }
    
    if(formulario.edad.value > 99) {
        alert('Escribe una Edad que no sea mayor a 99');
        return;
    }
     if(formulario.edad.value < 0) {
        alert('Escribe una Edad que no sea negativa');
        return;
    }
    if(formulario.email.value.length > 20) {
        alert('Escribe un email mas corto');
        return;
    }
    if(formulario.email.value.length == 0) {
        alert('No has escrito nada en email');
        return;
    }

}

function ValidarE(){
     if(formularioeliminar.ideliminar.value.length == 0) {
        alert('No has escrito nada en ID a eliminar');
        return;
    }
    
    if(formularioeliminar.ideliminar.value > 99) {
        alert('No creo que tengamos tantos registros');
        return;
    }
}

function ValidarED(){
     if(formularioactualizar.ideditar.value.length == 0) {
        alert('No has escrito nada en ID a eliminar');
        return;
    }
    
    if(formularioactualizar.ideditar.value > 99) {
        alert('No creo que tengamos tantos registros');
        return;
    }
    
    if(formularioactualizar.nombreN.value.length == 0) {
        alert('No has escrito nada en Nombre para editar');
        return;
    }
    
    if(formularioactualizar.nombreN.value.length > 20) {
        alert('El nombre es muy largo');
        return;
    }
    if(formularioactualizar.appatN.value.length == 0) {
        alert('No has escrito nada en Apellido paterno para editar');
        return;
    }
    
    if(formularioactualizar.appatN.value.length > 20) {
        alert('El apellido paterno es muy largo');
        return;
    }
    if(formularioactualizar.appmatN.value.length == 0) {
        alert('No has escrito nada en Apellido materno para editar');
        return;
    }
    
    if(formularioactualizar.appmatN.value.length > 20) {
        alert('El apellido materno es muy largo');
        return;
    }
    if(formularioactualizar.edadN.value.length == 0) {
        alert('No has escrito nada en edad');
        return;
    }
    
    if(formularioactualizar.edadN.value > 99) {
        alert('Escribe una Edad que no sea mayor a 99');
        return;
    }
     if(formularioactualizar.edadN.value < 0) {
        alert('Escribe una Edad que no sea negativa');
        return;
    }
     if(formularioactualizar.correoN.value.length > 20) {
        alert('Escribe un email mas corto');
        return;
    }
    if(formularioactualizar.correoN.value.length == 0) {
        alert('No has escrito nada en email');
        return;
    }
    
}
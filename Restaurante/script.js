/*Consola enviar */
function fConsola(){
    var fecha = document.getElementById("fechaInput").value;
    alert("Reserva a nombre de " + document.querySelector("#nombreInput").value + " el día " + fecha)
    
}


/*Funcion de input */
function fBorder(){
    document.querySelector("input").style.style="solid 2px"
}


/*Funcion de animacion */
let intervalo = 0;

function fMostrar(){
    if(document.querySelector("#arroz").style.display == "none"){
        document.querySelector("#carnes").style.display= "none";
        document.querySelector("#arroz").style.display= "block";
    }else{
        document.querySelector("#arroz").style.display = "none";
        document.querySelector("#carnes").style.display= "block";
    } 
}

function fAuto(){
    intervalo = setInterval(fMostrar, 1000)
}


/* FUNCIONES PARA ENTRAR O CERRAR A AÑADIR */
function fAñadir1(){
    document.querySelector("#nn1").style.display = "flex"
}

function fCerrar1(){
    document.querySelector("#nn1").style.display = "none"
}
/*XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX*/
function fAñadir2(){
    document.querySelector("#nn2").style.display = "flex"
}

function fCerrar2(){
    document.querySelector("#nn2").style.display = "none"
}
/*XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX*/
function fAñadir3(){
    document.querySelector("#nn3").style.display = "flex"
}

function fCerrar3(){
    document.querySelector("#nn3").style.display = "none"
}
/*XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX*/
function fAñadir4(){
    document.querySelector("#nn4").style.display = "flex"
}

function fCerrar4(){
    document.querySelector("#nn4").style.display = "none"
}
/*XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX*/
function fAñadir5(){
    document.querySelector("#nn5").style.display = "flex"
}

function fCerrar5(){
    document.querySelector("#nn5").style.display = "none"
}
/*XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX*/
function fAñadir6(){
    document.querySelector("#nn6").style.display = "flex"
}

function fCerrar6(){
    document.querySelector("#nn6").style.display = "none"
}
/*XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX*/
function fAñadir7(){
    document.querySelector("#nn7").style.display = "flex"
}

function fCerrar7(){
    document.querySelector("#nn7").style.display = "none"
}
/*XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX*/


/*Función de precio */
var precio = 0;


function add1(){
    precio += 24.4
    document.querySelector("#precio").innerHTML = (precio + "€")
}

function add2(){
    precio += 25.7
    document.querySelector("#precio").innerHTML = (precio + "€")
}

function add3(){
    precio += 18.7
    document.querySelector("#precio").innerHTML = (precio + "€")
}

function add4(){
    precio += 22.80
    document.querySelector("#precio").innerHTML = (precio + "€")
}

function add5i6(){
    precio += 25.5
    document.querySelector("#precio").innerHTML = (precio + "€")
}

function add7(){
    precio += 3.8
    document.querySelector("#precio").innerHTML = (precio + "€")
}

function fPrecio(){
    document.querySelector("#precio").innerHTML = (precio + "€")
}

/*Funcion de carga */

function Onload(){
    fAuto();
    fPrecio();
}
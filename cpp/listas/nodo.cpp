#include "nodo.h"

namespace edu_itszapopan_edd  {


Nodo::Nodo() {
contenido = null;
sig = null;
}

Nodo(String cont, Nodo s) {
contenido = cont;
sig = s;
}

Nodo(String cont) {
contenido = cont;
sig = null;
}

Nodo getSig() 
{
return sig;
}

String Nodo::getContenido()
{
return contenido;
}

void Nodo::setSig(Nodo sig) {
this.sig = sig;
}

void setContenido(String c) {
contenido = c;
}




};

















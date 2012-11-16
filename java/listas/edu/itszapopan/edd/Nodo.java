package edu.itszapopan.edd;

public class Nodo {

   protected String contenido;
   protected Nodo sig;

   public Nodo() {
     contenido = null;
     sig = null;
   }

   public Nodo(String cont, Nodo s) {
     contenido = cont;
     sig = s;
   }

   public Nodo(String cont) {
     contenido = cont;
     sig = null;
   }

   public Nodo getSig() 
   {
     return sig;
   }

   public String getContenido()
   {
     return contenido;
   }

   public void setSig(Nodo sig) {
     this.sig = sig;
   }

   public void setContenido(String c) {
     contenido = c;
   }


}
















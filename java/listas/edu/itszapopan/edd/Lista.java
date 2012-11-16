package edu.itszapopan.edd;

public class Lista  {

   protected Nodo inicial;
   private Nodo imprimir;
   
   public Lista() {
     inicial = null;
   }

   public void inserta_al_principio(String valor) {
     Nodo vagon;
     vagon = null;
     if (inicial == null) {
       inicial = new Nodo(valor);
       //inicial = new Nodo();
       //inicial.setContenido(valor);
     } else {
       vagon = new Nodo(valor);
       vagon.setSig(inicial);
       inicial = vagon;
     }
   }

   public void quieroImprimir() {
     imprimir = inicial;
   }

   public Nodo next() {
     Nodo actual;
     actual = imprimir;
     if (imprimir != null) {
       imprimir = imprimir.getSig();
     }
     return actual;
   }

}
















import edu.itszapopan.edd.*;

public class ProgPrincipal {

	public static void main(String args[]) {
	  Nodo n;
	  short contador;
	  Lista l = new Lista();

	  l.inserta_al_principio("Chivas");
	  l.inserta_al_principio("Toluca");
	  l.inserta_al_principio("America");
	  l.inserta_al_principio("Cruz Azul");

	  l.quieroImprimir();
	  
	  n = l.next();
	  contador = 1;
	  while (n != null) {
	    System.out.println(contador + ": "+n.getContenido());
	    n = l.next();
	    contador++;
	  }


	}
}



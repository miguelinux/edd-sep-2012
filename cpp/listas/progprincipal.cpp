#include <iostream>

int main(int argc, char *argv[]) {

  Nodo n;
  short contador;
  Lista *l = new Lista();

  l->inserta_al_principio("Chivas");
  l->inserta_al_principio("Toluca");
  l->inserta_al_principio("America");
  l->inserta_al_principio("Cruz Azul");

  l->quieroImprimir();
  
  n = l->next();
  contador = 1;
  while (n != NULL) {
    std::cout << contador << ": " << n->getContenido() << std::endl;
    n = l->next();
    contador++;
  }
 
  delete l;


  return 0;
}









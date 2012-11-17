#ifndef _NODO_H_
#define _NODO_H_

#include <string>

namespace edu_itszapopan_edd  {

  class Nodo {

   protected:
     std::string contenido;
     Nodo* sig;

   public: 
     Nodo();
     Nodo(std::string cont, Nodo* s);
     Nodo(std::string cont);

     Nodo* getSig();

     std::string getContenido();

     void setSig(Nodo *sig);

     void setContenido(string c);
  };

};

#endif






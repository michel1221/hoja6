// Universidad del valle de Guatemala
// Michel Ramirez Najera
// carné: 14069
// Luis Eduardo Ruano
// Luis pedro Velezques

/**
 *
 * @author michel Ramirez
 * @author Luis Eduardo
 * @author Luis Pedro
 * @param <E>
 */
public abstract class abstractLista<E> 
    implements Lista<E> {
    
    /**
     *es una clase abstracta  que sirve como adt para las listas
     */
    public abstractLista()
   
   {
   }

    /**
     *es el metodo en comun
     * @return
     */
    public boolean isEmpty()
   
   {
      return size() == 0;
   }
    
}

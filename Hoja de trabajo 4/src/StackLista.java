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

public class StackLista<E> extends abstractStack<E> {
	
    /**
     *sirve para poder crear un archivo para polimorfismo
     */
    protected abstractLista<E> data;

    /** 
     * sirve para poder poder elegeir un item del polimorfismo 
     */
    protected ListaFactory nfactory;

    /**
     * constructor
     */
    public StackLista() {
		
		nfactory = new ListaFactory();
		data = nfactory.getLista(4);
	}

    /**
     *sirve para poder meter un valro al stack
     * @param item
     */
    public void push(E item){
		
		data.addFirst(item);
	}

    /**
     * sirve para pode sacar un elemento del stack
     * @return
     */
    public E pop(){
		
		return data.removeFirst();
	}

    /**
     * sirve para poder eligir el valor del stack
     * @return
     */
    public E peek() {
		
		return data.getFirst();
	}
	
    /**
     *sirve para obtener el tamño de la cadena
     * @return
     */
    public int size(){
	
	   return data.size();
	}
}

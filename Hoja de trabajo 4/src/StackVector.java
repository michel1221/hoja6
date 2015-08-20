// Universidad del valle de Guatemala
// Michel Ramirez Najera
// carné: 14069
// Luis Eduardo Ruano
// Luis pedro Velezques
import java.util.*;

/**
 *
  * @author michel Ramirez
 * @author Luis Eduardo
 * @author Luis Pedro
 * @param <E>
 */
public class StackVector <E> extends abstractStack <E>{

    /**
     * sirve para poder crear un objeto de tipo vector
     */
    public Vector <E>dato;

    /**
     *constructor
     */
    public StackVector (){
	
	dato= new Vector<E>();
	
	}

    /**
     *sirve para poder meter un valor al stackg
     * @param item
     */
    public void push(E item){
	 
		dato.add(item);
	}

    /**
     *sirve para sacar un valor del stacj
     * @return
     */
    public E pop(){
	   
	   return dato.remove(size()-1);
	}

    /**
     *sirve para agarrar el valor del stack
     * @return
     */
    public E peek(){
	
		return dato.get(size() - 1);
	}

    /**
     * sirve para poder tomar el tamaño
     * @return
     */
    public int size(){
	
	   return dato.size();
	}















}
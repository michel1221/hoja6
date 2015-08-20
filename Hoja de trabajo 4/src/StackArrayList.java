import java.util.ArrayList;
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
public class StackArrayList<E> extends abstractStack<E> {
	
    /**
     *srive para poder crear un valor de lisra
     */
    protected ArrayList<E> data;

    /**
     *constructor 
     */
    public StackArrayList() {
		
		data = new ArrayList<E>();
	}

    /**
     *
     * @param item
     */
    public void push(E item) {
		
		data.add(item);
	}

    /**
     * sirve para poder sacar un elemento del stack
     * @return
     */
    public E pop() {
		
		return data.remove(size()-1);
	}

    /**
     *sirve para agarrar un elemento del stack 
     * @return
     */
    public E peek() {
		
		return data.get(size() - 1);
	}
	
    /**
     * sirve para el tamaño de lstack 
     * @return
     */
    public int size(){
	
	   return data.size();
	}
}
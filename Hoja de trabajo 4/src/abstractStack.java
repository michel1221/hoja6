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
public abstract class abstractStack<E> implements Stack<E> {
    
    /**
     *constructor sirve para adt para sacar un metodo en comun de los stacks
     */
    public abstractStack()
   
   {
   }

    /**
     *es el metodo en comun para todas las clases 
     * @return
     */
    public boolean empty()
	
	{
		return size() == 0;
	}
	
    
}

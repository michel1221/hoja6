// Universidad del valle de Guatemala
// Michel Ramirez Najera
// carné: 14069
// Luis Eduardo Ruano
// Luis pedro Velezques
import java.util.*;
public class StackVector <E> implements Stack <E>{

	public Vector <E>dato;

	public StackVector (){
	
	dato= new Vector<E>();
	
	}

	public void push(E item){
	 
		dato.add(item);
	}
	public E pop(){
	   
	   return dato.remove(size()-1);
	}

	public E peek(){
	
		return dato.get(size() - 1);
	}

   
   public boolean empty(){
	     
		return size()==0;
   }
   
	public int size(){
	
	   return dato.size();
	}
















}
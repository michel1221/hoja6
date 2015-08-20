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
 */
public class stackFactory {

    /**
     *sirve para poder elegir el valor de stack en forma de vector, array list o lista
     * @param num
     * @return
     */
    public Stack getStack (int num) {
   int i = num; 
   if (i==1){
	  return new StackVector<Integer>(); 
   }
   
   if(i== 2){
      return new StackArrayList<Integer>(); 
   }
   
   if(i== 3){
      return new StackLista<Integer>(); 
   }
   
   else{
	   return new StackArrayList<Integer>();
   }
   }
}
// Universidad del valle de Guatemala
// Michel Ramirez Najera
// carné: 14069
// Luis Eduardo Ruano carné: 14187
// Luis pedro Velezques

/**
 *
 * @author michel
 * @author Luis eduardo
 * @author Luis Pedro velazques
 */
public class ListaFactory {

    /**
     *Sirve para poder elegir el tipo de instancia que se quiera 
     * @param num
     * @return
     */
    public abstractLista getLista (int num) {
   int i = num; 
   if (i==1){
	  return new SinglyLinkedList(); 
   }
   
   if(i== 2){
      return new DoubleLinkedList(); 
   }
  
   if(i == 3) {
	   return new DoubleLinkedList();
   }
   else if(i == 4){
	   
	   return new CircularList();
   }
	return new CircularList();
   }
}
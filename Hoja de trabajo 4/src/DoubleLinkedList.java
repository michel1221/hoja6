// Universidad del valle de Guatemala
// Michel Ramirez Najera
// carné: 14069
// Luis Eduardo Ruano
// Luis pedro Velezques

/**
 *
 * @author michel Franchesco 
 * @author Luis Ruano
 * @author Luis Pedro velazques
 * @param <E>
 */
public class DoubleLinkedList<E> extends abstractLista<E> {
    
    /**
     *
     */
    protected int count; 
 
    /**
     *
     */
    protected Node<E> head; 
 
    /**
     *
     */
    protected Node<E> tail; 

    /**
     *
     */
    public DoubleLinkedList()

   {
      head = null;
      count = 0;
      tail = null;
   }
   
   public int size()
 
  {
    return count;
  }
  
  public void addFirst(E value)

  {
  
     int item =this.size();
     if (item==0){
        head = new Node<E>(value);
        count++;
        tail = head;
        head.setLast(null);
     }
     else {
         Node<E> temp= head;
         head = new Node<E>(value);
         count++;
         head.setNext(temp);
         head.setLast(null);
     }
  }
  
  public E removeFirst()
 
 {
	Node<E> temp = head;
	head = head.next(); 
	count--;
	return temp.value();
 }
 
 public E getFirst()

 {
     int item =this.size();
     if (item!=0){
	return head.value();
     }
     else 
         return null;
 }
  
 
 public E removeLast()
 {
     Node<E> temp = tail;
     tail = tail.before();
     count--;
     return temp.value();
 }
 
 public void addLast(E value)
 {
     int item =this.size();
     if (item==0){
        head = new Node<E>(value);
        count++;
        tail = head;
        head.setLast(null);
     }
     else {
         Node<E> temp= tail;
         tail = new Node<E>(value);
         count++;
         tail.setLast(temp);
         tail.setNext(null);
     }
 }
 
}

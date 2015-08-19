// Universidad del valle de Guatemala
// Michel Ramirez Najera
// carné: 14069
// Luis Eduardo Ruano
// Luis pedro Velezques
class stackFactory {

   public Stack getStack (int num) {
   int i = num; 
   if (i==1){
	  return new StackVector<Integer>(); 
   }
   
   if(i== 2){
      return new StackArrayList<Integer>(); 
   }
   

   else{
	   return new StackArrayList<Integer>();
   }
   }
}
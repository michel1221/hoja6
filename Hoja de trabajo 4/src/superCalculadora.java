import java.io.*;

/**
  * @author michel Ramirez
 * @author Luis Eduardo
 * @author Luis Pedro
 */
public class superCalculadora implements Calculadora {

    /**
     *este almacena el texto
     */
    public String texto;

    /**
     *numero de signos
     */
    public int contSignos;

    /**
     *paraque cuenta el numero de numeros
     */
    public int contNums;

    /**
     *para el largo de la cadena
     */
    public int largoCad;

    /**
     *El factory para obtener el tipo de dato
     */
    public stackFactory nFactory;

    /**
     *para el objeto de tipo stack que seleccione
     */
    public Stack<Integer> obj;

    /**
     * para la cadena ingresada
     */
    public String cadena;

    /**
     *para el 1er numero en operaciones
     */
    public int a;

    /**
     * para el 2do numero en operaciones
     */
    public int b;
	int numCambiar;
	
    /**
     *Es el constructor para la clase en donde seteamos los valores predeterminados
     */
    public superCalculadora (){
		nFactory= new stackFactory();
		contSignos =0;
		contNums = 0;
		obj= nFactory.getStack(3);
		largoCad=0;
		cadena= "";
		numCambiar = 0;
		
	}

    /**
     *este metodo sirve para ingresar el string del usuario y obtener el largo
     * @param linea
     */
    public void setString(String linea){
		 cadena = linea;
		largoCad=cadena.length();
	}

    /**
     *sirve para para meter la cadena del vecrt
     */
    public void meterVector (){
		largoCad=cadena.length();
	}
	
    /**
     * sirve para calcular el vector y tambien tiene la programacion defensiva 
     * @return
     */
    public boolean calcularVector(){
		
	
		for (int i=0;i<largoCad;i++){ //Aqui cambias largo de la cadena
			switch (cadena.charAt(i)){
				case '0':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '1':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '2':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '3':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '4':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '5':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '6':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '7':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '8':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '9':{
					numCambiar = Integer.parseInt(cadena.substring(i,i+1));
					obj.push(numCambiar);
					break;
				}
				case '+':{
					try {
						a=obj.pop();
						b=obj.pop();
						a=a+b;
						obj.push(a);
					}
					catch (Exception e){
						return false;	
					}
					break;
				}
				case '-':{
					try {
						a=obj.pop();
						b=obj.pop();
						a=b-a;
						obj.push(a);
					}
					catch (Exception e){
						return false;	
					}
					break;
				}
				case '*':{
					try {
						a=obj.pop();
						b=obj.pop();
						a=a*b;
						obj.push(a);
					}
					catch (Exception e){
						return false;	
					}
					break;
				}
				case '/':{
					try {
						a=obj.pop();
						b=obj.pop();
						a=b/a;
						obj.push(a);
					}
					catch (Exception e){
						return false;	
					}
					break;
				}
				case ' ':{
					break;
				}
			}
		}
		return true;
	}
	
    /**
     * sirve para poder obteneer el resultado de la lista
     * @return
     */
    public int getResultado (){
		a = obj.pop();
		return a;
	}
	


}
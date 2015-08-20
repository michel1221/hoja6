import java.util.Scanner;
import java.io.*;

/**
 *
 * @author michel
 */
public class Driver{

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
	BufferedReader bf = null;
	Scanner teclado=new Scanner(System.in);
	Calculadora cont;
	cont = new superCalculadora();
	try{
		bf= new BufferedReader(new FileReader("datos.txt"));
		String lector="";
		while((lector= bf.readLine()) != null){
			cont.setString(lector);
			cont.meterVector();
			boolean yo= cont.calcularVector();
			System.out.println("su operacion es:");
			System.out.println(lector);
			if (yo){
				int numMo = cont.getResultado();
				System.out.println("El resultado es:");
				System.out.println(numMo);
			}
			else {
			System.out.println("Datos mal ingresados");
			}
		}
	}
	catch(Exception e ){
			System.err.println("no metiste un archivo correcto");
		}
	}
}
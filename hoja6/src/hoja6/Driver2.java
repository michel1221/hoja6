/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja6;
import java.util.Scanner;
public class Driver2{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		//Variable mientras jugador este vivo
		boolean seguirPrograma = true;
		boolean seguirPrograma2 = true;
		//Detalles Inicio
		//MenuInicio
		Desarrolladores2 desa = new Desarrolladores2();
		System.out.println("Ingrese el numero de usuarios");
		int numeroUsuarios = teclado.nextInt();
		teclado.nextLine();
		String[] arrayJava = new String[numeroUsuarios];
		String[] arrayCel = new String[numeroUsuarios];
		String[] arrayWeb = new String[numeroUsuarios];
		int k= 0;
		int j= 0;
		int m= 0;
		for ( int i = 0; i < numeroUsuarios; i++){
			System.out.println("Ingrese su nombre");
			String nomDes = teclado.nextLine();
			System.out.println("Es desarrollador java ?");
			System.out.println("1. si");
			System.out.println("2. no");
			System.out.println("Elige la opcion deseada");
			int opcionJava = teclado.nextInt();
			teclado.nextLine();
			
			System.out.println("Es desarrollador web ?");
			System.out.println("1. si");
			System.out.println("2. no");
			System.out.println("Elige la opcion deseada");
			int opcionWeb = teclado.nextInt();
			teclado.nextLine();
			
			System.out.println("Es desarrollador celular ?");
			System.out.println("1. si");
			System.out.println("2. no");
			System.out.println("Elige la opcion deseada");
			int opcionCelular = teclado.nextInt();
			teclado.nextLine();
			
			if (opcionJava == 1){
				arrayJava[k] =  nomDes;
				k=k+1;
				//desa.javaDesarrolladores(nomDes);
			}
			if (opcionWeb == 1){
				arrayWeb[j] =  nomDes;
				j=j+1;
				//desa.webDesarrolladores(nomDes);
			}
			if (opcionCelular == 1){
				arrayCel[m] =  nomDes;
				m=m+1;
				//desa.celularesDesarrolladores(nomDes);
			}
			
		}
		while (seguirPrograma2 == true){
		for ( int e = 0; e < numeroUsuarios; e++){
			desa.javaDesarrolladores(arrayJava[e]);
			desa.webDesarrolladores(arrayWeb[e]);
			desa.celularesDesarrolladores(arrayCel[e]);
		}
		System.out.println("Que desea mostrar ?");
		System.out.println("1. Experiencia Java, Web y Celulares");
		System.out.println("2. Experiencia en Java, pero no Web");
		System.out.println("3. Experiencia Web y Celulares y no Java");
		System.out.println("4. Experiencia Web o Celulares y no Java");
		System.out.println("5. Si es subconjunto");
		System.out.println("6. Mostrar Conjunto mas Grande");
		System.out.println("7. Mostrar Conjunto Ordenado");
		System.out.println("Elige la opcion deseada");
		int opcionMostrar = teclado.nextInt();
		teclado.nextLine();
			if (opcionMostrar == 1){
				desa.interseccionTodos();
			}
			if (opcionMostrar == 2){
				desa.interseccionTipo2();
			}
			if (opcionMostrar == 3){
				desa.interseccionTipo3();
			}
			if (opcionMostrar == 4){
				desa.interseccionTipo4();
			}
			if (opcionMostrar == 5){
				desa.subConjunto();
			}
			if (opcionMostrar == 6){
				desa.imprimir ();
			}
			if (opcionMostrar == 7){
				desa.ordenado();
			}
			System.out.println("Desea salir del programa ?");
			System.out.println("1. si");
			System.out.println("2. Elegir otra opcion");
			int opcionSalida= teclado.nextInt();
			teclado.nextLine();	
			if (opcionSalida == 1){
				seguirPrograma2 = false;
			}	
		}
		
		
	}	
}

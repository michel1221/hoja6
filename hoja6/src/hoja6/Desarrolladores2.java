/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja6;
import java.util.Scanner;
import java.util.*;
import java.lang.*;

/**
 *
 * @author michel
 */
public class Desarrolladores2 {
    private int cont;
private Set<String> organizadorJava;
private Set<String> organizadorWeb;
private Set<String> organizadorCelu;
private Set<String> conjuntoIntersectado;
private Set<String> conjuntoIntersectado2;
private Set<String> conjuntoIntersectado3;
private Set<String> conjuntoIntersectado4;
private Set<String> conjuntoIntersectado5;
private Set<String> conjuntoIntersectado6;
private Set<String> conjuntoIntersectado7;
private String nombre;
private factoryDesarrolladores factory;
private String[] arrayOrdenado;



public Desarrolladores2(){
Scanner teclado = new Scanner(System.in);
cont=0;
nombre= "";
int numero= 1;
factory= new factoryDesarrolladores();
organizadorJava= factory.getSet(numero);
organizadorCelu= factory.getSet(numero);
organizadorWeb=  factory.getSet(numero);
conjuntoIntersectado= factory.getSet(numero);
conjuntoIntersectado2=factory.getSet(numero);
conjuntoIntersectado3=factory.getSet(numero);
conjuntoIntersectado4=factory.getSet(numero);
conjuntoIntersectado5=factory.getSet(numero);
conjuntoIntersectado6=factory.getSet(numero);
conjuntoIntersectado7=factory.getSet(numero);


}

public void javaDesarrolladores (String nombre){
	
	organizadorJava.add(nombre);
}

public void celularesDesarrolladores(String nombre){
	
	organizadorCelu.add(nombre);
}

public void webDesarrolladores (String nombre){
	
	organizadorWeb.add(nombre);
}

public void interseccionTodos (){
	
	conjuntoIntersectado= organizadorJava;
	conjuntoIntersectado2 = organizadorCelu;
	conjuntoIntersectado3 = organizadorWeb;
	conjuntoIntersectado.retainAll(conjuntoIntersectado2);
	conjuntoIntersectado.retainAll(conjuntoIntersectado3);
	System.out.println("Desarrolladores de todo:");
	for (Object o : conjuntoIntersectado){
		//if (o.compareTo(null) =! 0)
			System.out.println(o);
		//}
	}
}

public void interseccionTipo2 (){
	conjuntoIntersectado2= organizadorJava;
	conjuntoIntersectado3 = organizadorWeb;
	conjuntoIntersectado= organizadorCelu;
	conjuntoIntersectado2.removeAll(conjuntoIntersectado3);
	System.out.println("Desarrolladores Java no Web:");
	for (Object o : conjuntoIntersectado2){
		//if (o.compareTo(null) =! 0)
			System.out.println(o);
		//}
	}
}

public void interseccionTipo3 (){
	conjuntoIntersectado3 = organizadorCelu;
	conjuntoIntersectado5= organizadorJava;
	conjuntoIntersectado6 = organizadorWeb;
	conjuntoIntersectado3.retainAll(conjuntoIntersectado6);
	conjuntoIntersectado3.removeAll(conjuntoIntersectado5);
	System.out.println("Desarrolladores Web y Celulares pero no java:");
	for (Object o : conjuntoIntersectado3){
		//if (o.compareTo(null) =! 0)
			System.out.println(o);
		//}
	}
}
public void interseccionTipo4 (){
	
	conjuntoIntersectado4= organizadorCelu;
	conjuntoIntersectado5= organizadorJava;
	conjuntoIntersectado6 = organizadorWeb;
	conjuntoIntersectado4.addAll(conjuntoIntersectado6);
	conjuntoIntersectado4.removeAll(conjuntoIntersectado5);
	System.out.println("Desarrolladores Web o Celulares");
	for (Object o : conjuntoIntersectado4){
		//if (o.compareTo(null) =! 0)
			System.out.println(o);
		//}
	}
}
public void subConjunto(){
	conjuntoIntersectado5= organizadorWeb;
	conjuntoIntersectado6= organizadorJava;
	conjuntoIntersectado= organizadorCelu;
	boolean sub = conjuntoIntersectado5.containsAll(conjuntoIntersectado6);
	if (sub == true){
		System.out.println("Es true");
	}
	else{
		System.out.println("Es false");
	}
	
}
public Set mayor (){
	int num1 = organizadorJava.size();
	int num2 = organizadorCelu.size();
	int num3 = organizadorWeb.size();
	
	if ( num1> num2 && num1>num3){
			return organizadorJava;
		}
	if (num2> num1 && num2>num3){
		    return organizadorCelu;
	}
	if (num3> num1 && num3>num2){
			return organizadorWeb;
	}
	else{
		return null;
	}
	
}
public void imprimir (){
        int num1 = organizadorJava.size();
	int num2 = organizadorCelu.size();
	int num3 = organizadorWeb.size();
	
	if ( num1> num2 && num1>num3){
		for (Object o : organizadorJava){
		
			System.out.println(o);
		
	}
		}
	if (num2> num1 && num2>num3){
		   for (Object o : organizadorCelu){
		
			System.out.println(o);
		
	}
	}
	if (num3> num1 && num3>num2){
             for (Object o : organizadorWeb){
		
			System.out.println(o);
		
	}
	}
	
}


public void ordenado(){
	conjuntoIntersectado6 = mayor();
	TreeSet sortedSet = new TreeSet<String>(conjuntoIntersectado6);
	
	for (Object o : sortedSet){
		//if (o.compareTo(null) =! 0)
			System.out.println(o);
		//}
	}
	//return sortedSet;
}
}
    

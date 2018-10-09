package uF4.trabajos.A2_03_10_2018._02;

import java.util.Scanner;

public class Persona {
	
	private String clave;
	private String nombre, apellido;
	private int edad, identificador;
	
	
	//CONSTRUCTOR
	public Persona(int identificador, String nombre, String apellido, int edad) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	
	//GETTERS
	public String getClave() {
		return clave;
	}

	public int getEdad() {
		return edad;
	}
	
	public int getIdentificador() {
		return identificador;
	}


	//SETTERS
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	@Override
	public String toString() {
		return "\nIdentificador: " + identificador + 
			   "\nNombre: " + nombre +
			   "\nApellidos: " + apellido +
			   "\nEdad: " + edad;
	}
	
	
	
	//------------------------------------------------------------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------------------------------------------------------------
		
	// Esto es para mostrar el menú de opciones.
	public static int menu() {
		
		System.out.println("\n\n\n");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("||||||||||||||||||||SISTEMA|||||||||||||||||||");
		System.out.println();
		System.out.println("1. Crear un usuario.\n" + 
						   "2. Verificar edad o modificarla.\n" + 
						   "3. Consultar identificador de usuario.\n" +
						   "4. Modificar la clave de usuario.\n" + 
		    			   "0. Salir.");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int dato;
		do {
				System.out.print("\nElija un opción: ");  // Controla que solo se ingrese una de las 4 opciones.
				dato = sc.nextInt();
		}while(dato > 5);
		
		return dato;
	}
	//-----------------------------------------------------------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------------------------------------------------------------

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


/*
A2.2 Persona (public / private / protected / sin nada).
Diseñar una clase Persona que tenga un identificador de usuario en un sistema, un nombre y apellidos reales, una edad y una clave 
de acceso. Debe diseñar y programar la clase Java y sus operaciones de forma que:

1 [X] La edad se puede consultar y modificar en cualquier momento.
2 [X] Se puede consultar el identificador de usuario en cualquier momento, pero no se puede cambiar en ningún caso.
3 [X] No nos interesa conocer el nombre y apellidos reales.
4 [] Sólo se puede cambiar la clave para una nueva. No se puede saber la clave antigua.

*/
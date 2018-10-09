package uF4.trabajos.A2_03_10_2018._02;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int respuesta, /*cambioEdad,*/ edad, identificador;  // Representa la opcion elegida, la edad, el cambio de edad y el identificador.
		String clave = "", siNo = "", nuevaClave = "";  // Respuesta para cambiar la edad y la clave.
		String nombre, apellido;  //Nombres de usuario.
		Persona persona = null;  //Objeto persona.
		
		do {
			respuesta = Persona.menu();  // Llama al menu de opciones devolviendo un valor entero.
			
			switch(respuesta){
			
			case 1: 
				 // Crea un usuario con todos sus datos y clave.
				System.out.print("\nIdentificador de usuario: ");
				identificador = Integer.parseInt(sc.nextLine());  // se realiza un casting de datos
				
				System.out.print("Nombre de usuario: ");
				nombre = sc.nextLine();
				
				System.out.print("Apellido de usuario: ");
				apellido = sc.nextLine();
				
				System.out.print("Edad del usuario: ");
				edad = Integer.parseInt(sc.nextLine());  // se realiza un casting de datos
				
				System.out.print("Clave para el usuario: ");
				clave = sc.nextLine();
				
				persona = new Persona(identificador, nombre, apellido, edad);  // Se crea un objeto de tipo persona.
				persona.setClave(clave); // se asigna una clave al usuario.
				
				System.out.println("\n!!!USUARIO CREADO¡¡¡");
				System.out.println(persona.toString());
				break;
				
			case 2:
				System.out.println("\nEdad del usuario: " + persona.getEdad() + " años");
				
				System.out.print("\nDesea modificar la edad --> 'S' o 'N': ");				
				siNo = sc.nextLine();
				
				if(siNo.equalsIgnoreCase("s")) {
					System.out.print("Ingrese nueva edad: ");
					edad = Integer.parseInt(sc.nextLine());
					persona.setEdad(edad);
				}				
				break;
			
			case 3:
				System.out.println("\nIdentificador del usuario: " + persona.getIdentificador());
				break;
			
			case 4:		
				System.out.print("\nIngrese nueva clave: ");
				nuevaClave = sc.nextLine();
				
				if(nuevaClave.equals(persona.getClave())) {
					System.out.println("Elija otra clave");
				}
				else{
					persona.setClave(nuevaClave);
					System.out.println("Clave modificada.");
				}	
				break;
		}
			
		}while(respuesta != 0);

	}
}



/*
A2.2 Persona (public / private / protected / sin nada).
Diseñar una clase Persona que tenga un identificador de usuario en un sistema, un nombre y apellidos reales, una edad y una clave 
de acceso. Debe diseñar y programar la clase Java y sus operaciones de forma que:

1 [X] La edad se puede consultar y modificar en cualquier momento.
2 [X] Se puede consultar el identificador de usuario en cualquier momento, pero no se puede cambiar en ningún caso.
3 [X] No nos interesa conocer el nombre y apellidos reales.
4 [x] Sólo se puede cambiar la clave para una nueva. No se puede saber la clave antigua.

*/
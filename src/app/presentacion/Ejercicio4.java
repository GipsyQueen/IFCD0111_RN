package app.presentacion;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4. Construir un programa en Java que permita encontra el n�mero mayor
		// y �l n�mero menor de una serie de n�meros ingresados por tecclado, como 
		// primera entrada se le dar� el tama�o del arreglo y luego los datos, tambi�n
		// se debe indicar cuantas veces se repiten tanto el mayor como el menor.
		
		// Declaraci�n de variables
		Scanner scan= new Scanner (System.in);
		int cant; // Valor que representa el n�mero de elementos a introducir
		int mayor; // Variable que usaremos de contenedor en un bucle para introducir el n�mero m�s alto
		int menor; // Variable que usaremos de contenedor en un bucle para introducir el n�mero m�s bajo
		
		// Pedir por consola que el usuario introduzca los n�meros
		System.out.println("�Cuantas cifras desea examinar? ");
		cant=scan.nextInt();
		
		// Array donde iremos guardando los n�mero introducidos por teclado
		int [] array = new int[cant]; 
		
		// Bucle for para introducir los datos 
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduzca el n�mero "+(i+1)+": ");
			array[i]=scan.nextInt();	
		}
		// Igualamos las variables de comparaci�n a la primera posici�n de la Array
		
		mayor=menor=array[0];
		
		// Bucle for para recorrer la Array y comparar los valores
		for (int i = 0; i < array.length; i++) {
			if (array[i]>mayor) {
				mayor=array[i];
			} 
			if (array[i]<menor) {
				menor=array[i];
			}
		}
		
		// Creamos variables para conocer el n�mero de repeticiones y las igualamos a 0
		int repMax=0;
		int repMin=0;
		
		// Con un bucle for-each recorremos el Array para ver si existen repeticiones de
		// nuestros n�meros mayor y menor.
		for (int e : array) {
			if (e==mayor) {
				repMax++;
			}if (e==menor) {
				repMin++;
			}
		}

		// Mostrar los datos por consola
		System.out.println("El n�mero mayor es "+ mayor+ " y se repite "+repMax+ " veces.");
		System.out.println("El n�mero menor es "+ menor+" y se repite "+repMin+" veces.");
	}

}

package app.presentacion;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. En un main prograar para evaluar el valor de un número, escribir en la consola si es negativo, si es positivo, o si es igual a cero. 
		
		Scanner scan= new Scanner (System.in);
		int cifra=0;
		System.out.println("Escriba un número: ");
		cifra=scan.nextInt();
		
		// Estructura Ifelse para evaluar el valor del número
		
		if (cifra>0) {
			System.out.println("El número introducido es positivo.");
		} else {
			if (cifra<0) {
				System.out.println("El número introducido es negativo.");
			} else {
				System.out.println("El número introducido es 0.");
			}
		}
	}

}

package app.presentacion;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. En un main programar para mostrar en base a un número, una descripción.
		
		Scanner scan= new Scanner (System.in);
		int opcion;
		
		System.out.println("Elija el tipo de automovil que quiere alquilar: "+
				"\n 1- Microcoche"+
				"\n 2- Automóvil compacto"+
				"\n 3- Automóvil ultracompacto"+
				"\n 4- Automóvil familiar"+
				"\n 5- Vehículo de lujo"+
				"\n 6- Automóvil deportivo"+
				"\n 7- Descapotable"+
				"\n 8- Todoterreno");
		
		opcion=scan.nextInt();
		
		// Estructura Switch para mostrar las distintas opciones
		switch (opcion) {
		case 1:
			System.out.println("Ha elegido el modelo MICROCHE");	
			break;
		case 2:
			System.out.println("Ha elegido el modelo AUTOMÓVIL COMPACTO");	
			break;
		case 3:
			System.out.println("Ha elegido el modelo AUTOMÓVIL ULTRACOMPACTO");	
			break;
		case 4:
			System.out.println("Ha elegido el modelo AUTOMÓVIL FAMILIAR");	
			break;
		case 5:
			System.out.println("Ha elegido el modelo VEHÍCULO DE LUJO");	
			break;
		case 6:
			System.out.println("Ha elegido el modelo AUTOMÓVIL DEPORTIVO");	
			break;
		case 7:
			System.out.println("Ha elegido el modelo DESCAPOTABLE");	
			break;
		case 8:
			System.out.println("Ha elegido el modelo TODOTERRENO");	
			break;
		default:
			break;
		}

	}

}

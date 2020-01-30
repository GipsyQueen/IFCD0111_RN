package app.presentacion;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5. Crear la cadena de texto: "Nunca mates una mosca sobre la cabeza de un tigre."
			
		String text="Nunca mates una mosca sobre la cabeza de un tigre.";
		
			//-Mostrar la cadena toda en mayusculas
		System.out.println(text.toUpperCase());
			//-Mostrar la cadena en minisculas
		System.out.println(text.toLowerCase());
			//-Mostrar solo la palabra "Nunca"
		System.out.println(text.substring(0, 5));
			//-Mostrar solo la palabra mosca
		System.out.println(text.substring(16, 21));
			//-Mostrar solo la palabra cabeza
		System.out.println(text.substring(31, 37));
		    //-Mostrar la posición de la letra primera m
		System.out.println(text.indexOf('m'));
		    //-Devolver la longitud de la cadena 
		System.out.println(text.length());
	}

}

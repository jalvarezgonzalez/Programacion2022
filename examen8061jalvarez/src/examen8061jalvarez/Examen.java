package examen8061jalvarez;


import java.util.*;
public class Examen {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public void cuentaVocales() {
		//INTRODUCIMOS UNA CADENA DE CARACTERES
	String cadena = "TWRAGZYFPDXBNJMSQVHLCKE";
	//CONTADOR DE APARICIONES
	int contadora = 0;
	int contadorb = 0;
	int contadorc = 0;
	int contadord= 0;
	int contadore = 0;
	//reccorrer toda la cadena en busca de las vocales e ir guardando el resultado
	for (int i = 0; i <cadena.length(); i++) {
		if((cadena.charAt(i) == 'a')) {
			contadora++;
		}
		if((cadena.charAt(i) == 'e')) {
			contadorb++;
		}
		if((cadena.charAt(i) == 'i')) {
			contadorc++;
		}
		if((cadena.charAt(i) == 'o')) {
			contadord++;
		}
		if((cadena.charAt(i) == 'u')) {
			contadore++;
		}
		
		System.out.println("La palabra" + cadena + "contiene" + contadora +"a" + contadorb + "e" + contadorc + "i" + contadord + "o" + contadore + "u");
	}
	
		
	}
	public void cuentaPalabras(String frase) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la frase que desea contar:");
		frase = sc.next();
		int contador = 0;
		for (int i = 0; i<frase.length();i++) {
			if ((frase.charAt(i) == ' ')){
				contador ++;
			}
			System.out.println("La palabra" + frase + "tiene" + contador + "espacios");
		}
		
		
	}
	

}

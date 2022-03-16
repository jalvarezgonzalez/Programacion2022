package examen8061jalvarez;

import java.util.Scanner;

public class PruebaExamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		String apellido;
		int DNI;
		String letraDNI;
		String mail;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre: ");
		nombre=sc.next();
		System.out.println("Introduce el apellido: ");
		apellido= sc.next();
		System.out.println("Introduce el DNI: ");
		DNI = sc.nextInt();
		System.out.println("Introduce la letra del DNI: ");
		letraDNI = sc.next();
		System.out.println("Introduce el mail: ");
		mail = sc.next();
	
	for (int i = 0; i<nombre.length();i++) {
		if ((nombre.charAt(i) == ' ')){
			contador ++;
		}
		if (contador >= 2) {
			System.out.println("Es compuesto");
			System.out.println("Tiene" + contador + "palabras");
		}else {
			System.out.println("Es simple");
		}

}}}

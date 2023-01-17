package cadenas;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String cadena=sc.next();
		int longitud=cadena.length();
		int posMitad=longitud/2;
		char valorPosMitad=cadena.charAt(posMitad);
		String primeraMitad;
		String segundaMitad;
		primeraMitad=cadena.substring(0,posMitad);
		segundaMitad=cadena.substring(posMitad);
		System.out.println("Longitud: "+longitud);
		System.out.println("Valor medio: "+valorPosMitad);
		System.out.println("Primera mitad: "+primeraMitad);
		System.out.println("Segunda mitad: "+segundaMitad);
		
	}

}

package main.java.liceosorolla.A.Condicionales;
import java.util.Scanner;

public class Bandera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		Scanner teclado3 = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca el ancho de la bandera:");
		int ancho = teclado1.nextInt();
		
		System.out.print("Por favor, introduzca el alto de la bandera:");
		int alto = teclado2.nextInt();
		
		System.out.print("Por favor, desea el escudo bordado?");
		String texto = teclado3.next();
		
		double precioBandera = ancho * alto * 0.01;
		double precioEscudo = 0;
		
		if(texto.equals("SI")) {
			precioEscudo = 5;
		}
		
		
		System.out.println("----");
		
		System.out.println("El precio de la bandera es: " + precioBandera +"€");
		System.out.println("El total por el escudo es: " + precioEscudo + "€");
		System.out.println("Gestos de envio: 3.25€");
		
		System.out.println("----");
		double precioTotal = precioBandera + precioEscudo + 3.25;
		System.out.println("Total: " + precioTotal + "€");
		
		double precioFinal = precioTotal * 1.21;
		System.out.println("----");
		System.out.println("Precio con IVA: " + precioFinal + "€");
		/*
		1 Pedir ancho y alto 0.01€ el cm2
		2. Pedir si escudo borbado. 5€
		3. Gastos envios 3.25€
		4. Mostrar desglose
		5. Mostrar total con IVA 21%
		*/
	}

}

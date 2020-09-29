package main.java.liceosorolla.A.Condicionales;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		float nota;
		System.out.print("Dime la nota: ");
		nota = teclado.nextFloat();
		
		
	
		if(nota<5) {
			System.out.println("Suspenso");
		}
		else if(nota==5) {
			System.out.println("Aprobado");
		}
		else if(nota==6){
			System.out.println("Bien");
		}
		else if(nota==7) {
			System.out.println("Notable");
		}
		else if(nota==8) {
			System.out.println("Notable");
		}
		else if(nota==9) {
			System.out.println("Sobresaliente");
		}
		else if(nota<11) {
			System.out.println("Sobresaliente");
		}
		
		System.out.println(nota);
		
	}

}

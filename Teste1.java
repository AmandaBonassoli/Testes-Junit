

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Teste1 {

	public static void main (String [] args) {
		// mostrar qual número é o maior

	}
	Scanner teclado = new Scanner (System.in);
	int numero1;
	int numero2;
	int numero3;
	int numero4;
	int numero5;
	int numero6;
	int numero7;
	int numero8;
	
	@Test
	public void test1() {
		System.out.println("Digite dois números: ");
		numero1 = teclado.nextInt();
		numero2 = teclado.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O primeiro número é o maior = " + numero1);
		}
		else if(numero2 > numero1) {
			System.out.println("O segundo número é o maior = " + numero2);
		} else {
			System.out.println("Os números são iguais");
		}
	}
	@Test
	public void test2() {
		System.out.println("Digite dois números: ");
		numero3 = teclado.nextInt();
		numero4 = teclado.nextInt();
		
		if(numero3 < numero4) {
			System.out.println("O primeiro número é o menor = " + numero3);
		}
		else if(numero4 < numero3) {
			System.out.println("O segundo número é o menor = " + numero4);
		} else {
			System.out.println("Os números são iguais");
		}
	}
	@Test
	public void test3() {
		System.out.println("Digite dois números: ");
		numero5 = teclado.nextInt();
		numero6 = teclado.nextInt();
		
		if(numero5 != numero6) {
			System.out.println("Os números são diferentes!!");
		}
		 else {
			System.out.println("Os números são iguais!!");
		}
	}
	@Test
	public void test4() {
		System.out.println("Digite um número positivo ou negativo: ");
		numero7 = teclado.nextInt();
		if(numero7 < 0) {
			System.out.println("O número é negativo = " + numero7);
		} else if(numero7 > 0) {
			System.out.println("O número é positivo  = " + numero7);
		} else {
			System.out.println("O número é zero = " + numero7);
		}
	}
	@Test
	public void test5() {
		System.out.println("Digite um número: ");
		numero8 = teclado.nextInt();
		if(numero8 < 0) {
			System.out.println("O número é menor que zero = " + numero8);
		} if(numero8 == 0) {
				System.out.println("O número é zero = " + numero8);
		} else if(numero7 < 50) {
			System.out.println("O número é menor que 50 = " + numero8);
		} else {
			System.out.println("O número é zero = " + numero7);
		}
	}
	

}

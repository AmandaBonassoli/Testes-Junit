

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Teste1 {

	public static void main (String [] args) {
		// mostrar qual n�mero � o maior

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
		System.out.println("Digite dois n�meros: ");
		numero1 = teclado.nextInt();
		numero2 = teclado.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O primeiro n�mero � o maior = " + numero1);
		}
		else if(numero2 > numero1) {
			System.out.println("O segundo n�mero � o maior = " + numero2);
		} else {
			System.out.println("Os n�meros s�o iguais");
		}
	}
	@Test
	public void test2() {
		System.out.println("Digite dois n�meros: ");
		numero3 = teclado.nextInt();
		numero4 = teclado.nextInt();
		
		if(numero3 < numero4) {
			System.out.println("O primeiro n�mero � o menor = " + numero3);
		}
		else if(numero4 < numero3) {
			System.out.println("O segundo n�mero � o menor = " + numero4);
		} else {
			System.out.println("Os n�meros s�o iguais");
		}
	}
	@Test
	public void test3() {
		System.out.println("Digite dois n�meros: ");
		numero5 = teclado.nextInt();
		numero6 = teclado.nextInt();
		
		if(numero5 != numero6) {
			System.out.println("Os n�meros s�o diferentes!!");
		}
		 else {
			System.out.println("Os n�meros s�o iguais!!");
		}
	}
	@Test
	public void test4() {
		System.out.println("Digite um n�mero positivo ou negativo: ");
		numero7 = teclado.nextInt();
		if(numero7 < 0) {
			System.out.println("O n�mero � negativo = " + numero7);
		} else if(numero7 > 0) {
			System.out.println("O n�mero � positivo  = " + numero7);
		} else {
			System.out.println("O n�mero � zero = " + numero7);
		}
	}
	@Test
	public void test5() {
		System.out.println("Digite um n�mero: ");
		numero8 = teclado.nextInt();
		if(numero8 < 0) {
			System.out.println("O n�mero � menor que zero = " + numero8);
		} if(numero8 == 0) {
				System.out.println("O n�mero � zero = " + numero8);
		} else if(numero7 < 50) {
			System.out.println("O n�mero � menor que 50 = " + numero8);
		} else {
			System.out.println("O n�mero � zero = " + numero7);
		}
	}
	

}

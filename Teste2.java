import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Teste2 {
	
		Scanner teclado = new Scanner(System.in);
	
	@Test
	public void test1() {
		System.out.println("Qual � o seu nome? ");
		String nome = teclado.next();
		System.out.println("Ol� " + nome);
	}

	@Test
	public void test2() {

		System.out.println("Qual � a sua idade? Digite somente n�meros!");
		int idade = teclado.nextInt();
		System.out.println("Sua idade � " + idade);
	}

	@Test
	public void test3() {

		System.out.println("Onde voc� estuda? ");
		String estudar = teclado.next();
		System.out.println("Voc� estuda em " + estudar);
	}

	@Test
	public void test4() {
		System.out.println("Onde voc� trabalha? ");
		String trabalho = teclado.next();
		System.out.println("Voc� trabalha em " + trabalho);

	}

	@Test
	public void test5() {

		System.out.println("Onde mora? ");
		String casa = teclado.next();
		System.out.println("Mora em " + casa);
		
	}

}

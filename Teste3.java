import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class Teste3 {

	Scanner teclado = new Scanner(System.in);
	
	@Test
	public void test() {
		System.out.println("Digite um n�mero: ");
		int numero = teclado.nextInt();
		int produto = numero * numero * numero * numero * numero;
		System.out.println("Produto deste n�mero em cinco vezes � = " + produto);
	}
	@Test
	public void test2() {
		System.out.println("Digite um n�mero: ");
		int numero2 = teclado.nextInt();
		if(numero2 % 2 == 0) {
			System.out.println("O n�mero � par = " + numero2);
		} else if(numero2 % 2 != 0) {
			System.out.println("O n�mero � impar = " + numero2);

		}
	}
	@Test
	public void test3() {
		System.out.println("Digite seu sexo (HOMEM OU MULHER): ");
	String sexo = teclado.next();
	System.out.println("Voc� � = " + sexo);
		
	}
	@Test
	public void test4() {
		System.out.println("Digite seu status de relacionamento: ");
	String relacionamento = teclado.next();
	System.out.println("Voc� � = " + relacionamento);
		
	}
	@Test
	public void test5() {
		System.out.println("Digite quantos filhos tem: ");
	int filhos = teclado.nextInt();
	System.out.println("Voc� tem " + filhos + " filhos");
	}
}


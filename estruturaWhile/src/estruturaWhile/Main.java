package estruturaWhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Receber um n�mero enquanto for diferente de zero e ao final mostrar
		// a soma dos numeros digitados. No while se a condi��o for falsa para
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}

		sc.close();
		System.out.println("o somat�rios dos valores lidos �: " + soma);

	}

}

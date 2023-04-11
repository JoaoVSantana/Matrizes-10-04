package Matriz4;

import java.util.Scanner;

public class questao1 {

	/*
	 * Escreva uma estrutura modular com um procedimento que recebe um parâmetro
	 * inteiro ‘n’ e que ao ser chamado imprime uma sequência de linhas como mostram
	 * as figuras a seguir, para n = 4: =========* 1 * 2 2 * 3 3 3 * 4 4 4 4 *
	 ***********
	 * 4 4 4 4 * 3 3 3 * 2 2 * 1 * =========*
	 */

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int n;
		String matriz[][];

		System.out.println("Digite um número:");
		n = leia.nextInt();

		matriz = new String[n * 2 + 3][n * 2 + 3];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (linha == 0 || linha == matriz.length - 1) {
					matriz[linha][coluna] = "=";

				}

				if (coluna == 0 || coluna == matriz[0].length - 1) {
					matriz[linha][coluna] = "*";

				}
				
				if (linha == (matriz.length - 1) / 2) {
					matriz[linha][coluna] = "*";

				}

			}
		}

		for (int linha = 1; linha < (matriz.length - 1) / 2; linha++) {
			int contador = linha;
			for (int coluna = matriz[0].length - 2; coluna > 0; coluna--) {
				if (coluna % 2 == 0 && contador > 0) {
					matriz[linha][coluna] = "" + linha;
					contador--;
				} else {
					matriz[linha][coluna] = " ";

				}
			}
		}

		for (int linha = matriz.length - 2; linha > matriz.length / 2; linha--) {
			int contadorNumero = ((matriz.length - 1) - linha);
			for (int coluna = 1; coluna < matriz[0].length - 1; coluna++) {
				if (coluna % 2 == 0 && contadorNumero > 0) {
					matriz[linha][coluna] = "" + ((matriz.length - 1) - linha);
					contadorNumero--;

				} else {
					matriz[linha][coluna] = " ";

				}
			}
		}

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				System.out.print(matriz[linha][coluna]);
			}
			System.out.println("");
		}
		leia.close();
	}

}

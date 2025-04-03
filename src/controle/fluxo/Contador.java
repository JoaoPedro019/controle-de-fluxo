package controle.fluxo;

import java.util.Scanner;

import controle.fluxo.exception.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		System.out.println("-----------------Desafio Controle de fluxo-----------------");
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = validaInteiro(terminal);
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = validaInteiro(terminal);
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException exception) {
			System.out.println("Erro: " + exception.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		} else {
			int contagem = parametroDois - parametroUm;
			for (int i =1; i <= contagem; i++)
				System.out.println("Imprimindo a " + i + "ª interação: " + i);
		}
	}
	
	public static int validaInteiro(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro:");
            }
        }
   }
}

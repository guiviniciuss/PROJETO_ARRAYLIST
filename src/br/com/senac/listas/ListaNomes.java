package br.com.senac.listas;

// Importando bibliotecas Java.

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;

public class ListaNomes {
	
	
	public static void main(String[] args) {
		
		// Variáveis.
		
		int respostaInserida = 0;
		
		
		Scanner leitorDeEntrada = new Scanner(System.in);
		
		
		// Alunos listados.
		
		ArrayList<String> nomesListados = new ArrayList<String>();
		
		
		nomesListados.add("1) - Ruan Silva");

		nomesListados.add("2) - Verônica Araújo");

		nomesListados.add("3) - Guilherme Silva");

		nomesListados.add("4) - Marcos Cavalcante");

		nomesListados.add("5) - Diana Castro");
		
		
		// Anos de nascimento listados.
		
		ArrayList<Integer> datasListadas = new ArrayList<Integer>();

		datasListadas.add(2001);

		datasListadas.add(1976);

		datasListadas.add(2000);

		datasListadas.add(1994);

		datasListadas.add(2002);
		

		
		// Início do programa.
		
		System.out.print("Número de alunos cadastrados: ");

		System.out.println(nomesListados.size());

		System.out.print("Alunos na lista:\n");

		System.out.println(Arrays.toString(nomesListados.toArray()));
		
		
		
		System.out.println("\n######### Selecione o aluno. #########\n");
		
		
		// Programa abre o teclado para inserção de resposta.
		respostaInserida = leitorDeEntrada.nextInt();
		
		
		
		// Escolha do caso dependendo da resposta.
		switch (respostaInserida) {
		
		
			// Informações no aluno 1.
			case 1:
			
				LocalDateTime anoNascimento00 = LocalDateTime.of(2001, 10, 18, 0, 0, 0);
				
				LocalDateTime dataHoje00 = LocalDateTime.now();

				long idade00 = anoNascimento00.until(dataHoje00, ChronoUnit.YEARS);
				
				
				
				System.out.println("\n######### Aluno Selecionado #########\n");
				
				System.out.println(nomesListados.get(0) +", nasceu em: " + datasListadas.get(0) + " - Hoje tem: " + idade00 + " anos de idade." );

				
				break;
				
				
			// Informações no aluno 2.	
			case 2:
				
				LocalDateTime anoNascimento01 = LocalDateTime.of(1976, 2, 1, 0, 0, 0);
				
				LocalDateTime dataHoje01 = LocalDateTime.now();
				
				long idade01 = anoNascimento01.until(dataHoje01, ChronoUnit.YEARS);
				
				
				
				System.out.println("\n######### Aluno Selecionado #########\n");
				
				System.out.println(nomesListados.get(1) +", nasceu em: " + datasListadas.get(1) + " - Hoje tem: " + idade01 + " anos de idade." );

				
				break;
				
				
			// Informações no aluno 3.	
			case 3:
				
				LocalDateTime anoNascimento02 = LocalDateTime.of(2000, 8, 16, 0, 0, 0);
				
				LocalDateTime dataHoje02 = LocalDateTime.now();

				long idade02 = anoNascimento02.until(dataHoje02, ChronoUnit.YEARS);
				
				
				
				System.out.println("\n######### Aluno Selecionado #########\n");
				
				System.out.println(nomesListados.get(2) +", nasceu em: " + datasListadas.get(2) + " - Hoje tem: " + idade02 + " anos de idade." );

				
				break;
				
				
			// Informações no aluno 4.		
			case 4:
				
				LocalDateTime anoNascimento03 = LocalDateTime.of(1994, 4, 17, 0, 0, 0);
				
				LocalDateTime dataHoje03 = LocalDateTime.now();

				long idade03 = anoNascimento03.until(dataHoje03, ChronoUnit.YEARS);
				
				
				
				System.out.println("\n######### Aluno Selecionado #########\n");
				
				System.out.println(nomesListados.get(3) +", nasceu em: " + datasListadas.get(3) + " - Hoje tem: " + idade03 + " anos de idade." );

				
				break;
				
		
			// Informações no aluno 5.
			case 5:
				
				LocalDateTime anoNascimento04 = LocalDateTime.of(2002, 5, 26, 0, 0, 0);
				
				LocalDateTime dataHoje04 = LocalDateTime.now();

				long idade04 = anoNascimento04.until(dataHoje04, ChronoUnit.YEARS);
				
				
				
				System.out.println("\n######### Aluno Selecionado #########\n");
				
				System.out.println(nomesListados.get(4) +", nasceu em: " + datasListadas.get(4) + " - Hoje tem: " + idade04 + " anos de idade." );
				
				
				break;
		
				// Programa encerra atividade.
		}
	
	}

}
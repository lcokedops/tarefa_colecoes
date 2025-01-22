package Programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TarefaColecoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dadosPessoas;
		List<Pessoa> feminino = new ArrayList<>();
		List<Pessoa> masculino = new ArrayList<>();
		
		System.out.println("Digite o nome e o sexo da pessoa, sendo o nome e o sexo separado por - e cada pessoa separada por vírgula: ");
		dadosPessoas = sc.nextLine();
		
		//Separar os dados de cada pessoa
		String[] nomesSeparados = dadosPessoas.split("[,]");
				
		//Separar o nome e o sexo
		for (String s : nomesSeparados) {
			String[] dados = s.split("[-]");
			
			//Separar pessoa pelo sexo
			if (dados[1].equals("Feminino")) {
				feminino.add(new Pessoa(dados[0], dados[1]));
			} else {
				masculino.add(new Pessoa(dados[0], dados[1]));
			}
			
		}
		
		//Ordenar as listas
		Collections.sort(feminino);
		Collections.sort(masculino);
		
		//Imprimir as duas lista ordenadas e separadas
		System.out.println("\nLista de mulheres:\n" + feminino);
		System.out.println("\nLista de homens:\n" + masculino);
	}

}

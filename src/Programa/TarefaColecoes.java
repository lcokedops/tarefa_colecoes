package Programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TarefaColecoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dadosPessoas;
		
		System.out.println("Digite o nome e o sexo da pessoa, sendo o nome e o sexo separado por - e cada pessoa separada por vírgula: ");
		dadosPessoas = sc.nextLine();
		
		String[] nomesSeparados = dadosPessoas.split("[,]");
		List<Pessoa> listaPessoas = new ArrayList<>();
		
		for (String s : nomesSeparados) {
			String[] dados = s.split("[-]");
			listaPessoas.add(new Pessoa(dados[0], dados[1]));
		}
		
		//Ordenar a lista
		Collections.sort(listaPessoas);
		
		System.out.println("\nLista de pessoas ordenada:");
		System.out.println(listaPessoas);
		
	}

}

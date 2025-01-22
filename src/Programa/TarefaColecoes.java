package Programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TarefaColecoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nomes;
		
		System.out.println("Digite os nomes separados por vírgula: ");
		nomes = sc.nextLine();
		
		String[] nomesSeparados = nomes.split("[,]");
		List<Pessoa> listaPessoas = new ArrayList<>();
		
		for (String s : nomesSeparados) {
			listaPessoas.add(new Pessoa(s));
		}
		
		//Ordenar a lista
		Collections.sort(listaPessoas);
		
		System.out.println("\nLista de pessoas ordenada:");
		System.out.println(listaPessoas);
		
	}

}

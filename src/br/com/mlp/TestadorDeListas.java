package br.com.mlp;

import java.util.ArrayList;
import java.util.Collections;

public class TestadorDeListas {
	
	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais listas";
		String aula2 = "Modelanddo a classe aula";
		String aula3 = "Trabalahndo coma cursos e sets";
		String aula4 = "Aumentando o nosso conhecimento";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		System.out.println("A primeira aula é: " + aulas.get(0));
		
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		
		aulas.forEach(aula -> {System.out.println("Percorrendo: " + aula);});
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
	}

}

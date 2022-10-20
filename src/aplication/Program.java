package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Alturas;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Alturas[] person = new Alturas[n];
		
		for (int i=0;i<person.length;i++) {
			System.out.printf("Dados da %da pessoa : %n",i+1 );
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade  = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			person[i] = new Alturas(nome, idade, altura);
		}
		
		double soma = 0.0;
		
		for (int i=0; i<person.length ; i++) {
			soma += person[i].getHeigth();
			}
		double media = soma/person.length;
		
		System.out.println();
		System.out.printf("Altura media das pessoas: %.2f%n", media);
		
		int minor = 0;
		for (int i=0;i<person.length;i++) {
			if(person[i].getAge() < 16) {
				minor ++;
			}	
		}
		
		double percent = minor*100 / person.length;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n ", percent);
		
		for (int i=0;i<person.length;i++) {
			if(person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}	
		}
		
		
		sc.close();

	}

}

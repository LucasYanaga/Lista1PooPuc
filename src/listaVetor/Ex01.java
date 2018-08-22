/*
 * Disciplina: Pogramação Orientada a Objetos
 * Aluno: Luan Magalhães
 */

import java.util.Scanner;

public class Ex01
{
	private static double rect()
	{
		Scanner in = new Scanner(System.in);
				
		System.out.print("Base do retângulo: ");
		double a = in.nextDouble();
		
		System.out.print("Altura do retângulo: ");
		double b = in.nextDouble();
		
		return a * b;
	}
	
	public static void main(String[] args)
	{		
		System.out.println("Área do retângulo é " + rect());
	}
}

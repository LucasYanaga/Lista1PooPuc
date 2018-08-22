/*
 * Disciplina: Pogramação Orientada a Objetos
 * Aluno: Luan Magalhães
*/
package listaVetor;

import java.util.Scanner;

public class Ex03 {

    static int vetorCalcula() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor que você deseja");
        int valorDesejado = scan.nextInt();

        System.out.println("");

        int vetor[] = new int[valorDesejado];

        int posicao = 0;
        for (int x = 0; x < valorDesejado; x++) {
            System.out.println("Digite o valor, do vetor POSIÇÃO: " + x);
            vetor[x] = scan.nextInt();
        }
        int menor = vetor[0];

        for (int x = 0; x < vetor.length; x++) {
            if (vetor[x] < menor) {
                menor = vetor[x];
                posicao = x;
            }
        }
        int acharPosicao = 0;

        int engana = 0;

        System.out.println("Menor valor: " + menor);
        System.out.println("Posição do menor valor: " + posicao);

        return engana;

    }

    public static void main(String[] args) {
        vetorCalcula();
    }
}

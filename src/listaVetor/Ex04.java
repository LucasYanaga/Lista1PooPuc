/*
 * Disciplina: Pogramação Orientada a Objetos
 * Aluno: Luan Magalhães
 */
package listaVetor;

import java.util.Scanner;

public class Ex04 {

    static int somaVetor() {
        Scanner scan = new Scanner(System.in);
        int engana = 0;

        int v1[] = new int[10];

        int v2[] = new int[10];

        int vetorGuardaSoma[] = new int[10];

        for (int x = 0; x < v1.length; x++) {
            System.out.println("Informe o valor do vetor, POSIÇÃO: " + x);
            v1[x] = scan.nextInt();
        }

        System.out.println("");
        for (int y = 0; y < v2.length; y++) {
            System.out.println("Informe o valor do outro vetor, POSIÇÃO: " + y);
            v2[y] = scan.nextInt();
        }

        for (int z = 0; z < vetorGuardaSoma.length; z++) {
            vetorGuardaSoma[z] = v1[z] + v2[z];
        }

        for (int mostroSoma : vetorGuardaSoma) {
            System.out.println("Soma dos vetores: " + mostroSoma);
        }

        return engana;
    }

    public static void main(String[] args) {
        somaVetor();
    }
}

# consulta-Prova

import java.util.Scanner;
import java.util.Arrays;

public class RevisaoVetorMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ======== VETOR (ARRAY UNIDIMENSIONAL) ========
        int[] vetor = new int[5]; // cria vetor com 5 posições

        // Preenchendo o vetor com valores digitados pelo usuário
        // Exemplo de entrada: 5 2 8 1 4
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor do vetor[" + i + "]: ");
            vetor[i] = sc.nextInt();
        }

        // Imprimindo o vetor com for normal
        System.out.println("\nVetor digitado (for normal):");
        // Saída: 5 2 8 1 4 (ou o que for digitado)
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        // Imprimindo o vetor com Arrays.toString (mais rápido)
        System.out.println("\nVetor com Arrays.toString:");
        // Saída: [5, 2, 8, 1, 4]
        System.out.println(Arrays.toString(vetor));

        // Ordenando o vetor com Arrays.sort
        Arrays.sort(vetor);
        System.out.println("Vetor ordenado:");
        // Saída: [1, 2, 4, 5, 8]
        System.out.println(Arrays.toString(vetor));

        // Somando todos os elementos do vetor
        int somaVetor = 0;
        for (int num : vetor) {
            somaVetor += num;
        }
        System.out.println("Soma dos elementos do vetor: " + somaVetor);
        // Saída: 1 + 2 + 4 + 5 + 8 = 20

        // Preenchendo um vetor com valor fixo (7)
        int[] vetorPreenchido = new int[4];
        Arrays.fill(vetorPreenchido, 7);
        System.out.println("Vetor preenchido com 7: " + Arrays.toString(vetorPreenchido));
        // Saída: [7, 7, 7, 7]

        // Comparando vetores com Arrays.equals
        int[] outroVetor = {1, 2, 3, 4, 5};
        System.out.println("Vetor é igual a outroVetor? " + Arrays.equals(vetor, outroVetor));
        // Saída: false (pois vetor ordenado é [1, 2, 4, 5, 8])

        // Copiando um vetor com Arrays.copyOf
        int[] copia = Arrays.copyOf(vetor, 3);
        System.out.println("Cópia dos 3 primeiros elementos: " + Arrays.toString(copia));
        // Saída: [1, 2, 4]

        // Busca binária (requer vetor ordenado!)
        int posicao = Arrays.binarySearch(vetor, 3);
        System.out.println("Posição do número 3 (busca binária): " + posicao);
        // Saída: valor negativo (3 não existe) → ex: -3 (significa: não achou, inserir na pos 2)

        // ======== MATRIZ (ARRAY BIDIMENSIONAL) ========
        int[][] matriz = new int[2][3]; // 2 linhas, 3 colunas

        // Preenchendo a matriz com valores digitados
        // Exemplo de entrada:
        // linha 0: 10 15 2
        // linha 1: 7 6 9
        System.out.println("\nDigite os valores da matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Imprimindo a matriz
        System.out.println("Matriz digitada:");
        // Saída esperada:
        // 10 15 2
        // 7 6 9
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Soma de todos os elementos da matriz
        int somaMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                somaMatriz += matriz[i][j];
            }
        }
        System.out.println("Soma dos elementos da matriz: " + somaMatriz);
        // Saída: 10 + 15 + 2 + 7 + 6 + 9 = 49

        // Verifica se cada elemento da matriz é par ou ímpar
        System.out.println("Verificação de par/ímpar na matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j] + " é PAR");
                } else {
                    System.out.println("matriz[" + i + "][" + j + "] = " + matriz[i][j] + " é ÍMPAR");
                }
            }
        }

        // Saída (usando os valores exemplo):
        // matriz[0][0] = 10 é PAR
        // matriz[0][1] = 15 é ÍMPAR
        // matriz[0][2] = 2 é PAR
        // matriz[1][0] = 7 é ÍMPAR
        // matriz[1][1] = 6 é PAR
        // matriz[1][2] = 9 é ÍMPAR

        sc.close();
    }
}

        // ARREY SORT DECRESENTE/INVERTIDO

      //Colections
    import java.util.Arrays;
import java.util.Collections;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Integer[] numeros = {5, 2, 8, 1, 4}; // precisa ser Integer, não int

        Arrays.sort(numeros, Collections.reverseOrder()); // ordem decrescente

        System.out.println(Arrays.toString(numeros));
        // Saída: [8, 5, 4, 2, 1]
    }
}
      //Normal
import java.util.Arrays;

public class OrdemDecrescenteManual {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 4};

        Arrays.sort(numeros); // ordena crescente → [1, 2, 4, 5, 8]

        // Inverte o vetor manualmente
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(numeros));
        // Saída: [8, 5, 4, 2, 1]
    }
}


import java.util.Arrays;
public class algoritmosLinearEBinario
{
	 // retorna o índice no vetor onde está o alvo, -1 caso não encontrado
    public static int buscaLinear(int[] vetor, int alvoBuscado) {
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] == alvoBuscado)
                return alvoBuscado;
        }
        return -1;
    }

    // retorna o índice no vetor onde está o alvoBuscado, -1 caso não encontrado
    public static int buscaBinaria(int[] vetor, int alvoBuscado) {
        int posicao = Arrays.binarySearch(vetor, alvoBuscado);
        return posicao < 0 ? -1 : posicao;
    }

    public static void main(String[] args) {
        int tamanho10 = 10;
        int[] vetor10 = new int[tamanho10];
        for (int i = 0; i < tamanho10; i++) {
            vetor10[i] = i * 2; // o vetor só tem números pares
        }
        int alvoBuscado10 = 8;

        // Medindo o tempo da busca linear
        long inicioBuscaLinear10 = System.nanoTime();
        int posicaoBuscaLinear10 = buscaLinear(vetor10, alvoBuscado10);
        long tempoBuscaLinear10 = System.nanoTime() - inicioBuscaLinear10;

        // Medindo o tempo da busca binária
        long inicioBuscaBinaria10 = System.nanoTime();
        int posicaoBuscaBinaria10 = buscaBinaria(vetor10, alvoBuscado10);
        long tempoBuscaBinaria10 = System.nanoTime() - inicioBuscaBinaria10;

        // Exibindo os resultados
        System.out.printf("Linear: índice %d, tempo %d nanosegundos - Com tamanho 10\n", posicaoBuscaLinear10, tempoBuscaLinear10);
        System.out.printf("Binária: índice %d, tempo %d nanosegundos - Com tamanho 10\n", posicaoBuscaBinaria10, tempoBuscaBinaria10);
        System.out.println("-------------------------------------------------------------");
        // Espaço --------------------------------------------------------------------------------------------------------------------

        int tamanho100 = 100;
        int[] vetor100 = new int[tamanho100];
        for (int i = 0; i < tamanho100; i++) {
            vetor100[i] = i * 2; // o vetor só tem números pares
        }
        int alvoBuscado100 = 98;

        // Medindo o tempo da busca linear
        long inicioBuscaLinear100 = System.nanoTime();
        int posicaoBuscaLinear100 = buscaLinear(vetor100, alvoBuscado100);
        long tempoBuscaLinear100 = System.nanoTime() - inicioBuscaLinear100;

        // Medindo o tempo da busca binária
        long inicioBuscaBinaria100 = System.nanoTime();
        int posicaoBuscaBinaria100 = buscaBinaria(vetor100, alvoBuscado100);
        long tempoBuscaBinaria100 = System.nanoTime() - inicioBuscaBinaria100;

        // Exibindo os resultados
        System.out.printf("Linear: índice %d, tempo %d nanosegundos - Com tamanho 100\n", posicaoBuscaLinear100, tempoBuscaLinear100);
        System.out.printf("Binária: índice %d, tempo %d nanosegundos - Com tamanho 100\n", posicaoBuscaBinaria100, tempoBuscaBinaria100);
        System.out.println("-------------------------------------------------------------");
        // Espaço --------------------------------------------------------------------------------------------------------------------

        int tamanho1000 = 1000;
        int[] vetor1000 = new int[tamanho1000];
        for (int i = 0; i < tamanho1000; i++) {
            vetor1000[i] = i * 2; // o vetor só tem números pares
        }
        int alvoBuscado1000 = 998;

        // Medindo o tempo da busca linear
        long inicioBuscaLinear1000 = System.nanoTime();
        int posicaoBuscaLinear1000 = buscaLinear(vetor1000, alvoBuscado1000);
        long tempoBuscaLinear1000 = System.nanoTime() - inicioBuscaLinear1000;

        // Medindo o tempo da busca binária
        long inicioBuscaBinaria1000 = System.nanoTime();
        int posicaoBuscaBinaria1000 = buscaBinaria(vetor1000, alvoBuscado1000);
        long tempoBuscaBinaria1000 = System.nanoTime() - inicioBuscaBinaria1000;

        // Exibindo os resultados
        System.out.printf("Linear: índice %d, tempo %d nanosegundos - Com tamanho 1000\n", posicaoBuscaLinear1000, tempoBuscaLinear1000);
        System.out.printf("Binária: índice %d, tempo %d nanosegundos - Com tamanho 1000\n", posicaoBuscaBinaria1000, tempoBuscaBinaria1000);
        System.out.println("-------------------------------------------------------------");
        // Espaço --------------------------------------------------------------------------------------------------------------------
        
        int tamanho10000 = 10000;
        int[] vetor10000 = new int[tamanho10000];
        for (int i = 0; i < tamanho10000; i++) {
            vetor10000[i] = i * 2; // o vetor só tem números pares
        }
        int alvoBuscado10000 = 9998;

        // Medindo o tempo da busca linear
        long inicioBuscaLinear10000 = System.nanoTime();
        int posicaoBuscaLinear10000 = buscaLinear(vetor10000, alvoBuscado10000);
        long tempoBuscaLinear10000 = System.nanoTime() - inicioBuscaLinear10000;

        // Medindo o tempo da busca binária
        long inicioBuscaBinaria10000 = System.nanoTime();
        int posicaoBuscaBinaria10000 = buscaBinaria(vetor10000, alvoBuscado10000);
        long tempoBuscaBinaria10000 = System.nanoTime() - inicioBuscaBinaria10000;

        // Exibindo os resultados
        System.out.printf("Linear: índice %d, tempo %d nanosegundos - Com tamanho 10000\n", posicaoBuscaLinear10000, tempoBuscaLinear10000);
        System.out.printf("Binária: índice %d, tempo %d nanosegundos - Com tamanho 10000\n", posicaoBuscaBinaria10000, tempoBuscaBinaria10000);
        System.out.println("-------------------------------------------------------------");
        // Espaço --------------------------------------------------------------------------------------------------------------------

        int tamanho100000 = 100000;
        int[] vetor100000 = new int[tamanho100000];
        for (int i = 0; i < tamanho100000; i++) {
            vetor100000[i] = i * 2; // o vetor só tem números pares
        }
        int alvoBuscado100000 = 99998;

        // Medindo o tempo da busca linear
        long inicioBuscaLinear100000 = System.nanoTime();
        int posicaoBuscaLinear100000 = buscaLinear(vetor100000, alvoBuscado100000);
        long tempoBuscaLinear100000 = System.nanoTime() - inicioBuscaLinear100000;

        // Medindo o tempo da busca binária
        long inicioBuscaBinaria100000 = System.nanoTime();
        int posicaoBuscaBinaria100000 = buscaBinaria(vetor100000, alvoBuscado100000);
        long tempoBuscaBinaria100000 = System.nanoTime() - inicioBuscaBinaria100000;

        // Exibindo os resultados
        System.out.printf("Linear: índice %d, tempo %d nanosegundos - Com tamanho 100000\n", posicaoBuscaLinear100000, tempoBuscaLinear100000);
        System.out.printf("Binária: índice %d, tempo %d nanosegundos - Com tamanho 100000\n", posicaoBuscaBinaria100000, tempoBuscaBinaria100000);
        System.out.println("-------------------------------------------------------------");
        // Espaço --------------------------------------------------------------------------------------------------------------------

        int tamanho1000000 = 1000000;
        int[] vetor1000000 = new int[tamanho1000000];
        for (int i = 0; i < tamanho1000000; i++) {
            vetor1000000[i] = i * 2; // o vetor só tem números pares
        }
        int alvoBuscado1000000 = 999998;

        // Medindo o tempo da busca linear
        long inicioBuscaLinear1000000 = System.nanoTime();
        int posicaoBuscaLinear1000000 = buscaLinear(vetor1000000, alvoBuscado1000000);
        long tempoBuscaLinear1000000 = System.nanoTime() - inicioBuscaLinear1000000;

        // Medindo o tempo da busca binária
        long inicioBuscaBinaria1000000 = System.nanoTime();
        int posicaoBuscaBinaria1000000 = buscaBinaria(vetor1000000, alvoBuscado1000000);
        long tempoBuscaBinaria1000000 = System.nanoTime() - inicioBuscaBinaria1000000;

        // Exibindo os resultados
        System.out.printf("Linear: índice %d, tempo %d nanosegundos - Com tamanho 1000000\n", posicaoBuscaLinear1000000, tempoBuscaLinear1000000);
        System.out.printf("Binária: índice %d, tempo %d nanosegundos - Com tamanho 1000000\n", posicaoBuscaBinaria1000000, tempoBuscaBinaria1000000);
        System.out.println("-------------------------------------------------------------");
        // Espaço --------------------------------------------------------------------------------------------------------------------
    }

}
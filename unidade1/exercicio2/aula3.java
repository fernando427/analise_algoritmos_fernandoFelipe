import java.util.Random;

public class aula3{
    
    public static void main(String[]args){
        int tamanho = 10000000;
        int[] vetor = new int[tamanho];
        boolean encontrado = false;
        int posicaoBusca = 33;

        Random r = new Random();

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = r.nextInt(10000000);
        }

        long inicioBuscaLinear = System.nanoTime();
        for (int i = 0; i < vetor.length; i++)
            if (vetor[i] == posicaoBusca) {
                System.out.println(posicaoBusca + " está na lista");
                encontrado = true;
            }

        if (!encontrado)
            System.out.println(posicaoBusca + " não está na lista");
         long tempoBuscaLinear = System.nanoTime() - inicioBuscaLinear;

         System.out.printf("Linear: índice %d, tempo %d nanosegundos\n", posicaoBusca, tempoBuscaLinear);
    }
}
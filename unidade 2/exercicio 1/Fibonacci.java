public class Fibonacci {

    public static int fibRecursivo(int n) {
        if(n < 2) {
            return n;
        } else {
            return fibRecursivo(n-1) + fibRecursivo(n-2);
        }
    }

    public static int fibIterativo(int n) {
        int atual = 0;
        int anterior = 0;

        for(int i = 1; i <= n; i++) {
            if (i == 1) {
                atual = 1;
                anterior = 0;
            } else {
                atual += anterior;
                anterior = atual - anterior;
            }
        } 

        return atual;
    }

    public static void main(String[] args) {
        //Exercício - faça para 10, 20, 50, 100, 1000
        int n = 10;

        //Exercício - Comente sobre o tempo e uso de memória.
        long inicio1 = System.nanoTime();
        System.out.println("Recursivo: " + fibRecursivo(n));
        long tempofinal1 = System.nanoTime() - inicio1;
        System.out.printf("Tempo com 10 iterações no recursivo: %d\n", tempofinal1);

        long inicio2 = System.nanoTime();
        System.out.println("Iterativo: " + fibIterativo(n));
        long tempofinal2 = System.nanoTime() - inicio2;
        System.out.printf("Tempo com 10 iterações no iterativo: %d\n", tempofinal2);

    }
}
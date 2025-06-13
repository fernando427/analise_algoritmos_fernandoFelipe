import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ContaNomesComDicionario {
    public static void main(String[] args) {
        Map<String, Integer> contagem = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("nomes.txt"))) {
            String linha;
            
			while ((linha = reader.readLine()) != null) {
                String nome = linha.trim();
                if (nome.isEmpty())
					continue;

                //Mapear nomes e contagem
                contagem.put(nome, contagem.getOrDefault(nome, 0) + 1);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        //Exibir os nomes e valores
        for(String cont : contagem.keySet()) {
            Integer qnt = contagem.get(cont);
            System.out.println(cont + ": " + qnt);
        }
    }
}
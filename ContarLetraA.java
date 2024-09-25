import java.util.Scanner;

public class ContarLetraA {
    public static void main(String[] args) {
        // Criar o objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar ao usuário que insira uma string
        System.out.print("Informe um texto: ");
        String texto = scanner.nextLine();
        
        // Inicializar a variável de contagem
        int contagem = 0;
        
        // Converter o texto para minúsculas para contar 'a' e 'A' de forma unificada
        texto = texto.toLowerCase();
        
        // Percorrer cada caractere da string e contar as ocorrências de 'a'
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                contagem++;
            }
        }
        
        // Exibir o resultado
        if (contagem > 0) {
            System.out.println("A letra 'a' aparece " + contagem + " vez(es) no texto.");
        } else {
            System.out.println("A letra 'a' não aparece no texto.");
        }
        
        // Fechar o objeto Scanner
        scanner.close();
    }
}


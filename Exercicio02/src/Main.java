import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do arquivo
        Arquivo arquivo = new Arquivo("arquivo.txt");

        // Abre o arquivo
        arquivo.abrir();

        // Edita o arquivo
        System.out.print("Digite o texto para editar o arquivo: ");
        String texto = scanner.nextLine();
        arquivo.editar(texto);

        System.out.println("\nVisualizando as alterações:");
        arquivo.abrir();

        System.out.print("\nDigite o novo nome para o arquivo: ");
        String novoNome = scanner.nextLine();
        arquivo.renomear(novoNome);

        arquivo.limpar();

        System.out.println("\nVisualizando as alterações finais:");
        arquivo.abrir();

        scanner.close();
    }
}

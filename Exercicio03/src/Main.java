import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação dos personagens
        System.out.print("Digite o nome do Jogador 1: ");
        Personagem jogador1 = new Personagem(scanner.nextLine());
        System.out.print("Digite o nome do Jogador 2: ");
        Personagem jogador2 = new Personagem(scanner.nextLine());

        // Luta entre os personagens
        while (jogador1.estaVivo() && jogador2.estaVivo()) {
            jogador1.ataque(jogador2);
            if (jogador2.estaVivo()) {
                jogador2.ataque(jogador1);
            }
        }

        // Verifica o vencedor
        if (jogador1.estaVivo()) {
            System.out.println(jogador1.getNome() + " venceu!");
        } else {
            System.out.println(jogador2.getNome() + " venceu!");
        }

        scanner.close();
    }
}

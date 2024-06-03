import java.util.Random;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.ataque = gerarNumeroAleatorio(20, 30);
        this.defesa = gerarNumeroAleatorio(10, 15);
    }

    public void ataque(Personagem adversario) {
        int dano = this.ataque - adversario.defesa;
        if (dano > 0) {
            adversario.vida -= dano;
            if (adversario.vida < 0) {
                adversario.vida = 0;
            }
            System.out.println(this.nome + " atacou " + adversario.nome + " causando " + dano + " de dano.");
        } else {
            System.out.println(this.nome + " não conseguiu causar dano em " + adversario.nome + ".");
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNome() {
        return nome;
    }

    private int gerarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}

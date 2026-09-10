public class Jogador{

    String nome;
    int vida;
    int ataque;
    int defesa;

    public Jogador(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void atacar(Inimigo inimigo) {
        inimigo.vida = inimigo.vida - ataque;
    }
}
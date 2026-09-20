public class Inimigo {

    String nome;
    int vida;
    int ataque;
    int defesa;

    public Inimigo(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
   
  }
  public void atacar(Jogador jogador){
    jogador.vida = jogador.vida - ataque;
}
}
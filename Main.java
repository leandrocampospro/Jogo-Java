import java.util.Scanner;
        
public class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
Jogador jogador = new Jogador("Leandro", 100, 30, 30);

Inimigo inimigo = new Inimigo("Inimigo", 100, 20, 20);

        System.out.println("===JOGO JAVA===");
        System.out.println("Nome: " + jogador.nome);
        System.out.println("Vida: " + jogador.vida);
        System.out.println("Ataque: " + jogador.ataque);
        System.out.println("Defesa: " + jogador.defesa);

        System.out.println();
        System.out.println("Digite 1 para atacar:");
         int opcao = scanner.nextInt();
         if (opcao == 1) {
            System.out.println("Você escolheu atacar!");
         }
        System.out.println("=== INIMIGO===");
         System.out.println("Nome: " + inimigo.nome);
         System.out.println("Vida: " + inimigo.vida);
         System.out.println("Ataque: " + inimigo.ataque);
         System.out.println("Defesa: " + inimigo.defesa);

        System.out.println();
         System.out.println(jogador.nome + " atacou " + inimigo.nome + "!");

       jogador.atacar(inimigo);

        System.out.println("O " + inimigo.nome + " perdeu " + jogador.ataque + " de vida.");
        System.out.println("Vida restante do " + inimigo.nome + ": " + inimigo.vida);

        
    }
}

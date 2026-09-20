import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Jogador jogador = new Jogador("Leandro", 100, 30, 30);
        Inimigo inimigo = new Inimigo("Inimigo", 100, 20, 20);

        System.out.println("=== JOGO JAVA ===");
        System.out.println();

        System.out.println("Jogador: " + jogador.nome);
        System.out.println("Vida: " + jogador.vida);
        System.out.println("Ataque: " + jogador.ataque);
        System.out.println("Defesa: " + jogador.defesa);

        System.out.println();

        System.out.println("=== INIMIGO ===");
        System.out.println("Nome: " + inimigo.nome);
        System.out.println("Vida: " + inimigo.vida);
        System.out.println("Ataque: " + inimigo.ataque);
        System.out.println("Defesa: " + inimigo.defesa);

        System.out.println();
        System.out.println("=== COMBATE ===");

        while (jogador.vida > 0 && inimigo.vida > 0) {

            System.out.println();
            System.out.println("1 - Atacar");
            System.out.println("2 - Fugir");
            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();

            if (opcao == 1) {

                System.out.println();
                System.out.println(jogador.nome + " atacou " + inimigo.nome + "!");

                jogador.atacar(inimigo);

                System.out.println(
                    inimigo.nome + " perdeu " + jogador.ataque + " de vida."
                );

                System.out.println(
                    "Vida do inimigo: " + inimigo.vida
                );

                if (inimigo.vida <= 0) {
                    break;
                }

                System.out.println();
                System.out.println(inimigo.nome + " atacou " + jogador.nome + "!");

                inimigo.atacar(jogador);

                System.out.println(
                    jogador.nome + " perdeu " + inimigo.ataque + " de vida."
                );

                System.out.println(
                    "Vida do jogador: " + jogador.vida
                );

            } else if (opcao == 2) {

                System.out.println("Você fugiu do combate!");
                break;

            } else {

                System.out.println("Opção inválida!");
            }
        }

        System.out.println();

        if (jogador.vida <= 0) {
            System.out.println("=== DERROTA ===");
            System.out.println("Você foi derrotado!");

        } else if (inimigo.vida <= 0) {
            System.out.println("=== VITÓRIA ===");
            System.out.println("Você derrotou o inimigo!");
        }

        scanner.close();
    }
}
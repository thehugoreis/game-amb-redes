//guarda jogador 2
import java.util.Scanner;

class Jogador2 {
	Scanner resp = new Scanner(System.in);

	String nome;
	String sexo;
	String idade;
	int pontosJ2 = 0;

	void nome() {
	System.out.println("\nJogador 2: Qual o seu nome ou nickname?");
	nome = resp.nextLine();
	}
}

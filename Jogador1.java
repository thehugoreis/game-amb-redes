//guarda jogador 1
import java.util.Scanner;

class Jogador1 {
	Scanner resp = new Scanner(System.in);

	String nome;
	String sexo;
	String idade;
	int pontosJ1 = 0;

	void nome() {
	System.out.println("\nJogador 1: Qual o seu nome ou nickname?");
	nome = resp.nextLine();
	}
}

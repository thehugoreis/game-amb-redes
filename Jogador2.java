//guarda jogador 2
import java.util.Scanner;

class Jogador2 {
	Scanner resp = new Scanner(System.in);

	String nome;
	String sexo;
	String idade;
	int pontosJ2 = 0;

	void nome() {
	System.out.println("\nJogador 2: Qual o seu nome?");
	nome = resp.nextLine();
	}
	void sexo() {
	System.out.println("Qual seu sexo?");
	sexo = resp.nextLine();
	}
	
	void idade() {
	System.out.println("Qual a sua idade?");
	idade = resp.nextLine();
	}
}

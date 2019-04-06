import java.util.Scanner;

class perguntas {
	Scanner resp = new Scanner(System.in);

	int res;

	Jogador1 j1 = new Jogador1();
	Jogador2 j2 = new Jogador2();

	//Metodo para ao inicio do jogo perguntar o nome do jogador 2 e zerar o numero de pontos.
	void jgd1() {
		j1.nome();
		j1.pontosJ1 = 0;
	}

	//Metodo para ao inicio do jogo perguntar o nome do jogador 2 e zerar o numero de pontos.
	void jgd2() {
		j2.nome();
		j2.pontosJ2 = 0;
	}


	//perguntas jogador 1
	void aviso1() {
		System.out.println("\n" + j1.nome + " , responda as questoes corretamente e acumule pontos.");
	}

	void a1() {
		
		System.out.println("\n2 e par(a1)?");
		System.out.println("Digite [1 - sim]/[2 - nao]");
		res = resp.nextInt();

		if (res == 1) {
			j1.pontosJ1 = j1.pontosJ1 +10;
			System.out.println("\n" + j1.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j1.pontosJ1 + " pontos");
		} else {
			System.out.println("\n" + j1.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j1.pontosJ1 + " pontos");
		}
	}

	void b1() {
		
		System.out.println("\n2 e par(b1)?");
		System.out.println("Digite [1 - sim]/[2 - nao]");
		res = resp.nextInt();

		if (res == 1) {
			j1.pontosJ1 = j1.pontosJ1 +10;
			System.out.println("\n" + j1.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j1.pontosJ1 + " pontos");
		} else {
			System.out.println("\n" + j1.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j1.pontosJ1 + " pontos");
		}
	}

	void c1() {
		
		System.out.println("\n2 e par(c1)?");
		System.out.println("Digite [1 - sim]/[2 - nao]");
		res = resp.nextInt();

		if (res == 1) {
			j1.pontosJ1 = j1.pontosJ1 +10;
			System.out.println("\n" + j1.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j1.pontosJ1 + " pontos");
		} else {
			System.out.println("\n" + j1.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j1.pontosJ1 + " pontos");
		}
	}

	//Perguntas Jogador 2
	
	void aviso2() {
		System.out.println("\n"+ j2.nome + " , responda as questoes corretamente e acumule pontos.");
	}

	void a2() {
		
		System.out.println("\n2 e par(a2)?");
		System.out.println("Digite [1 - sim]/[2 - nao]");
		res = resp.nextInt();

		if (res == 1) {
			j2.pontosJ2 = j2.pontosJ2 +10;
			System.out.println("\n" + j2.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		} else {
			System.out.println("\n" + j2.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		}
	}

	void b2() {
		
		System.out.println("\n2 e par(b2)?");
		System.out.println("Digite [1 - sim]/[2 - nao]");
		res = resp.nextInt();

		if (res == 1) {
			j2.pontosJ2 = j2.pontosJ2 +10;
			System.out.println("\n" + j2.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		} else {
			System.out.println("\n" + j2.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		}
	}

	void c2() {
		
		System.out.println("\n2 e par(c2)?");
		System.out.println("Digite [1 - sim]/[2 - nao]");
		res = resp.nextInt();

		if (res == 1) {
			j2.pontosJ2 = j2.pontosJ2 +10;
			System.out.println("\n" + j2.nome + " Sua resposta esta correta" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		} else {
			System.out.println("\n" + j2.nome + " Sua resposta esta errada" + "\n" + "Voce possui:" + j2.pontosJ2 + " pontos");
		}
	}

	//Aviso final do jogo onde sera calculado o vencedor ou o empate.
	void avisoFinal() {
		System.out.println("\nO jogador vencedor foi:");
		
		if (j1.pontosJ1 > j2.pontosJ2) {

			System.out.println("Parabens " + j1.nome + " voce eh o vencedor(a) com " + j1.pontosJ1 + " pontos.\nContra " + j2.pontosJ2 + " pontos do seu adeversario(a) " + j2.nome + ".");

		} else if (j2.pontosJ2 > j1.pontosJ1) {

			System.out.println("Parabens " + j2.nome + " voce eh o vencedor(a) com " + j2.pontosJ2 + " pontos.\nContra " + j1.pontosJ1 + " pontos do seu adeversario(a) " + j1.nome + ".");

		} else if (j1.pontosJ1 == j2.pontosJ2) {
			System.out.println("Paraens " + j1.nome + " e " + j2.nome + ",voce terminaram empatados.\n" + j1.nome + " com " + j1.pontosJ1 + " pontos.\n" + j2.nome + " com " + j2.pontosJ2 + " pontos.");
		}
	}

}

//Menu inicial
//Descricao do jogo
//Como jogar

import java.util.Scanner;

class menuInicial {

	Scanner resp = new Scanner(System.in);
	int checagem = 1;
	int menuInicial = 0;
	int telaIni = 1;

	//Tela inicial do jogo. Apresenta opcoes para o jogador escolher. 
	void telaBoasvindas() {
		System.out.println("\nOla, voce inicou o jogo de perguntas e repostas.\nEscolha uma das opcoes a seguir:\n");
		System.out.println("[1]-Descricao do jogo.");
		System.out.println("[2]-Instrucoes de como jogar.");
		System.out.println("[3]-Comecar a jogar!");
		System.out.println("[4]-Sair do jogo");
		menuInicial = resp.nextInt();

		if (menuInicial == 4) {
			telaIni = 0;
			checagem = 0;
		}
	}

	//Tela onde e mostrado a descricao do jogo e seu proposito.
	void desc() {
		System.out.println("\nDescricao do jogo aqui!\n");
		System.out.println("\n\nVoltar a tela inicial? [1-Sim]/[2-Nao]");
		telaIni = resp.nextInt();

	}
	//Tela com descricoes de como jogar.
	void cjogar() {
		System.out.println("\nComo jogar aqui!");
		System.out.println("\n\nVoltar a tela inicial? [1-Sim]/[2-Nao]");
		telaIni = resp.nextInt();

	}
	//Resseta a variavel menuInicial. Fazendo o loop voltar ao metodo telaBoasvindas.
	void resetIni() {
		menuInicial = 0;
	}
	//Resset para a tela de escolha de jogadores.
	void resetTojogador() {
		menuInicial = 3;
	}

}

/*Crie um programa que veicule uma pergunta ao usuario, que possa ser
 * respondida com sim ou nao, sorteando esta pergunta dentre tres 
 * possiveis, repetindo a rotina quantas vezes o usuario desejar, e que
 * devolva certo ou errado de acordo com a resposta dada.*/

import java.util.Scanner;

class ex10 {
	public static void main (String[] args) {
		Scanner resp = new Scanner(System.in);
		Mensagem obj1 = new Mensagem();
		exnAleat2 rnd = new exnAleat2();
		perguntas pgt = new perguntas();
		Jogador1 J1 = new Jogador1();
		Jogador2 J2 = new Jogador2();
		menuInicial menIni = new menuInicial();

		int res;
		int numJogadores = 1;
		int checagem = menIni.checagem;

		while (menIni.telaIni == 1) {

			if (menIni.menuInicial == 0) {
				menIni.telaBoasvindas();
			} else if (menIni.menuInicial == 1) {
				menIni.desc();

			} else if (menIni.menuInicial == 2) {
				menIni.cjogar();

			} else if (menIni.menuInicial == 3) {

				if (checagem == 1) {
					System.out.println("\nNesta sessao jogaram [1] um jogador ou [2] dois jogadores?");
					numJogadores = resp.nextInt();

					if (numJogadores == 1) {

						while (checagem == 1) {

							pgt.jgd1();
						
							pgt.a1();
							pgt.b1();
							pgt.c1();

							System.out.println("\nDeseja jogar novamente? [1 - sim]/[2 - nao]");
							int respNjogador = resp.nextInt();

							if (respNjogador == 1) {
								System.out.println("\nOk");
							} else if (respNjogador == 2) {
								checagem = 0;
								obj1.msg();
								System.exit(0);
							} else {
								System.out.println("\nOpcao invalida");
								System.exit(0);
							}


						}

					} else if (numJogadores == 2) {

						while (checagem == 1) {

							pgt.jgd1();
							pgt.jgd2();
						
							pgt.aviso1();
							pgt.a1();
							pgt.b1();
							pgt.c1();

							pgt.aviso2();
							pgt.a2();
							pgt.b2();
							pgt.c2();

							pgt.avisoFinal();

							System.out.println("\nDesejam jogar novamente? [1 - sim]/[2 - nao]");
							int respNjogador = resp.nextInt();

							if (respNjogador == 1) {
								System.out.println("\nOk");
							} else if (respNjogador == 2) {
								checagem = 0;
								obj1.msg();
								System.exit(0);
							} else {
								System.out.println("\nOpcao invalida");
							}
						}

					} else {
						System.out.println("\nOpcao Invalida!\n");
						menIni.resetTojogador();
					}

				}

			} else {

				System.out.println("\nOpcao invalida!");
				menIni.resetIni();

			}

		}

	}
}
import java.util.Scanner;

public class Main {

		/* Black Jack Object-Oriented in Java
		@Autor Eduardo Letsch 
		*/


	public static void main (String [] args) {
	
		Scanner in = new Scanner(System.in);
	
		Dealer dealer = new Dealer();
		NonDealer player1 = new NonDealer();
	
		final int NUMMATCHES = 3;
		final int BLACKJACK = 21;
		
		System.out.println("---> Bem vindo ao Black Jack! <---");
		
		System.out.println();
		breath();
	
		System.out.println("Por quesitos de definição, será 1x1, e você será o jogador e irá até " + NUMMATCHES);
	
		breath();
		breath();
	
		System.out.println("O dealer abre o jogo. Duas cartas viradas para você, uma virada e uma escondida para o dealer.");
		System.out.println("\nO jogo vai começar.");
		
		breath();
		
		while (dealer.getPoints() < NUMMATCHES && player1.getPoints() < NUMMATCHES) {
		
		dealer.resetHand();
		player1.resetHand();
		
		breath();
	
		System.out.println("\n----> INÍCIO DE RODADA <----\n");
	
		System.out.println("\nSuas cartas: " + player1.pickCard() + " e " + player1.pickCard());
		System.out.println("Sua mão equivale a " + player1.getHand());
	
		breath();
	
		System.out.println("\nCartas do dealer: " + dealer.pickCard() + " e <Carta Oculta>");
		System.out.println("Mão do dealer equivale a " + dealer.getHand());
	
		System.out.println("---------------------------");
		breath();
	
	
	
			while (true) {
				System.out.println("\nVocê deseja pegar mais uma carta?[s/n]");
				if (player1.wishCard(in.next().toUpperCase().charAt(0)) == 'S') {
			
					System.out.println("O dealer puxou um " + player1.pickCard() + ".\nSua mão agora vale " + 
					player1.getHand());
					breath();
					
					if (player1.getHand() > BLACKJACK) {
				
						breath();
						System.out.println("\n ->Você perdeu. Ponto para o dealer");
						dealer.setPoints();
						break;
					}				
				

				} else if (player1.getHand() <= BLACKJACK) {
				
					System.out.println("\nVocê parou com a mão " + player1.getHand() + ". Agora é a vez do dealer.");
					
					System.out.println("------------------");
					breath();
					
					System.out.println("\nO dealer revelou sua carta virada. Ela vale " + dealer.pickCard()  
						+ ".\nA mão dele vale " + dealer.getHand());
					breath();
					
					while (true) {
					
						System.out.println("\nO dealer puxou uma carta. Ela vale " + dealer.pickCard());
						
						breath();
						
						System.out.println("A mão dele vale " + dealer.getHand());
						
						breath();
						
						if (dealer.getHand() > player1.getHand() && dealer.getHand() <= BLACKJACK) {
						
							System.out.println("Você perdeu! Ponto do dealer.");
							dealer.setPoints();
							break;
						} else if (dealer.getHand() > BLACKJACK) {
						
							System.out.println("\nVocê ganhou! Ponto do jogador.");
							player1.setPoints();
							break;
						}		
					}
					break;
				}
			}
			
			breath();
			System.out.println("\n\n ----> FIM DA RODADA <----");
			
			clear();	
			
			System.out.println("\n-> Placar");
			System.out.println("Jogador: " + player1.getPoints() + " / Dealer " + dealer.getPoints()); 

			breath();
			clear();
		}
		
		System.out.println("\nObrigado por jogar =]");
	}	
	
	public static void breath() {
	
		try {
			
			Thread.sleep (2000); 			 
		} catch(InterruptedException ex) { 
			
			System.out.println("\n Não deu pra dormir"); 
				
		} 
	}
	
	public static void clear() {
	
		for(int i = 0; i < 5; i++) {
		
			System.out.println();
		}
	}
	
	
}

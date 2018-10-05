import java.util.Random;

abstract class Player {


	Random rand = new Random();
	protected int hand;
	protected int points;
	protected int card;
	 
	 public Player() {
	 	
	 	this.hand = 0;
	 	this.points = 0;	
	 	this.card = 0;
	 }
	
	 
	 public int pickCard() {
	 	
	 	this.card = (rand.nextInt(10) + 1);
	 	this.hand += card;
	 		
	 	return this.card;
	 	
	 }
	 
	 public int justCard() {
	 	this.card = (rand.nextInt(10) + 1);
	 	return this.card;
	 }
	 
	 public void setHand(int arg0) {
	 	
	 	this.hand += arg0;
	 }
	 
	 public int getHand() {
	 	
	 	return this.hand;
	 }

	public void setPoints() {
	 	
	 	this.points++;
	 }
	 
	 public int getPoints() {
	 	
	 	return this.points;
	 }
	 
	 public char wishCard(char arg) {
	 
	 	return arg;
	 }
	 
	 public void resetHand() {
	 
	 	this.hand = 0;
	 }

	
}

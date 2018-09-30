import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RankTrioLevel extends EqualPairLevel{

	// TRIO LEVEL: The goal is to find, on each turn, three cards with the same rank
	//Creates JLabel for score
	JLabel scorelabel=new JLabel();
	//Variables to help finish the game
	private ArrayList<Integer> Card = new ArrayList<Integer>();
	private ArrayList<Integer> Temp = new ArrayList<Integer>();
	int cardRank=0;

	protected RankTrioLevel(TurnsTakenCounterLabel validTurnTime, JFrame mainFrame) {
		super(validTurnTime, mainFrame);
		super.turnsTakenCounter.setDifficultyModeLabel("Trio Level");
		cardsToTurnUp = 3;
		cardsPerRow = 10;
		rowsPerGrid = 5;
	}

	@Override
	protected void makeDeck() {
		// In Trio level the grid consists of distinct cards, no repetitions
		ImageIcon cardIcon[] = this.loadCardIcons();

		//back card
		ImageIcon backIcon = cardIcon[TotalCardsPerDeck];

		int cardsToAdd[] = new int[getRowsPerGrid() * getCardsPerRow()];
		for(int i = 0; i < (getRowsPerGrid() * getCardsPerRow()); i++)
		{
			cardsToAdd[i] = i;
		}

		// randomize the order of the deck
		this.randomizeIntArray(cardsToAdd);

		// make each card object
		for(int i = 0; i < cardsToAdd.length; i++)
		{
			// number of the card, randomized
			int num = cardsToAdd[i];
			// make the card object and add it to the panel
			String rank = cardNames[num].substring(0, 1);
			String suit = cardNames[num].substring(1, 2);
			//Changes from Char String to number String
			if(rank.equals("t")){
				Card.add(10);				
			}

			else if(rank.equals("j")){
				Card.add(11);	

			}

			else if(rank.equals("q")){
				Card.add(12);	

			}
			else if(rank.equals("k")){
				Card.add(13);	

			}
			else if(rank.equals("a")){
				Card.add(14);	

			}

			else{
				Card.add((int) Integer.valueOf(rank));	

			}

			this.grid.add( new Card(this, cardIcon[num], backIcon, num, rank, suit));

		}
	}

	@Override
	protected boolean addToTurnedCardsBuffer(Card card) {
		// add the card to the list
		this.turnedCardsBuffer.add(card);
		if(this.turnedCardsBuffer.size() == getCardsToTurnUp())
		{
			// We are uncovering the last card in this turn
			// Record the player's turn
			this.turnsTakenCounter.increment();
			// get the other card (which was already turned up)
			Card otherCard1 = (Card) this.turnedCardsBuffer.get(0);
			Card otherCard2 = (Card) this.turnedCardsBuffer.get(1);
			if((card.getRank().equals(otherCard1.getRank())) && (card.getRank().equals(otherCard2.getRank()))) {
				// Three cards match, so remove them from the list (they will remain face up)
				//Adds score
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				//Game Finisher
				int rank = 0;
				if(card.getRank().equals("t")){
				rank=10;				
				}

				else if(card.getRank().equals("j")){
					rank=11	;

				}

				else if(card.getRank().equals("q")){
					rank=12;	

				}
				else if(card.getRank().equals("k")){
					rank= 13;	

				}
				else if(card.getRank().equals("a")){
					rank = 14;	

				}

				else{
					rank=((int) Integer.valueOf(card.getRank()));	

				}

				int counter1=0;
				int counter2=0;
				boolean gameOver = false;
				
				for (int i=0; i< this.Card.size(); i++){
					if(Card.get(i)== rank && counter1< 3){
						Card.remove(i);
						counter1++;
					}

				}
				
				this.Temp = this.Card;
				for(int element: this.Card){
					for(int second: this.Temp){
						if (element==second){
							counter2++;
						}
					}
					counter2--;
					if(counter2>= 3){
						gameOver=true;
					}
					counter2=0;
				}
					
				this.turnedCardsBuffer.clear();
				if(!gameOver){
					String gameEnded= "No more trios, Game Ended";
					JOptionPane.showMessageDialog(null, gameEnded);
				}
			}
			else 
			{
				// The cards do not match, so start the timer to turn them down
				substractScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnDownTimer.start();
			}
		}
		return true;
	}
	public void addScore(int score) {
		if(this.turnedCardsBuffer.get(0).getRank().equals("t")){
			this.score=this.score+100+30;}

		else if(this.turnedCardsBuffer.get(0).getRank().equals("j")){
			this.score=this.score+100+33;

		}

		else if(this.turnedCardsBuffer.get(0).getRank().equals("q")){
			this.score=this.score+100+36;
		}
		else if(this.turnedCardsBuffer.get(0).getRank().equals("k")){
			this.score=this.score+100+39;
		}
		else if(this.turnedCardsBuffer.get(0).getRank().equals("a")){
			this.score=this.score+100+42;
		}

		else{
			String rank=this.turnedCardsBuffer.get(0).getRank();
			this.score=this.score+100+(Integer.parseInt(rank))*3;
		}
	}

	@Override
	public void substractScore(int score) {
		if(this.score<=0){
			this.score=0;
		}
		else
			this.score=this.score-5;
	}

}

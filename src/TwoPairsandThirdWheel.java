import javax.swing.JFrame;
import javax.swing.JLabel;


public class TwoPairsandThirdWheel extends RankTrioLevel {
//Creates JLabel for the score
	JLabel scorelabel=new JLabel();
	protected static Card card1;
	protected static Card card2;
	protected static Card card3;
	protected static Card card4;
	protected static Card card5;
	protected int rank0, rank1, rank2, rank3, rank4;


	protected TwoPairsandThirdWheel(TurnsTakenCounterLabel validTurnTime,JFrame mainFrame) {
		super(validTurnTime, mainFrame);
		cardsToTurnUp = 5;
		super.turnsTakenCounter.setDifficultyModeLabel("two Level");
	}

	protected boolean addToTurnedCardsBuffer(Card card) {
		// add the card to the list
		this.turnedCardsBuffer.add(card);
		if(this.turnedCardsBuffer.size() == getCardsToTurnUp())
		{
			//Uncovered Hand
			card1 = (Card) this.turnedCardsBuffer.get(0);
			card2 = (Card) this.turnedCardsBuffer.get(1);
			card3 = (Card) this.turnedCardsBuffer.get(2);
			card4 = (Card) this.turnedCardsBuffer.get(3);
			card5 = (Card) this.turnedCardsBuffer.get(4);

			
			//First Card 
			if (this.card1.getRank().equals("t")) rank0 = 10;
			else if (this.card1.getRank().equals("j")) rank0 = 11;
			else if (this.card1.getRank().equals("q")) rank0 = 12;
			else if (this.card1.getRank().equals("k")) rank0 = 13;
			else if (this.card1.getRank().equals("a")) rank0 = 1;
			else rank0 = (int)Integer.valueOf(this.card1.getRank());

			//Second Card
			if (this.card2.getRank().equals("t")) rank1 = 10;
			else if (this.card2.getRank().equals("j")) rank1 = 11;
			else if (this.card2.getRank().equals("q")) rank1 = 12;
			else if (this.card2.getRank().equals("k")) rank1 = 13;
			else if (this.card2.getRank().equals("a")) rank1 = 1;
			else rank1 = (int)Integer.valueOf(this.card2.getRank());

			//Third Card
			if (this.card3.getRank().equals("t")) rank2 = 10;
			else if (this.card3.getRank().equals("j")) rank2 = 11;
			else if (this.card3.getRank().equals("q")) rank2 = 12;
			else if (this.card3.getRank().equals("k")) rank2 = 13;
			else if (this.card3.getRank().equals("a")) rank2 = 1;
			else rank2 = (int)Integer.valueOf(this.card3.getRank());

			
			//Fourth Card
			if (this.card4.getRank().equals("t")) rank3 = 10;
			else if (this.card4.getRank().equals("j")) rank3 = 11;
			else if (this.card4.getRank().equals("q")) rank3 = 12;
			else if (this.card4.getRank().equals("k")) rank3 = 13;
			else if (this.card4.getRank().equals("a")) rank3 = 1;
			else rank3 = (int)Integer.valueOf(this.card4.getRank());

			
			//Fifth Card
			if (this.card5.getRank().equals("t")) rank4 = 10;
			else if (this.card5.getRank().equals("j")) rank4 = 11;
			else if (this.card5.getRank().equals("q")) rank4 = 12;
			else if (this.card5.getRank().equals("k")) rank4 = 13;
			else if (this.card5.getRank().equals("a")) rank4 = 1;
			else rank4 = (int)Integer.valueOf(this.card5.getRank());

			
			/////////////////////////// Compares trio with same Rank //////////////////////////////

			//posible trio con card1
			if(card1.trioSameRank(card2, card3) && card4.pairSuit(card5)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}
			else if (card1.trioSameRank(card2, card4) && card3.pairSuit(card5)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}
			else if (card1.trioSameRank(card2, card5) && card3.pairSuit(card4)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}
			else if (card1.trioSameRank(card3, card4) && card2.pairSuit(card5)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}
			else if (card1.trioSameRank(card4, card5) && card2.pairSuit(card3)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();	
			}
			else if (card1.trioSameRank(card3, card5) && card2.pairSuit(card4)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}

			//posible trio con card2
			else if (card2.trioSameRank(card3, card4) && card1.pairSuit(card5)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}
			else if (card2.trioSameRank(card3, card5) && card1.pairSuit(card4)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}
			else if (card2.trioSameRank(card5, card4) && card1.pairSuit(card3)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}

			//posible trio con card3
			else if (card3.trioSameRank(card4, card5) && card1.pairSuit(card2)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();	
			}
			/////////////////////////// Compares trio with same Suit //////////////////////////////
			
			if(card1.trioSameSuit(card2, card3) && card4.pairRank(card5)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}
			else if (card1.trioSameSuit(card2, card4) && card3.pairRank(card5)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}
			else if (card1.trioSameSuit(card2, card5) && card3.pairRank(card4)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}
			else if (card1.trioSameSuit(card3, card4) && card2.pairRank(card5)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}
			else if (card1.trioSameSuit(card4, card5) && card2.pairRank(card3)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();	
			}
			else if (card1.trioSameSuit(card3, card5) && card2.pairRank(card4)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}

			//posible trio con card2
			else if (card2.trioSameSuit(card3, card4) && card1.pairRank(card5)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}
			else if (card2.trioSameSuit(card3, card5) && card1.pairRank(card4)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}
			else if (card2.trioSameSuit(card5, card4) && card1.pairRank(card3)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
			}

			//posible trio con card3
			else if (card3.trioSameSuit(card4, card5) && card1.pairRank(card2)){
				addScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();	
			}
			else{
				// The cards do not match, so start the timer to turn them down
				substractScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnDownTimer.start();
			}

			this.turnsTakenCounter.increment();

		}
		return true;
	}

	public void addScore(int score) {
		this.score=this.score+800+this.rank0+this.rank1+this.rank2+this.rank3+this.rank4;
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

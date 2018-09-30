import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class ComboLevel extends SteelWheel implements Scoreable {
	JLabel scorelabel=new JLabel();

	protected ComboLevel(TurnsTakenCounterLabel validTurnTime, JFrame mainFrame) {
		super(validTurnTime, mainFrame);
		super.turnsTakenCounter.setDifficultyModeLabel("Combo Level");
		// TODO Auto-generated constructor stub
	}


	protected boolean addToTurnedCardsBuffer(Card card) {
		// add the card to the list
		this.turnedCardsBuffer.add(card);
		if(this.turnedCardsBuffer.size() == getCardsToTurnUp())
		{
			//Winning Hand Two Pairs and Third Wheel
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
				
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
				
			}
			else if (card1.trioSameRank(card2, card4) && card3.pairSuit(card5)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}
			else if (card1.trioSameRank(card2, card5) && card3.pairSuit(card4)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}
			else if (card1.trioSameRank(card3, card4) && card2.pairSuit(card5)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}
			else if (card1.trioSameRank(card4, card5) && card2.pairSuit(card3)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}
			else if (card1.trioSameRank(card3, card5) && card2.pairSuit(card4)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}

			//posible trio con card2
			else if (card2.trioSameRank(card3, card4) && card1.pairSuit(card5)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}
			else if (card2.trioSameRank(card3, card5) && card1.pairSuit(card4)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}
			else if (card2.trioSameRank(card5, card4) && card1.pairSuit(card3)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}

			//posible trio con card3
			else if (card3.trioSameRank(card4, card5) && card1.pairSuit(card2)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}
			/////////////////////////// Compares trio with same Suit //////////////////////////////

			if(card1.trioSameSuit(card2, card3) && card4.pairRank(card5)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}
			else if (card1.trioSameSuit(card2, card4) && card3.pairRank(card5)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}
			else if (card1.trioSameSuit(card2, card5) && card3.pairRank(card4)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}
			else if (card1.trioSameSuit(card3, card4) && card2.pairRank(card5)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}
			else if (card1.trioSameSuit(card4, card5) && card2.pairRank(card3)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}
			else if (card1.trioSameSuit(card3, card5) && card2.pairRank(card4)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}

			//posible trio con card2
			else if (card2.trioSameSuit(card3, card4) && card1.pairRank(card5)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}
			else if (card2.trioSameSuit(card3, card5) && card1.pairRank(card4)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}
			else if (card2.trioSameSuit(card5, card4) && card1.pairRank(card3)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}

			//posible trio con card3
			else if (card3.trioSameSuit(card4, card5) && card1.pairRank(card2)){
				int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (PassMove == JOptionPane.YES_OPTION){
					addScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnedCardsBuffer.clear();
				}
				else{
					this.turnDownTimer.start();
				}
			}
			else{
				// The cards do not match, so start the timer to turn them down
				substractScore(this.score);
				this.scorelabel.setText("Score: "+this.score);
				this.mainFrame.add(scorelabel);
				this.turnDownTimer.start();
			}

			this.turnsTakenCounter.increment();


			//////////////////////Winning Hand de SteelWHeel//////////////////////
			try{

				String[] WinningHandRank = new String[5];

				int[] WinningHandNumbers= new int[5];
				int suma=0;
				for (int i=0; i<5; i++){
					WinningHandRank[i] = this.turnedCardsBuffer.get(i).getRank();
					if (WinningHandRank[i].equalsIgnoreCase("a")){
						WinningHandRank[i] = "1";
					}
					else if (WinningHandRank[i].equalsIgnoreCase("t")){
						WinningHandRank[i] = "10";}
					else if (WinningHandRank[i].equalsIgnoreCase("j")){
						WinningHandRank[i] = "11";}
					else if (WinningHandRank[i].equalsIgnoreCase("q")){
						WinningHandRank[i] = "12";}
					else if (WinningHandRank[i].equalsIgnoreCase("k")){
						WinningHandRank[i] = "13";}

					this.WinningHandSuit[i] = this.turnedCardsBuffer.get(i).getSuit();



					WinningHandNumbers[i]=Integer.parseInt(WinningHandRank[i]);
					suma=WinningHandNumbers[i]+suma;

				}

				Arrays.sort(WinningHandNumbers);



				//Decide si es un Winning Hand de no serlo voltea las cartas nuevamente
				if((suma==15 && WinningHandNumbers[0]==1 &&  WinningHandNumbers[1]==2 
						&&  WinningHandNumbers[2]==3 &&  WinningHandNumbers[3]==4 &&  WinningHandNumbers[4]==5) 
						&& (this.WinningHandSuit[0].equals(this.WinningHandSuit[1])&& this.WinningHandSuit[0].equals(this.WinningHandSuit[2])
								&& this.WinningHandSuit[0].equals(this.WinningHandSuit[3])&& this.WinningHandSuit[0].equals(this.WinningHandSuit[4]))) {
					int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
					if (PassMove == JOptionPane.YES_OPTION){
						addScore2(this.score);
						this.scorelabel.setText("Score: "+this.score);
						this.mainFrame.add(scorelabel);
						this.turnedCardsBuffer.clear();
					}
					else{
						this.turnDownTimer.start();
					}
					
					
					
				}
				else 
				{
					// The cards do not match, so start the timer to turn them down
					substractScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnDownTimer.start();
				}}catch(ArrayIndexOutOfBoundsException e){
					//Cuando se gana por Two Pair and A third Wheel el array de Steel Wheel se va Out Of Bounds pero el juego continua funcionando
					System.out.print("Mouse clicked\nCard[20].turnUp()\n");
				}
			
			//////////////////Winning Hand RoyalFlush same Suit///////////////////////////////
			try{

				String[] WinningHandRank2 = new String[5];

				int[] WinningHandNumbers2= new int[5];
				int suma=0;
				for (int i=0; i<5; i++){
					WinningHandRank2[i] = this.turnedCardsBuffer.get(i).getRank();
					if (WinningHandRank2[i].equalsIgnoreCase("a")){
						WinningHandRank2[i] = "1";
					}
					else if (WinningHandRank2[i].equalsIgnoreCase("t")){
						WinningHandRank2[i] = "10";}
					else if (WinningHandRank2[i].equalsIgnoreCase("j")){
						WinningHandRank2[i] = "11";}
					else if (WinningHandRank2[i].equalsIgnoreCase("q")){
						WinningHandRank2[i] = "12";}
					else if (WinningHandRank2[i].equalsIgnoreCase("k")){
						WinningHandRank2[i] = "13";}

					this.WinningHandSuit[i] = this.turnedCardsBuffer.get(i).getSuit();



					WinningHandNumbers2[i]=Integer.parseInt(WinningHandRank2[i]);
					suma=WinningHandNumbers2[i]+suma;

				}

				Arrays.sort(WinningHandNumbers2);


				
				//Decide si es un Winning Hand de no serlo voltea las cartas nuevamente
				if((suma==47 && WinningHandNumbers2[0]==1 &&  WinningHandNumbers2[1]==10 
						&&  WinningHandNumbers2[2]==11 &&  WinningHandNumbers2[3]==12 &&  WinningHandNumbers2[4]==13) 
						&& (this.WinningHandSuit[0].equals(this.WinningHandSuit[1])&& this.WinningHandSuit[0].equals(this.WinningHandSuit[2])
								&& this.WinningHandSuit[0].equals(this.WinningHandSuit[3])&& this.WinningHandSuit[0].equals(this.WinningHandSuit[4]))) {
					int PassMove = JOptionPane.showOptionDialog(null, "Would you like to play this hand?", "Play Hand", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
					if (PassMove == JOptionPane.YES_OPTION){
						addScore2(this.score);
						this.scorelabel.setText("Score: "+this.score);
						this.mainFrame.add(scorelabel);
						this.turnedCardsBuffer.clear();
					}
					else{
						this.turnDownTimer.start();
					}
				}
				else 
				{
					// The cards do not match, so start the timer to turn them down
					substractScore(this.score);
					this.scorelabel.setText("Score: "+this.score);
					this.mainFrame.add(scorelabel);
					this.turnDownTimer.start();
				}}catch(ArrayIndexOutOfBoundsException e){
					//Cuando se gana por Two Pair and A third Wheel el array de Steel Wheel se va Out Of Bounds pero el juego continua funcionando
					System.out.print("Mouse clicked\nCard[20].turnUp()\n");
				}
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
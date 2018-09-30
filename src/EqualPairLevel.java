import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EqualPairLevel extends EasyLevel implements Scoreable
{//Creates a JLabel for the score
	public int score=0;
	JLabel scorelabel=new JLabel();
	
	private int counter= 0;
	protected EqualPairLevel(TurnsTakenCounterLabel validTurnTime, JFrame mainFrame) {
		super(validTurnTime, mainFrame);
		super.turnsTakenCounter.setDifficultyModeLabel("Medium Level");


	}

	@Override
	protected boolean addToTurnedCardsBuffer(Card card) {
		this.turnedCardsBuffer.add(card);
		if(this.turnedCardsBuffer.size() == getCardsToTurnUp())
		{
			// there are two cards faced up
			// record the player's turn
			this.turnsTakenCounter.increment();
			// get the other card (which was already turned up)
			Card otherCard = (Card) this.turnedCardsBuffer.get(0);
			// the cards match, so remove them from the list (they will remain face up)
			if( otherCard.getNum() == card.getNum()){
				//adds score
				addScore(this.score);
				this.scorelabel.setText("Score: "+Integer.toString(this.score));
				this.mainFrame.add(scorelabel);
				this.turnedCardsBuffer.clear();
				
				//Tells user game is over
				this.counter= this.counter + 2;
				if (counter == this.totalUniqueCards){
					String EndMessage= "There are no more pairs, Game Ended";
					JOptionPane.showMessageDialog(null, EndMessage);

				}
			}

			// the cards do not match, so start the timer to turn them down
			else{
				//substracts the score
				substractScore(this.score);
				this.scorelabel.setText("Score: "+Integer.toString(this.score));
				this.mainFrame.add(scorelabel);
				this.turnDownTimer.start();
			}
		}
		return true;
	}

	@Override
	protected boolean turnUp(Card card) {
		// the card may be turned
		if(this.turnedCardsBuffer.size() < getCardsToTurnUp()) 
		{
			return this.addToTurnedCardsBuffer(card);
		}
		// there are already the number of EasyMode (two face up cards) in the turnedCardsBuffer
		return false;
	}

	@Override
	protected String getMode() {
		// TODO Auto-generated method stub
		return "MediumMode";
	}

	@Override
	public void addScore(int score) {
		this.score=this.score+50;
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
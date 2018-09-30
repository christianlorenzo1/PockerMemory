import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SteelWheel extends TwoPairsandThirdWheel {
//Creates an Array that holds the uncovered cards suits
protected String[] WinningHandSuit = new String[5];
JLabel scorelabel=new JLabel();

        protected SteelWheel(TurnsTakenCounterLabel validTurnTime, JFrame mainFrame) {
                super(validTurnTime, mainFrame);
                super.turnsTakenCounter.setDifficultyModeLabel("steel Level");
                cardsToTurnUp = 5;
                cardsPerRow = 10;
                rowsPerGrid = 5;
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

                        
                        //Creates a Hand array for Ranks
        
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
                                addScore(this.score);
                                this.scorelabel.setText("Score: "+this.score);
                                this.mainFrame.add(scorelabel);
                                this.turnedCardsBuffer.clear();
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
        
        public void addScore2(int score) {
                if(this.WinningHandSuit[0].equals("s")){
                        this.score=this.score+1100+73;}
                
                else if(this.WinningHandSuit[0].equals("h")){
                        this.score=this.score+1100+68;
                }
                
                else if(this.WinningHandSuit[0].equals("c")){
                        this.score=this.score+1100+63;
                }
                
                else {
                        this.score=this.score+1100+64;
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
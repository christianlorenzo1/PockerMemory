import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Instructions extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Instructions dialog = new Instructions();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Instructions() {
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Help");
		setModal(true);
		setBounds(100, 100, 713, 372);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblHowToPlay = new JLabel("How to play");
		lblHowToPlay.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHowToPlay.setBounds(10, 11, 91, 14);
		contentPanel.add(lblHowToPlay);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(20, 36, 680, 264);
		contentPanel.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Equal Pair Level", null, panel, null);
		panel.setLayout(null);

		JTextPane txtpn = new JTextPane();
		txtpn.setEditable(false);
		txtpn.setBackground(SystemColor.control);
		txtpn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpn.setText("The game consists of 8 pairs of cards. At the start of the game, every card is face " +
				"down. The object is to find all the pairs and turn them face up. Click on two cards to " +
				"turn them face up. If the cards are the same, then you have discovered a pair. The pair " +
				"will remain turned up. If the cards are different, they will flip back over automatically " +
				"after a short delay. Continue flipping cards until you have discovered all of the pairs." +
				" The game is won when all cards are face up. \r\n\r\nThe card pair needs to be of the " +
				"same suit and of the same rank.");
		txtpn.setBounds(10, 51, 655, 132);
		panel.add(txtpn);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Same Rank Trio Level", null, panel_1, null);
		panel_1.setLayout(null);

		JTextPane txtpnTheGameConsists = new JTextPane();
		txtpnTheGameConsists.setText("The game consists of a grid of distinct cards. At the start of the " +
				"game, every card is face down. The object is to find all the trios of cards with the same" +
				" rank and turn them face up. They do not have to be of the same suit, but they have to be" +
				" of the same rank.\r\n\r\nClick on three cards to turn them face up. If the cards have the" +
				" same rank, then you have discovered a trio.  The trio will remain turned up.  If the cards" +
				" are different, they will flip back over automatically after a short delay.  Continue " +
				"flipping cards until you have discovered all of the pairs.  The game is won when all cards " +
				"are face up. Each time you flip two cards up, the turn counter will increase.  Try to win " +
				"the game in the fewest number of turns!");
		txtpnTheGameConsists.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnTheGameConsists.setEditable(false);
		txtpnTheGameConsists.setBackground(SystemColor.menu);
		txtpnTheGameConsists.setBounds(10, 43, 655, 161);
		panel_1.add(txtpnTheGameConsists);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Two Pairs and a Third Wheel Level", null, panel_2, null);
		panel_2.setLayout(null);

		JTextPane txtpnTheGameConsists_1 = new JTextPane();
		txtpnTheGameConsists_1.setText("The game consists of a grid of distinct cards." +
				" At the start of the game, every card is face down. You will have to uncover five cards on each turn. A wining hand consists of" +
				" two pairs of cards with the same rank or same suits and a 5th one with a suit or rank equal to one " +
				"of the pairs. For example: (Spade 3, Spade, 5 Spade A) and (Heart6, Diamond6).");
		txtpnTheGameConsists_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnTheGameConsists_1.setEditable(false);
		txtpnTheGameConsists_1.setBackground(SystemColor.menu);
		txtpnTheGameConsists_1.setBounds(10, 31, 655, 174);
		panel_2.add(txtpnTheGameConsists_1);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Steel Wheel Level", null, panel_3, null);
		panel_3.setLayout(null);

		JTextPane txtpnTheGameConsists_2 = new JTextPane();
		txtpnTheGameConsists_2.setText("The game consists of a grid of distinct cards. At the start of the " +
				"game, every card is face down. You will have to uncover five cards on each turn." +
				" A wining hand consists of cards A-2-3-4-5 of the same distinct suit.");
		txtpnTheGameConsists_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnTheGameConsists_2.setEditable(false);
		txtpnTheGameConsists_2.setBackground(SystemColor.menu);
		txtpnTheGameConsists_2.setBounds(10, 37, 655, 188);
		panel_3.add(txtpnTheGameConsists_2);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Combo Level", null, panel_4, null);
		panel_4.setLayout(null);

		JTextPane txtpnTheGameConsists_3 = new JTextPane();
		txtpnTheGameConsists_3.setText("The game consists of a grid of distinct cards. At the start of the" +
				" game, every card is face down. You will have to uncover five cards on each turn. "+
				"There are four possible winning hands a Royal Flush of the same suit, a Straight " +
				"which include (A,2,3,4,5) of the same suit and a two pairs of cards with the same rank " +
				"or same suits and a 5th one with a suit or rank equal to one of the pairs." );
		txtpnTheGameConsists_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnTheGameConsists_3.setEditable(false);
		txtpnTheGameConsists_3.setBackground(SystemColor.menu);
		txtpnTheGameConsists_3.setBounds(10, 22, 655, 184);
		panel_4.add(txtpnTheGameConsists_3);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton closeButton = new JButton("Close");
				closeButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseReleased(MouseEvent e) {
						Instructions.this.dispose();
					}
				});
				closeButton.setActionCommand("Cancel");
				buttonPane.add(closeButton);
			}
		}
	}
}


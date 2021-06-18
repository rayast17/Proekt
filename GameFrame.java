package AlgEfficiency;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GameFrame extends JFrame implements ActionListener {

	GamePanel game;
	JButton resetButton;

	GameFrame() {

		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1300, 750);
		this.setLayout(null);

		resetButton = new JButton();
		resetButton.setText("Reset");
		resetButton.setSize(100, 50);
		resetButton.setLocation(0, 200);
		resetButton.addActionListener(this);

		game = new GamePanel();

		this.add(resetButton);
		this.add(game);
		this.setVisible(true);

	}

	@Override
	 public void actionPerformed(ActionEvent e) {
	  if(e.getSource()==resetButton) {
	   this.remove(game);
	   game = new GamePanel();
	   this.add(game);
	   SwingUtilities.updateComponentTreeUI(this);
	  }
	 }
	}









import java.awt.*;

import javax.swing.*;
public class Player {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Player");
		frame.add(new ANewPanel());
		frame.setSize(475,475);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}


}
@SuppressWarnings("serial")
class ANewPanel extends JPanel{
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.ORANGE);
		// draw oval
		g.fillOval(50,50, 300,300);
		//sets color
		g.setColor(Color.GREEN);
		//creates arc
		g.fillArc(50, 50, 300, 300, 0, 216);
		//sets color
		g.setColor(Color.BLUE);
		//creates arc
		g.fillArc(50, 50, 300, 300, 0, 108);
		//sets color
		g.setColor(Color.RED);
		//creates arc
		g.fillArc(50, 50, 300, 300, 0, 72);
		//sets color
		g.setColor(Color.BLACK);
		//creates text
		g.drawString("Quizes---10%", 200, 40);
		g.drawString("Projects---20%", 325, 100);
		g.drawString("Midterm---30%", 10, 80);
		g.drawString("Final---40%", 200, 400);		
	}
}
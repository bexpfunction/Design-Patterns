/**
 * 
 */
package main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * @author Burak Yazar
 *
 */
public class SwingObserverExample {
	JFrame frame;
	/**
	 * 
	 */
	public SwingObserverExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}

	public void go() {
		frame = new JFrame("Observe This!!!");
		JButton button = new JButton("Should I Do It?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	class AngelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it, you might regret it!");
		}
		
	}
	
	class DevilListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Come on, JUST DO IT!");
			
		}
		
	}
}

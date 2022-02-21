package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public MainFrame(String title) {
		super(title);
		
		final MainPanel mainPanel = new MainPanel();
		final Toolbar toolbar = new Toolbar();
		
		toolbar.setColorChanger(mainPanel);
		System.out.println(mainPanel);
		
		//mainPanel.changeColor(Color.red);
		
		setLayout(new BorderLayout());
		
		/* Here mainPanel instance variable is added to the Toolbar
		 * constructor as a way of passing a mainPanel object to the
		 * Toolbar object.
		 */
		add(toolbar, BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

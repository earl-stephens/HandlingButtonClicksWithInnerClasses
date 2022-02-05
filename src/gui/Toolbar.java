package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

/* Refactored these into the ColorButtonListener class
class RedButtonListener implements ActionListener {
	
	private MainPanel mainPanel;
	* An instance variable is set up to accept the mainPanel
	 * object.  The constructor takes the mainPanel object as
	 * a parameter and assigns it to this instance variable,
	 * which can then be used in the methods required.
	 *
	
	public RedButtonListener(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Red button clicked!");
		mainPanel.changeColor(Color.red);
	}
}

class BlueButtonListener implements ActionListener {
	
	private MainPanel mainPanel;
	
	public BlueButtonListener(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Blue button clicked!");
		mainPanel.changeColor(Color.blue);
	}
}
*/

public class Toolbar extends JToolBar {
	
	private static final long serialVersionUID = 1L;
	
	public Toolbar(MainPanel mainPanel) {
		/* mainPanel is passed in from the MainFrame object
		 * and then passed to the red/blue button listener
		 * objects' constructor
		 */
		
		final JButton redButton = new JButton("Red");
		final JButton blueButton = new JButton("Blue");
		
		/* addActionListener expects an argument of a class
		 * that implements the ActionListener interface
		 */
		//redButton.addActionListener(new RedButtonListener(mainPanel));
		//blueButton.addActionListener(new BlueButtonListener(mainPanel));
		
		/* Replaced the above two methods with the two below, which
		 * call a single class, and reduces duplication
		 */
		redButton.addActionListener(new ColorButtonListener(mainPanel, Color.red));
		blueButton.addActionListener(new ColorButtonListener(mainPanel, Color.blue));
		add(redButton);
		add(blueButton);
	}
}

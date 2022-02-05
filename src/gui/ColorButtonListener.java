package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorButtonListener implements ActionListener {

	private MainPanel mainPanel;
	private Color colors;
	
	public ColorButtonListener(MainPanel mainPanel, Color color) {
		this.colors = color;
		this.mainPanel = mainPanel;
	}
	
	@Override public void actionPerformed(ActionEvent e) {
		mainPanel.changeColor(colors);
	}
}

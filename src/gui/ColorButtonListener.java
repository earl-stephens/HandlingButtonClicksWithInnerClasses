package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorButtonListener implements ActionListener {

	//private MainPanel mainPanel;
	private ColorChangeListener colorChanger;
	private Color colors;
	
	public ColorButtonListener(ColorChangeListener colorChanger, Color color) {
		this.colors = color;
		this.colorChanger = colorChanger;
	}
	
	@Override public void actionPerformed(ActionEvent e) {
		colorChanger.changeColor(colors);
	}
}

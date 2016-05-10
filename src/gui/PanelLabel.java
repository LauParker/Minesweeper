package gui;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelLabel extends JPanel{
	public PanelLabel(String title) {
		this.setLayout(new FlowLayout());
		JLabel titlelb = new JLabel(title);
		this.add(titlelb);
	}
}

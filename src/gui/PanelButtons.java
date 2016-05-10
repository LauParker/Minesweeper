package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Controller;

public class PanelButtons extends JPanel{

	/**
	 * create button panel for user to start new game, place flags, change options
	 */
	public PanelButtons(){
		JButton newBtn = new JButton("View");
		JButton optionBtn = new JButton("Flag");
		this.setLayout(new FlowLayout());
		newBtn = new JButton("New");
		optionBtn = new JButton("Options");
		
		newBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.newGame();
				}
		});
		optionBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Controller.showOptions();
			}
		});
			
		this.add(newBtn);
		this.add(optionBtn);
	}	
}
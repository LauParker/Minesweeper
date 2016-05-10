package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import main.Controller;

public class GameFrame extends JFrame {

	public GameFrame() {
		this.setTitle("Mindsweeper");
		this.setJMenuBar(createFrameMenu());
		this.setSize(800, 600);
		this.getContentPane().setLayout(new BorderLayout());
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public JMenuBar createFrameMenu() {
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem exitItem = new JMenuItem("Exit");
		JMenuItem newItem = new JMenuItem("New");
		
		newItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.newGame();
			}
		});
		exitItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(DO_NOTHING_ON_CLOSE);
			}
		});

		fileMenu.add(newItem);
		fileMenu.add(exitItem);
		menuBar.add(fileMenu);
		return menuBar;
	}
	
}

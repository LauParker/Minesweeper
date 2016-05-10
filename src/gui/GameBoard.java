package gui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import main.Controller;
import object.Cell;

public class GameBoard extends JPanel {

	/**
	 * Game board constructor, used to start new games
	 */
	public GameBoard() {		
		this.setLayout(new GridBagLayout());
		for(int i = 0; i < Controller.settings.getAcross();i++) {
			for (int j = 0; j < Controller.settings.getDown();j++) {
				final int across = i;
				final int down = j;
				//Cell buttonCell = new Cell(i,j);
				Controller.gameArray[across][down] = new Cell(across,down);
				Controller.gameArray[across][down].
						addMouseListener(new MouseListener() {
						    public void mouseReleased(MouseEvent e) {
//						    	System.out.println(e.getButton());
						    	if (e.getButton() == 1) {
									Controller.buttonCellPressed(Controller.gameArray[across][down]);
						    	} else if (e.getButton() == 3) {
						    		Controller.settings.setFlag(true);
						    		Controller.buttonCellPressed(Controller.gameArray[across][down]);
						    		Controller.settings.setFlag(false);
						    	}
						    }
						    public void mousePressed(MouseEvent e) {
						    }
						    public void mouseExited(MouseEvent e) {
						    }
						    public void mouseClicked(MouseEvent e) {
						    }
							public void mouseEntered(MouseEvent e) {
							}
						});
				Controller.gameArray[across][down].
						addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
					}
				});				
				this.add(Controller.gameArray[across][down], 
						getLayoutConstraints(across, down));
			}
		}
	}
	
	/**
	 * define parameters to set out grid of buttons to play on
	 * @param setX across setting
	 * @param setY down setting
	 * @return
	 */
	private GridBagConstraints getLayoutConstraints(int setX, int setY) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = setX;
		gbc.gridy = setY;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		//gbc.insets = new Insets(1,1,1,1);
		gbc.anchor = GridBagConstraints.WEST;
		return gbc;
	}
}

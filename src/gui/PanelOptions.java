package gui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Controller;
import main.Setting;

public class PanelOptions extends JPanel{

	/**
	 * UI for changing the user settings
	 */
	public PanelOptions() {
		int xAxis = 5;
		int yAxis = 5;
		int bomb =  8;
		JPanel optionPanel = new JPanel(new GridLayout(3,2));
		JLabel bombCountLbl = new JLabel("BombCount:");
		JTextField bombCountTF = new JTextField(
				String.valueOf(Controller.settings.getBombCount()));
		JLabel acrossLbl = new JLabel("Cells across:");
		JTextField acrossTF = new JTextField(
				String.valueOf(Controller.settings.getAcross()));
		JLabel downLbl = new JLabel("Cells down:");
		JTextField downTF = new JTextField(
				String.valueOf(Controller.settings.getDown()));
		
		optionPanel.add(bombCountLbl,0);
		optionPanel.add(bombCountTF,1);
		optionPanel.add(acrossLbl,2);
		optionPanel.add(acrossTF,3);
		optionPanel.add(downLbl,4);
		optionPanel.add(downTF,5);
		int result = JOptionPane.showConfirmDialog(null, optionPanel, "Settings",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		if (result == JOptionPane.OK_OPTION) {	
			boolean accept = false;
			try {
				xAxis = Integer.parseInt(acrossTF.getText().trim());
				yAxis = Integer.parseInt(downTF.getText().trim());
				bomb = Integer.parseInt(bombCountTF.getText().trim());
				if ((bomb < ((xAxis*yAxis)-5)) && (bomb > 5) && (yAxis < 36) && (xAxis < 46)) {
					accept = true;
				}
			} catch (NumberFormatException NumberFormat) {
				NumberFormat.notifyAll();
				NumberFormat.getMessage();
				NumberFormat.printStackTrace();
				accept = false;
				Controller.showOptions();
			} finally {
				if (accept){
					Controller.settings = new Setting(xAxis,yAxis,bomb);
				} else {
					Controller.showOptions();
				}
			}
		} else {
			// user cancel, do nothing
		}
	}
}
package object;

import javax.swing.JButton;

public class Cell extends JButton{
	private boolean opened,flagged,isBomb;
	private int across,down,neighbourMine;
	
	/**
	 * construct game Cell
	 * @param x
	 * @param y
	 */
	public Cell(int x,int y){
		this.across = x;
		this.down = y;
		this.neighbourMine = 0;
		this.opened = false;
		this.flagged = false;
		this.isBomb = false;
		this.setText(" ");
		this.setSize(100, 100);
	}

	/**
	 * @return the opened
	 */
	public boolean isOpened() {
		return opened;
	}

	/**
	 * @return the flagged
	 */
	public boolean isFlagged() {
		return flagged;
	}

	/**
	 * @return the isBomb
	 */
	public boolean isBomb() {
		return isBomb;
	}

	/**
	 * @return the across
	 */
	public int getAcross() {
		return across;
	}

	/**
	 * @return the down
	 */
	public int getDown() {
		return down;
	}

	/**
	 * @return the neighbourMine
	 */
	public int getNeighbourMine() {
		return neighbourMine;
	}

	/**
	 * @param opened the opened to set
	 */
	public void setOpened(boolean opened) {
		this.opened = opened;
	}

	/**
	 * @param flagged the flagged to set
	 */
	public void setFlagged(boolean flagged) {
		this.flagged = flagged;
	}

	/**
	 * @param isBomb the isBomb to set
	 */
	public void setBomb(boolean isBomb) {
		this.isBomb = isBomb;
	}

	/**
	 * @param across the across to set
	 */
	public void setAcross(int across) {
		this.across = across;
	}

	/**
	 * @param down the down to set
	 */
	public void setDown(int down) {
		this.down = down;
	}

	/**
	 * @param neighbourMine the neighbourMine to set
	 */
	public void setNeighbourMine(int neighbourMine) {
		this.neighbourMine = neighbourMine;
	}
	
	
}

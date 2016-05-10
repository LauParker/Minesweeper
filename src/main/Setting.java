package main;

public class Setting {

	private int across, down, bombCount;
	private boolean flag, firstMove;
	/**
	 * Default Constructor
	 */
	public Setting() {
		across = 15;
		down = 15;
		bombCount = 30;
		flag = false;
		firstMove = true;
	}
	
	/**
	 * Defined constructor
	 */
	public Setting(int localAcross, int localDown, int localBomb) {
		across = localAcross;
		down = localDown;
		bombCount = localBomb;
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
	 * @return the bombcount
	 */
	public int getBombCount() {
		return bombCount;
	}

	/**
	 * @param bombcount the bombcount to set
	 */
	public void setBombCount(int bombcount) {
		this.bombCount = bombcount;
	}

	/**
	 * @return the flag
	 */
	public boolean isFlag() {
		return flag;
	}

	/**
	 * @param flag the flag to set
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	/**
	 * @return the firstMove
	 */
	public boolean isFirstMove()
	{
		return firstMove;
	}

	/**
	 * @param firstMove the firstMove to set
	 */
	public void setFirstMove(boolean firstMove)
	{
		this.firstMove = firstMove;
	}
	
}

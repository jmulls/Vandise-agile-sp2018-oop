public class Ship implements Observable {
	private int life;
	private boolean sunk;

	public Ship(int life) {
		this.life = life;
		this.sunk = false;
	}

	// TODO
	// See unit tests for what needs to be done here
	// in the observer pattern
	//
	public void update() throws Exception {
		this.hit();
	}

	public boolean isSunk() {
		return this.sunk;
	}

	public int getLife() {
		return this.life;
	}
	

	public void setLife(int life) {
		this.life = life;
	}

	public void setSunk(boolean sunk) {
		this.sunk = true;
	}

	public void hit() throws Exception {
		if (!this.sunk) {
			this.life -= 1;
			if (this.getLife() == 0) {
				this.sunk = true;
			}
		} else {
			throw new Exception("Hit on ship that's already sunk.");
		}
	}
}

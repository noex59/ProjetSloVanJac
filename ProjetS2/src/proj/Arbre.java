package proj;

public class Arbre extends Parcelle{
	public static final int val=7;
	private int x;
	private int y;
	
	@Override
	public boolean estVide() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsBox() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return val;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

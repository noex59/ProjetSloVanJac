package proj;

public class Mer extends Parcelle{
	public static int val=1;
	private boolean bateau1;
	private boolean bateau2;
	private int x;
	private int y;
	
	public Mer(int x, int y) {
		super();
		bateau1=false;
		bateau2=false;
	}
	
	@Override
	public boolean estVide() {
		if (bateau1 || bateau2)
			return false;
		return true;
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

	public int getValue() {
		if (bateau1)
			return 3;
		if (bateau2)
			return 4;
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

	public boolean getBateau1() {
		return bateau1;
	}

	public void setBateau1(boolean bateau) {
		this.bateau1 = bateau;
	}

	public boolean getBateau2() {
		return bateau2;
	}

	public void setBateau2(boolean bateau) {
		this.bateau2 = bateau;
	}
}

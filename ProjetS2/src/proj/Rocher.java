package proj;

public class Rocher extends Parcelle{
	public static final int val = 2;
	private boolean coffre;
	private boolean clef;
	private int x;
	private int y;
	
	public Rocher(int x, int y) {
		coffre=false;
		clef=false;
		this.x=x;
		this.y=y;
	}

	/**
	 * @return the coffre
	 */
	public boolean containsBox(){ return coffre; }

	/**
	 * @return the clef
	 */
	public boolean containsKey() { return clef; }

	/**
	 * @return the x
	 */
	public int getX() {	return x; }

	/**
	 * @return the y
	 */
	public int getY() {	return y; }

	/**
	 * @param coffre the coffre to set
	 */
	public void setCoffre(boolean coffre) { this.coffre = coffre; }

	/**
	 * @param clef the clef to set
	 */
	public void setClef(boolean clef) { this.clef = clef; }

	/**
	 * @param x the x to set
	 */
	public void setX(int x) { this.x = x; }

	/**
	 * @param y the y to set
	 */
	public void setY(int y) { this.y = y; }

	@Override
	public boolean estVide() { return false; }

	@Override
	public int getValue() { return val; }
	}

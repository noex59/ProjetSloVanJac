package proj;

public class Explorateur extends Personnages{
	private final static int explo1 = 6; 
	private final static int explo2 = 8;
	private boolean clef;
	private boolean tresor;
	private int x, y;
	private final boolean equipe1; // true equipe1 ; false equipe2
	
	public Explorateur(boolean equipe, int x, int y){
		
		this.setClef(false);
		this.setTresor(false);
		this.equipe1=equipe;
		this.setX(x);
		this.setY(y);
	}
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
/**
 * Méthode herité de parcelle, mais pour l'explorateur regarde s'il a le tresor et non le coffre
 */
	@Override
	public boolean containsBox() {
		// TODO Auto-generated method stub
		return tresor;
	}

	@Override
	public int getValue() {
		if(this.getEquipe())
			return explo1;
		else
			return explo2;
	}
	public boolean containsClef() {
		return clef;
	}
	
	public void setClef(boolean clef) {
		this.clef = clef;
	}

	public void setTresor(boolean tresor) {
		this.tresor = tresor;
	}
	
	/**
	 * true equipe1 ; false equipe2
	 */
	public boolean getEquipe() {
		return equipe1;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

}

package proj;

public abstract class Parcelle {
	public int x;
	public int y;
	public abstract boolean estVide();
	public abstract boolean containsKey();
	public abstract boolean containsBox();
	public abstract int getValue();

	public boolean estAccessible(Parcelle[][] jeu, int x, int y){ 
		if (x%2==0)
			return  jeu[x-1][y-1].estVide() && jeu[x][y-1].estVide() && jeu[x][y+1].estVide() && jeu[x+1][y+1].estVide() && jeu[x-1][y].estVide();
		else
			return jeu[x-1][y].estVide() && jeu[x][y-1].estVide() && jeu[x][y+1].estVide() && jeu[x+1][y].estVide() && jeu[x+1][y-1].estVide();
	}
}
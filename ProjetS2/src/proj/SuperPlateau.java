package proj;
import tps.Plateau;

public class SuperPlateau extends Plateau{

	private static String[] gifs={"images/mer.png","images/rocher.png","images/1.navire.png","images/2.navire.png","images/coffre.png","images/1.explorateur.png","images/arbre.png","images/2.explorateur.png","images/vide.png"};
	
	public SuperPlateau (int taille) {
		super(SuperPlateau.gifs, taille);
		// super(SuperPlateau.gifs, taille, true); Pour afficher boite de dialogue en dessous
	}
	
	
	public boolean deplacer (int x, int y, int a, int b) {
		Parcelle[][] test = this.getJeu();
		
		if(test[a][b].getValue() == 0){
			test[a][b] = test[x][y];
			test[x][y] = new Rien();
			return true;
		}
		else
			return false;
	 }
}

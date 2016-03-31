package proj;

import java.util.Random;

public class Ile {
	private Parcelle[][] jeu;
	
	public Ile(int taille){
		this.jeu = new Parcelle[taille][taille];
	}

	public Parcelle[][] getJeu() {
		return jeu;
	}

	public void setJeu(Parcelle[][] jeu) {
		this.jeu = jeu;
	}

	public void init(int taille, int pourcent) {
		for (int l = 0; l < taille; l++) {
			jeu[0][l]=new Mer(0,l);
		}
		for ( int k = 0; k < taille; k++){
			jeu[k][0]=new Mer(k,0);
			if (k==taille/2)
				((Mer) jeu[k][0]).setBateau1(true);
		}
		for ( int m=taille-1; m > 0; m--){
			jeu[taille-1][m]=new Mer(taille-1,m);
		}
		for ( int n=taille-1;n>0;n--){
			jeu[n][taille-1]=new Mer(n,taille-1);
			if (n==taille/2)
				((Mer) jeu[n][taille-1]).setBateau2(true);
		}
		for (int i = 1; i < taille-1; i++){
			for (int j=1; j< taille-1; j++){
				jeu[i][j]=new Rien();
			}
		}
		this.addObstacles(false, pourcent/2);
		this.addObstacles(true, pourcent/2);
		this.addCoffreClef();
	}
	
	private void addObstacles(boolean rocher, int pourcent) {
		Random alea = new Random();
			int cpt = 0;
			int x = alea.nextInt(jeu.length - 2) + 1;
			int y = alea.nextInt(jeu.length - 2) + 1;
			while (cpt <= Math.round((jeu.length- 2)*(jeu.length - 2) * (1.0*pourcent)/100)) {
				x = alea.nextInt(jeu.length - 2) + 1;
				y = alea.nextInt(jeu.length - 2) + 1;
				
				if (jeu[x][y].getValue()==2) {
					x = alea.nextInt(jeu.length - 2) + 1;
					y = alea.nextInt(jeu.length - 2) + 1;
				}else {
					if (rocher && jeu[x][y].estAccessible(jeu, x, y)){
						jeu[x][y] = new Rocher(x, y);
						cpt++;
				}else if (jeu[x][y].estAccessible(jeu, x, y)){
						jeu[x][y] = new Arbre();
						cpt++;
					}
				}
			}
			System.out.println("Rochers OK");
	}

	private void addCoffreClef() {
		int cptCoffre=0;
		int cptClef=0;
		int r;
		Random alea = new Random();
		
		for (int i = 0; i < jeu.length; i++) {
			for (int j = 0; j < jeu.length; j++) {
				r=alea.nextInt(100);
				if (jeu[i][j].getValue()==2 && cptCoffre < 1 && r<51)
				{
					((Rocher) jeu[i][j]).setCoffre(true);
					cptCoffre++;	
				}
				if( jeu[i][j].getValue()==2 && !jeu[i][j].containsBox() && cptClef < 1 && r < 51)
				{	
					((Rocher) jeu[i][j]).setClef(true);
					cptClef++;
				}
			}
		}
	}
}

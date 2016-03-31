package proj;

import javax.swing.JOptionPane;
	/**
	 * cette classe est la classe principale qui gere le jeu en graphique
	 * @author slowinsd
	 */
	public class Jeu {
		public static void main(String []args){
			int taille, pourcent, jop;
			int[] params = new int[2];
			
			jop = JOptionPane.showConfirmDialog(null, "Voulez-vous parametrer la carte ?", "Parametrages", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (jop==1) {
				taille = 10;
				pourcent = 20;
			} else if (jop == 0){
				params = parametrage();
				taille = params[0];
				pourcent = params[1];
			} else {
				JOptionPane.showMessageDialog(null, "Bonne journée");
				return;
			}
			
			SuperPlateau grille = new SuperPlateau(taille);
			Ile ile = new Ile(taille);
			ile.init(taille, pourcent);
			grille.setJeu(ile.getJeu());
			grille.affichage();
		}
	private static int[] parametrage() {
		int taille = 10;
		String reponse2;
		int pourcent = 20;
		boolean bonneRep = false;
		while(bonneRep == false){
			reponse2=JOptionPane.showInputDialog(null,"Veuillez entrer la taille de la grille : ", "Parametrages", JOptionPane.QUESTION_MESSAGE);
			if (reponse2 != null) {
				taille = Integer.parseInt(reponse2);
				if (taille>=8 && taille<=15)
					bonneRep=true;
				else
					JOptionPane.showMessageDialog(null,"Veuillez entrer un nombre entre 8 et 15 ! : "); 
			} else {
					JOptionPane.showMessageDialog(null, "Parametrage par defaut.");
					bonneRep=true;
				}
			}

		bonneRep = false;
		while(bonneRep == false){
			reponse2=JOptionPane.showInputDialog(null,"Quel pourcentage d'obstacles voulez-vous ?", "Parametrages", JOptionPane.QUESTION_MESSAGE);
			if (reponse2 != null) {
				pourcent = Integer.parseInt(reponse2);
				if (pourcent>=10 && pourcent<=40)
					bonneRep=true;
				else
					JOptionPane.showMessageDialog(null,"Veuillez entrer un nombre entre 10 et 40 : ");
			}else {
				JOptionPane.showMessageDialog(null, "Parametrage par defaut.");
				bonneRep=true;
			}
		}
	return new int[]{taille, pourcent};
	}
}
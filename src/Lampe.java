/**
 * La classe Lampe qui represente une lampe qu'on peut allumer et eteindre.
 * 
 * elle possede un attribut allume qui rend compte de son etat. cet attribut est
 * prive et manipulable par les methodes allumer et eteindre
 */
public class Lampe extends Appareil{
	/**
	 * etat de la lampe
	 */
	private boolean allume;
	/**
	 * construit une lampe eteinte par defaut
	 * 
	 * @param paramNom
	 *            nom de la lampe
	 */
	public Lampe() {
		this.allume = false;
	}
	/**
	 * permet de changer l'etat interne d'une lampe en l'allumant
	 */
	public void allumer() {
		this.allume = true;
	}
	/**
	 * permet de changer l'etat interne d'une lampe en l'eteignant
	 */
	public void eteindre() {
		this.allume = false;
	}
	/**
	 * retourne le descriptif de la lampe sous la forme nom + "On"/"Off"
	 */
	public String toString() {
		String r = "";
		if (this.allume) {
			r = "On";
		} else {
			r = "Off";
		}
		return ("Lampe : " + r);
	}
	/**
	 * permet de savoir si la lampe est allumee
	 * 
	 * @return etat de la lampe
	 */
	public boolean isAllume() {
		return allume;
	}
}

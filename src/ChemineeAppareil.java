public class ChemineeAppareil extends Appareil{
	/**
     * Attribut cheminée
     */
    private Cheminee cheminée;
	/**
	 * constructeur par defaut
	 * un variateur eteint
	 */
	public ChemineeAppareil()
	{
		cheminée = new Cheminee();
	}   
    /**
     * méthode abstraite pour allumer l'appareil
     */
    public void allumer(){
        cheminée.changerIntensite(100);
    }
    /**
     * méthode abstraite pour éteindre l'appareil
     */
    public void eteindre(){
        cheminée.changerIntensite(0);
    }
    /**
     * méthode abstraite pour afficher l'état de l'appareil
     */
    public String toString(){
        return cheminée.toString();
    }
    /**
     * isAllume
     * @return boolean 
     * permet de savoir si la cheminée est allumée
     */
    public boolean isAllume(){
        return cheminée.getLumiere() > 0;
    }
}
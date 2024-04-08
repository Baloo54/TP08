/**
 * classe abstraite commande
 * @version 1.0
 */
public abstract class Appareil {
    /**
     * méthode allumer
     * permet d'allumer un appareil
     */
    public abstract void allumer();
    /**
     * méthode eteindre
     * permet d'éteindre un appareil
     */
    public abstract void eteindre();
    /**
     * méthode toString
     * permet d'afficher l'état de l'appareil
     */
    public abstract String toString();
}


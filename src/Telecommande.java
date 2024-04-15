import java.util.ArrayList;
/**
 * Classe Telecommande
 * @version 1.0
 */
public class Telecommande {
    /**
     * Attribut 
     * @param Appareil
     */
    private ArrayList<Appareil> commande;
     /**
     * Constructeur de la classe Telecommande
     */
    public Telecommande(){
        this.commande = new ArrayList<Appareil>();

    }
    /**
     * Methode permettant d'ajouter un appareil à la telecommande
     * @param Appareil : Appareil à ajouter
     */
    public void ajouterAppareil(Appareil appareil){
        this.commande.add(appareil);
    }
    /**
     * Methode permettant d'activer un appareil à l'indice i
     * @param i : indice de l'appareil
     */ 
    public void activerAppareil(int i){
        if (i < this.commande.size()) {
            this.commande.get(i).allumer();
        }
    }
    /**
     * Methode permettant de désactiver un appareil à l'indice i
     * @param i : indice de la appareil
     */
    public void desactiverAppareil(int i){
        this.commande.get(i).eteindre();
    }

    /**
     * Methode permettant d'activer toutes les lampes
     */
    public void activerTout(){
        for (Appareil appareil : this.commande) {
            appareil.allumer();
        }
    }
    /**
     * Methode permettant de désactiver toutes les lampes
     */
    public void desactiverAppareil(){
        for (Appareil appareil : this.commande) {
            appareil.eteindre();
        }
    }
    /**
     * Méthode ToString
     * @return String 
     */
    public String toString(){
        String str = "";
        for (Appareil appareil : this.commande) {
            str += appareil.toString() + "\n";
        }
        return str;
    }
    /**
     * méthode getAppareil
     * @param i : indice de l'appareil
     */
    public Appareil getAppareil(int i){
        return this.commande.get(i);
    }
    /**
     * méthode getnombre
     * @return int : nombre d'appareil dans la telecommande
     */
    public int getNombre(){
        return this.commande.size();
    }
}

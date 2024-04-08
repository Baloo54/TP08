import java.util.ArrayList;
/**
 * Classe Telecommande
 * @version 1.0
 */
public class Telecommande {
    /**
     * Attribut 
     * @param commande : liste de Lampe
     * @param commandehifi : liste de chaine Hifi
     */
    private ArrayList<Lampe> commande;
    private ArrayList<Hifi> commandehifi;
    /**
     * Constructeur de la classe Telecommande
     */
    public Telecommande(){
        this.commande = new ArrayList<Lampe>();
        this.commandehifi = new ArrayList<Hifi>();
    }
    /**
     * Methode permettant d'ajouter une lampe a la telecommande
     * @param lampe : lampe à ajouter
     */
    public void ajouterLampe(Lampe lampe){
        this.commande.add(lampe);
    }

    /**
     * Methode permettant d'ajouter une chaine Hifi a la telecommande
     * @param hifi : chaine Hifi à ajouter
     */
    public void ajouterHifi(Hifi hifi){
        this.commandehifi.add(hifi);
    }
    /**
     * Methode permettant d'activer une lampe à l'indice i
     * @param i : indice de la lampe
     */ 
    public void activerLampe(int i){
        if (i < this.commande.size()) {
            this.commande.get(i).allumer();
        }
    }
    /**
     * Methode permettant d'activer une chaine Hifi à l'indice i    
     * @param i : indice de la chaine Hifi
     */
    public void activerHifi(int i){
        if (i < this.commandehifi.size()) {
            this.commandehifi.get(i).allumer();
        }
    }

    /**
     * Methode permettant de désactiver une lampe à l'indice i
     * @param i : indice de la lampe
     */
    public void desactiverLampe(int i){
        this.commande.get(i).eteindre();
    }

    /**
     * Methode permettant de désactiver une chaine Hifi à l'indice i
     * @param i : indice de la chaine Hifi
     */
    public void desactiverHifi(int i){
        this.commandehifi.get(i).eteindre();
    }

    /**
     * Methode permettant d'activer toutes les lampes
     */
    public void activerTout(){
        for (Lampe lampe : this.commande) {
            lampe.allumer();
        }
        for (Hifi hifi : this.commandehifi) {
            hifi.allumer();
        }
    }


    /**
     * Methode permettant de désactiver toutes les lampes
     */
    public void desactiverTout(){
        for (Lampe lampe : this.commande) {
            lampe.eteindre();
        }
        for (Hifi hifi : this.commandehifi) {
            hifi.eteindre();
        }
    }
    /**
     * Méthode ToString
     * @return String 
     */
    public String toString(){
        String str = "";
        for (Lampe lampe : this.commande) {
            str += lampe.toString() + "\n";
        }
        for (Hifi hifi : this.commandehifi) {
            str += hifi.toString() + "\n";
        }
        return str;
    }
    /**
     * méthode getLampe
     * @param i : indice de la lampe
     */
    public Lampe getLampe(int i){
        return this.commande.get(i);
    }

    /**
     * méthode getHifi
     * @param i : indice de la chaine Hifi
     */
    public Hifi getHifi(int i){
        return this.commandehifi.get(i);
    }

}

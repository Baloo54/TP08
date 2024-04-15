import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * classe de test permettant de tester la classe Telecommande
 */
public class TelecommandeTest {
    /**
	 * test de la méthode ajouterAppareil
	 */
	@Test
    public void testAjouterAppareil() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Appareil l = new Lampe();

        // methode testee
        t.ajouterAppareil(l);

        // verification
        Appareil res = t.getAppareil(0);
        assertEquals(l, res, " La Appareil à l'indice 0 devrait être la Appareil ajoutée");
    }


    /**
     * test de la méthode ajouterAppareil dans une télécommande avec une Appareil déjà ajoutée
     */
    @Test
    public void testAjouterAppareil2() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Appareil l = new Lampe();
        Appareil l2 = new Lampe();
        t.ajouterAppareil(l);

        // methode testee
        t.ajouterAppareil(l2);

        // verification
        Appareil res = t.getAppareil(1);
        assertEquals(l2, res, " La Appareil à l'indice 1 devrait être la Appareil ajoutée");
    }


    /**
     * test de la méthode allumerAppareil d'une Appareil existante en position 0
     */
    @Test
    public void testAllumerAppareil() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Appareil l = new Lampe();
        t.ajouterAppareil(l);

        // methode testee
        t.activerAppareil(0);

        // verification
        boolean res = t.getAppareil(0).isAllume();
        assertEquals(true, res, " La Appareil devrait être allumée");
    }

    /**
     * test de la méthode allumerAppareil d'une Appareil existante en position 1 
     */
    @Test
    public void testAllumerAppareil2() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Appareil l = new Lampe();
        Appareil l2 = new Lampe();
        t.ajouterAppareil(l);
        t.ajouterAppareil(l2);

        // methode testee
        t.activerAppareil(1);

        // verification
        boolean res = t.getAppareil(1).isAllume();
        assertEquals(true, res, " La Appareil devrait être allumée");
    }

    /**
     * test de la méthode allumerAppareil d'une Appareil inexistante
     */
    @Test
    public void testAllumerAppareilInexistante() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Appareil l = new Hifi();
        t.ajouterAppareil(l);

        // methode testee
        t.activerAppareil(1);

        // verification
        boolean res = t.getAppareil(0).isAllume();
        assertEquals(false, res, " La Appareil ne devrait pas être allumée");
    }
    /**
     * test  chemineeAppareil
     */
    @Test
    public void testChemineeAppareil() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        ChemineeAppareil c = new ChemineeAppareil();
        t.ajouterAppareil(c);
        t.activerTout();
        boolean res = t.getAppareil(0).isAllume();
        assertEquals(true, res, " La cheminee devrait être allumée");
    }       
    /**
     * test  chemineeAppareil plusieurs cheminee 
     */
    @Test
    public void testChemineeAppareil2() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        ChemineeAppareil c = new ChemineeAppareil();
        ChemineeAppareil c2 = new ChemineeAppareil();
        t.ajouterAppareil(c);
        t.ajouterAppareil(c2);
        t.activerTout();
        boolean res = t.getAppareil(0).isAllume();
        assertEquals(true, res, " La cheminee devrait être allumée");
    }
    /**
     * test  chemineeAppareil eteinte
     */
    @Test
    public void testChemineeAppareilEteinte() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        ChemineeAppareil c = new ChemineeAppareil();
        t.ajouterAppareil(c);
        t.activerTout();
        t.desactiverAppareil();
        boolean res = t.getAppareil(0).isAllume();
        assertEquals(false, res, " La cheminee devrait être éteinte");
    }

}
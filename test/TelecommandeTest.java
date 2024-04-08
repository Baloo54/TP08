import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * classe de test permettant de tester la classe Telecommande
 */
public class TelecommandeTest {
    /**
	 * test de la méthode ajouterLampe
	 */
	@Test
    public void testAjouterLampe() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");

        // methode testee
        t.ajouterLampe(l);

        // verification
        Lampe res = t.getLampe(0);
        assertEquals(l, res, " La lampe à l'indice 0 devrait être la lampe ajoutée");
    }


    /**
     * test de la méthode ajouterLampe dans une télécommande avec une lampe déjà ajoutée
     */
    @Test
    public void testAjouterLampe2() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        t.ajouterLampe(l);

        // methode testee
        t.ajouterLampe(l2);

        // verification
        Lampe res = t.getLampe(1);
        assertEquals(l2, res, " La lampe à l'indice 1 devrait être la lampe ajoutée");
    }


    /**
     * test de la méthode allumerLampe d'une lampe existante en position 0
     */
    @Test
    public void testAllumerLampe() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouterLampe(l);

        // methode testee
        t.activerLampe(0);

        // verification
        boolean res = t.getLampe(0).isAllume();
        assertEquals(true, res, " La lampe devrait être allumée");
    }

    /**
     * test de la méthode allumerLampe d'une lampe existante en position 1 
     */
    @Test
    public void testAllumerLampe2() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        t.ajouterLampe(l);
        t.ajouterLampe(l2);

        // methode testee
        t.activerLampe(1);

        // verification
        boolean res = t.getLampe(1).isAllume();
        assertEquals(true, res, " La lampe devrait être allumée");
    }

    /**
     * test de la méthode allumerLampe d'une lampe inexistante
     */
    @Test
    public void testAllumerLampeInexistante() {
        // preparation des donnees
        Telecommande t = new Telecommande();
        Lampe l = new Lampe("lampe1");
        t.ajouterLampe(l);

        // methode testee
        t.activerLampe(1);

        // verification
        boolean res = t.getLampe(0).isAllume();
        assertEquals(false, res, " La lampe ne devrait pas être allumée");
    }
}
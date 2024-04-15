
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		//ajout des appareils 5 fois chaque type 
		for(int i=0;i<5;i++)
		{
			t.ajouterAppareil(new Lampe());
		}
		for(int i=0;i<5;i++)
		{
			t.ajouterAppareil(new Hifi());
		}
		for(int i=0;i<5;i++)
		{
			t.ajouterAppareil(new ChemineeAppareil());
		}
		TelecommandeGraphique tg=new TelecommandeGraphique(t);	
	}
}

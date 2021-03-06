import java.io.IOException;

public class Menu
{
	//ATTRIBUTI
	private String titolo;
	private String[] elencoVoci;
	private int numeroVociMenu;
	
	
	//COSTRUTTORE
	public Menu(String titolo, String[] elencoVoci)
	{
		this.titolo=titolo;
		numeroVociMenu=elencoVoci.length;
		this.elencoVoci=new String[numeroVociMenu];
		for (int i = 0; i < numeroVociMenu; i++) 
		{
			this.elencoVoci[i]=elencoVoci[i];
		}
	}
	
	
	public void visualizza() 
	{
		for (int i = 0; i < numeroVociMenu; i++) 
		{
			System.out.println(elencoVoci[i]);
		}
		
	}
	
	
	public int scelta() 
	{
		ConsoleInput tastiera=new ConsoleInput();
		int scelta=-1;
		while(scelta<0 ||scelta>=numeroVociMenu)
		{
			visualizza();
			System.out.print("Scegli l'operazione: ");
			try 
			{
				scelta=tastiera.readInt();
			} 
			catch (NumberFormatException e) 
			{
				System.out.println("Formato dato inserito errato, reinserire");
			} 
			catch (IOException e) 
			{
				System.out.println("Impossibile leggere dal dispositivo di input");
			}
		}
		return scelta;
	}
}
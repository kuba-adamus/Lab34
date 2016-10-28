import java.math.BigDecimal;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

public class Zadanie1 
{
	private static void showInformationOf(Wakacje wakacje)
	{
		System.out.println(wakacje.miejscowosc + ", " + wakacje.kraj + ", hotel: " + wakacje.hotel + ", pokoj: " + wakacje.pokoj + ", termin: " + wakacje.termin + ", wyzywienie: " + wakacje.wyzywienie + ", cena: " + wakacje.cena.toString());
	}
	
	private static void addHoliday(Scanner in)
	{
		String miasto;
		String hotel;
		String kraj;
		String pokoj;
		String termin;
		String wyzywienie;
		BigDecimal cena;
		System.out.println("Miasto: ");
		miasto = in.nextLine();
		System.out.println("Kraj: ");
		kraj = in.nextLine();
		System.out.println("Hotel: ");
		hotel = in.nextLine();
		System.out.println("Pokoj: ");
		pokoj = in.nextLine();
		System.out.println("Termin: ");
		termin = in.nextLine();
		System.out.println("Wyrzywienie: ");
		wyzywienie = in.nextLine();
		try
		{
			
		}
		catch (Exception e)
		{
			
		}
		
		
		
	}
	
	public static void main(String[] args)
	{
		Wakacje grecja = new Wakacje("Grecja", "Ateny", "Hilton","4", "24-07-2016", "Sniadanie, obiad, kolacja", new BigDecimal(2200));
		//Wakacje niemcy = new Wakacje("Niemcy", "Monachium", "Europa","51", "23-07-2016", "Sniadanie, obiad, kolacja", new BigDecimal(6200));
		//Wakacje japonia = new Wakacje("Japonia", "Kyoto", "Okura Nikko Hotel Management","77", "28-08-2016", "Sniadanie, obiad, kolacja", new BigDecimal(8200));
		//Wakacje anglia = new Wakacje("Anglia", "Londyn", "Hilton","5", "15-07-2016", "Sniadanie, obiad, kolacja", new BigDecimal(5200));
		//showInformationOf(grecja);
		//showInformationOf(niemcy);
		//showInformationOf(japonia);
		//showInformationOf(anglia);
		showInformationOf(grecja);
		String input;
		/*(while (true)
		{
			String input = "";
			try
			{
				//input = System.console().readLine();
				//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        //System.out.print("Enter String");
		        //input = br.readLine();
				Scanner in = new Scanner(System.in);

				//int i = in.nextInt();
				input = in.nextLine();
				in.close();

			}
			catch (Exception e)
			{
				;
			}
			finally
			{
				;
			}
			if (input == "dodaj")
			{
				
			}
			if (input == "wyswietl")
			{
				showInformationOf(grecja);
			}
		}*/
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
	    System.out.println("Enter a string");  
	    input = in.nextLine();
	    System.out.println(input);
	    if (input.equals("dodaj"))
		{
			addHoliday(in);
		}
		if (input.equals("wyswietl"))
		{
			showInformationOf(grecja);
		}

	    
		}
	}
	
	
	
	
}

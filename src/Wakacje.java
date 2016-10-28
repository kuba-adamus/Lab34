import java.math.BigDecimal;


public class Wakacje 
{
	public String kraj;
	public String miejscowosc;
	public String hotel;
	public String pokoj;
	public String termin;
	public String wyzywienie;
	public BigDecimal cena;
	
	public Wakacje(String kraj, String miejscowosc, String hotel, String pokoj, String termin, String wyzywienie, BigDecimal cena)
	{
		this.kraj = kraj;
		this.miejscowosc = miejscowosc;
		this.hotel = hotel;
		this.pokoj = pokoj;
		this.termin = termin;
		this.wyzywienie = wyzywienie;
		this.cena = cena;
	}
	
	public String getCostData()
	{
		return hotel+" "+pokoj+" "+cena.toString()+ " zl"; 
	}
	
}

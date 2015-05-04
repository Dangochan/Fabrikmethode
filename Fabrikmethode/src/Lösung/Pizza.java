package Lösung;
import java.util.ArrayList;


public abstract class Pizza {
	String name;
	String teig;
	String soße;
	ArrayList<String> belaege = new ArrayList<String>();
	
	public void vorbereiten()
	{
		System.out.println("Bereite " + name + " vor.");
	}
	
	public void backen()
	{
		System.out.println("Backe 25 min bei 350°");
	}
	
	public void schneiden()
	{
		System.out.println("Schneide in Stücke");
	}
	
	public void verpacken()
	{
		System.out.println("Verpacke in Orginalverpackung");
	}
	
	public String getName()
	{
		return name;
	}
	
	@Override
	public String toString()
	{
		StringBuffer outputString = new StringBuffer();
		outputString.append(name + ": ");
		for(String str: belaege)
		{
			outputString.append(str + " ");
		}
		outputString.append("mit " + soße + "\n");
		return outputString.toString();
	}
}

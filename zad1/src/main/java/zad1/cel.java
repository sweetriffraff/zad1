package zad1;

public class cel {
	public static void main(String[] args) {
		try
		{
			double cel = Double.parseDouble(args[0]);
			System.out.println(cel + "°C");
			Fahrenheit fa= new Fahrenheit();
			Kelvin k= new Kelvin();
			double fah =fa.translate(cel);
			double kel=k.translate(cel);
			System.out.println(fah + "°F");
			System.out.println(kel + " K");
			
		}
		catch (NumberFormatException e)
		{
			e.printStackTrace();
		}
	}
}

import java.util.Locale;
public class primeiroExercicio {

	public static void main(String[] args) {
		String produto1 = "Computer";
		String produto2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.1f%n", produto1, price1);
		System.out.printf("%s, which price is $ %.2f%n", produto2, price2);
		
		System.out.println();
		
		System.out.printf("Record: %d yars old, code %d and gender: %c%n", age,
				code, gender);
		
		System.out.println();
		
		System.out.printf("Measue with eight places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
	}

}

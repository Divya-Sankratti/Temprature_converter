package Bro_Code_Task;
import java.util.*;

public class TemperatureCon {

	public static void main(String[] args) {
		// TEMPERATURE CONVERTER
		Scanner scanner=new Scanner(System.in);
		
		double Temp;
		double newTemp;
		String unit;
		
		System.out.print("Enter a Temperature: ");
		Temp=scanner.nextDouble();
		
		System.out.print("Convert Celsius or Fahrenheit?(C or F):");
		unit=scanner.next().toUpperCase();
		
		
		//Temperature Converter formula
		newTemp=(unit.equals("C"))?(Temp-32)*5/9:(Temp*5/9)+32;
		
		//System.out.println(newTemp+"°"+unit);
		
		System.out.printf("%.1f°%s",newTemp,unit);
		
		
		scanner.close();
		
		

	}

}

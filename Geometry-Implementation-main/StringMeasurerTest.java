/// CPSC_1110_Rectangle.JAVA_Morris - class implementing a rectangle
// Author: Markay Morris 
// Date: 7/17/2021 

public class StringMeasurerTest {

	public static void main(String[] args) {
		
		//WHAT IT DOES : prints the data 
		//HOW IT WORKS: includes everything weve done in this folder
		Measurer stringMeas = new StringMeasurer();
		String[] str = {"hello","world","Hi","John","okay"};
		double averageLength = Data.average(str, stringMeas);
		System.out.println("Average length of strings: "+ averageLength);
		System.out.println("Expected average length of strings: 4.0");
	}

}

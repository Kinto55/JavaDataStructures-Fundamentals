/// CPSC_1110_Rectangle.JAVA_Morris - class implementing a rectangle
// Author: Markay Morris 
// Date: 7/17/2021 

public class StringMeasurer implements Measurer{

	//what it does: includes proper string 
	// how it works: Indicates that a method declaration is intended to override a method declaration in a supertype

	@Override
	public double measure(Object anObject) {
		String str = (String) anObject;
		return str.length();
	}

}

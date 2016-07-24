package tut1.defaultmethods;

public interface Formula {

	double calculate(int a);
	/**
	 * With Java8 we can add non-abstract method implementation 
	 * to interface. This feature is also known as "Extension methods"
	 *
	 */
	default double sqrt(int a){
		return Math.sqrt(a);
	}
	
}

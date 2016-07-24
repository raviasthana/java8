package tut1.defaultmethods;

public class FormulaImpl {

	public static void main(String[] args) {
		
		Formula formula = new Formula() {
			
			@Override
			public double calculate(int a) {
				return sqrt(a * 100);
			}
		};
		
		System.out.println("calculate: " + formula.calculate(100));
		System.out.println("sqrt: " + formula.sqrt(16));
		
	}

}

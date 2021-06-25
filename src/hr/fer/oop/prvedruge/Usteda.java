package hr.fer.oop.prvedruge;

public class Usteda {

	public static void main(String[] args) {
		
		if (args.length == 3) {
			
			double pocizn = Double.parseDouble(args[0]);
			double interes = Double.parseDouble(args[1]);
			int brojgod = Integer.parseInt(args[2]);
			
			System.out.println("|--Year--|---Savings---|");
			
			for (int i = 0; i < brojgod; ++i) {
				pocizn *= (1 + interes);
				System.out.printf("|%5d   | %10.2f  | %n", i, pocizn);
			}
			System.out.println("|--------|-------------|");
			
		} else {
			System.out.println("Program needs arguments for initial capital (savings), interest rate, and number of years ");
		}

	}

}

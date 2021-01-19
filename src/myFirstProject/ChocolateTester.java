package myFirstProject;

public class ChocolateTester {
		private int barCode, weight, cost;
		private String name;
		ChocolateTester(){
			name = "Cadbury";
			barCode = 101;
			weight = 12;
			cost = 10;
		}
		
		ChocolateTester(String name, int barCode, int weight, int cost){
			this.name = name;
			this.barCode = barCode;
			this.weight = weight;
			this.cost = cost;
		}
		
		void displayChocolate() {
			System.out.println(name);
			System.out.println(cost);
		}
		
		public static void main (String[] args) {
			ChocolateTester test1 = new ChocolateTester();
			ChocolateTester test2 = new ChocolateTester("Resses", 1, 3, 5);
			
			test1.displayChocolate();
			test2.displayChocolate();
		}
	
	

}


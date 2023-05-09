import java.util.Scanner;

public class Main {
	public static void main(String[] Args) throws InterruptedException {

		System.out.println("\n");
		System.out.print("Octal Constant: ");
		System.out.println("R = 0[0-7]+ or 0D8+");
		System.out.print("Finite State Machine Transition Graph: ");
		System.out.println("q0-> 0 q1-> D8 q2-> D8... qn-># qf");
		System.out.println();
		Scanner sc = new Scanner(System.in);

		String number;
		do {
			
			System.out.println("Number must start with 0!");
			System.out.print("Enter a octal number: ");
			number = sc.nextLine();
		}while(!numb(number));
		
		System.out.println(finite_state_machine_transition_graph(number));

	}

	public static String finite_state_machine_transition_graph(String number) throws InterruptedException {

		System.out.println("\n FSM on number : " + number);
		char[] digit = number.toCharArray();
		String sequence = "";
		int n = 0;
		System.out.println("\n--------------- START ------------\n");
		for (int i = 0; i < digit.length; i++) {
			for (int j = i; j < digit.length + 2;) {
				//int a = int(digit[i]);
				sequence += QPattern(j,digit[i]);
				j++;
				n = j;
				break;
			}

		}
		// System.out.println(n);
		System.out.println("Computing...");
		Thread.sleep(2200);
		return sequence + QPattern(n,'#') + QPatternEnd('f');
	}

	
	 public static boolean numb(String numb) {
		 return numb.startsWith("0");
	  }
	 
	 public static String QPattern(int d,char f) throws InterruptedException {
			String pat ="";
			pat+="\n\n";
			pat+="------------------------------\n";
			pat+="|                            |\n";
			pat+="|        ********            |\n";
			pat+="|      *          *          |\n";
			pat+="|    *             *         |\n";
			pat+="|   *               *        |\n";
			pat+="|    *             *         |\n";
			pat+="|     *           *          |\n";
			pat+="|      *         *           |\n";
			pat+="|       *********            |\n";
			pat+="|              **            |\n";
			pat+="|              **            |\n";
			pat+="|              **     -----  |\n";
			pat+="|              **     | "+d+" |  |\n";
			pat+="|              **  *  -----  |\n";
			pat+="|              ** **         |\n";
			pat+="|              ***           |\n";
			pat+="|                            |\n";
			pat+="------------------------------\n"+arrow(f)+"              ";
			
			return pat;
		
		}
	 
		
		public static String arrow(char d) {
			String a = "              |\n              |\n              |\n              |\n              | "+d+"\n              |\n              |\n           \\  |  /\n            \\ | /             \n             \\|/";
			return a;
		}
		public static String QPatternEnd(char c) throws InterruptedException {
			String pat ="";
			pat+="\n\n";
			pat+="------------------------------\n";
			pat+="|                            |\n";
			pat+="|        ********            |\n";
			pat+="|      *          *          |\n";
			pat+="|    *             *         |\n";
			pat+="|   *               *        |\n";
			pat+="|    *             *         |\n";
			pat+="|     *           *          |\n";
			pat+="|      *         *           |\n";
			pat+="|       *********            |\n";
			pat+="|              **            |\n";
			pat+="|              **            |\n";
			pat+="|              **     -----  |\n";
			pat+="|              **     | "+c+" |  |\n";
			pat+="|              **  *  -----  |\n";
			pat+="|              ** **         |\n";
			pat+="|              ***           |\n";
			pat+="|                            |\n";
			pat+="------------------------------\n";
			pat+="\n\n--------------- END ------------";
			return pat;
		
		}
			
}

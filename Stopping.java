import java.util.*;


public class Stopping{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sample size: ");
		int samplesize = scan.nextInt();
		System.out.println("Enter number of simulations: ");
		int numsims = scan.nextInt();
		for(int i = 0; i<samplesize; i++){
			double successes = 0;
			for(int j = 0; j<numsims; j++){
				Simulation sim = new Simulation(samplesize);
				if(sim.RunWithPercent(i)){
					successes++;
				}
			}
		
		System.out.println("Running " + numsims + " simulations in a sample size of " + samplesize + ", stopping at " + i + " percent yields success rate: " + (successes/numsims)*100 + "%\n");
		}
		
		
	}


}

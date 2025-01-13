public class Stopping{
	public static void main(String[] args){
		int percent = 0;
		int samplesize = 100;
		int numsims = 10000;
		for(int i = 0; i<samplesize; i++){
			double successes = 0;
			for(int j = 0; j<numsims; j++){
				Simulation sim = new Simulation(samplesize);
				if(sim.RunWithPercent(i)){
					successes++;
				}
			}
		
//		System.out.println("Running " + numsims + " simulations in a sample size of " + samplesize + ", stopping at " + i + " percent yields success rate: " + (successes/numsims)*100 + "%");
		System.out.println((successes/numsims)*100);
		}
		
		
	}


}

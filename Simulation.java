import java.util.*;
import java.io.*;

public class Simulation{
	public ArrayList<Integer> set;
	public int SampleSize;

	public Simulation(int ss){
		SampleSize = ss;
		set = new ArrayList<Integer>();                      
                for(int i = 0; i<ss; i++){
                        int item;
                        item = (int)((Math.random()*ss)+1);
                        while(set.contains(item)){
                                item = (int)((Math.random()*ss)+1);
                        }
                        set.add(item);
                }
	}
	
	

	boolean RunWithPercent(int p){
		int min = SampleSize;
		int SearchStop = p;
		for(int i = 0; i<SearchStop; i++){
			if(set.get(i)<min){
				min = set.get(i);
			}
		}
		for(int i = SearchStop; i<SampleSize; i++){
			if(set.get(i)<min){
				if(set.get(i)==1){
					return true;
				}
				else{
					return false;
				}
			}
		}
		return false;
	}

	void PrintWithPercent(int p){
		for(int i = 0; i<SampleSize; i++){
			System.out.println(set.get(i));
		}
		System.out.println("\n\n\n");
	}

}

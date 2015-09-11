package cis232.examples;

public class SplitQuestion {
	public static void main(String[] args){
		String[] tokens = "/home/rjones/mydata.txt".split("[/.]");
		for(String token : tokens){
			System.out.println(token);
		}
	}
}

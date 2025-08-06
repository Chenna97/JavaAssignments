package com.training.basic;

public class Duplicates {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,1,2,4,5,6};
		
		boolean[] visited = new boolean[numbers.length];
		
		for(int i=0; i< numbers.length ;i++) {
			
			if(visited[i]) 
				{
				System.out.println(numbers[i] + " visited is "+ visited[i]);
				continue;
				}
			
			int count=1;
			
			
			for(int j= i+1;j< numbers.length; j++) {
				
				if(numbers[i]==numbers[j]) {
					count++;
					visited[j] = true;
				}
			}
			
			if(count > 1) {
				
				System.out.println(numbers[i]+" - -"+count);
			}
			
		}

	}

}

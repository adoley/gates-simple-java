package org.adoley.driver;
import java.util.Scanner;

import org.adoley.gates.Gates;

public class Driver {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		Gates gates=new Gates();
		
		int result,a,b,loop=1,notA,notB,andOutput,norOutput;

		while(loop==1){
		    
	        System.out.println("Enter the value of A : ");
	        a=scanner.nextInt();
	        System.out.println("Enter the value of B : ");
	        b=scanner.nextInt();
	        
		if(a>=0 && a<=1 && b>=0 && b<=1){

			//Here you define your circuit
	    	notA=gates.notGate(a);    //use not gate  
			notB=gates.notGate(b);
			andOutput=gates.andGate(notA,notB); // use and gate
			norOutput=gates.norGate(a,b); //use nor gate      
			result=gates.xorGate(andOutput,norOutput); //use xor gate
			//circuit definition ends
	    		
			System.out.println(" The output the circuit : "+result);
		}else{
			System.out.println("Value of A & B should be either 1 or 0 \n");
		}

		System.out.println("Press 1 to continue or press any other key to exit : ");
	    	loop=scanner.nextInt();
	     } 
	}
}

package org.adoley.gates;

public class Gates {
	public int notGate(int input){
		if(input==0)
			return 1;
		return 0;
	  }

	public int andGate(int firstInput,int secondInput){
		if(firstInput==0 || secondInput==0)
			return 0;
		return 1;
	}

	public int norGate(int firstInput,int secondInput){
		if(firstInput==0 && secondInput==0)
			return 1;
		return 0;
	}

	public int xorGate(int firstInput,int secondInput){
		if(firstInput==secondInput)
		 	return 0;
		return 1;
	}
	public int orGate(int firstInput, int secondInput){
		if(firstInput==1 || secondInput==1)
			return 1;
		return 0; 	
	}
}

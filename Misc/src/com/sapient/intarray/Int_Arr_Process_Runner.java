package com.sapient.intarray;

public class Int_Arr_Process_Runner {

	public static void main(String[] args) {
		Int_Arr_Process ob1 = new Int_Arr_Process(6);
		Int_Arr_Process ob2 = new Int_Arr_Process();
		Int_Arr_Process ob3 = new Int_Arr_Process(new int[] {4,8});
		ob1.readArray();
		Int_Arr_Process ob = new Int_Arr_Process(ob1);
		ob.printArray();
		ob1.sortArray();
		ob.getSum();
		ob3.printMinMax();
		ob3.getSum();
		ob3.getSecondBiggest();
		System.out.println("ob2 size: "+ ob2.getLength());
	}

}

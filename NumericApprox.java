/**
 * @(#)NumericApprox.java
 *
 * NumericApprox application
 *
 * @author 
 * @version 1.00 2017/5/27
 */

import java.util.Scanner; 
public class NumericApprox {
    
    public static void main(String[] args) {
    	
    	/*Scanner scan= new Scanner (System.in);
    	System.out.println("Enter the min (a)");
    	int a= scan.nextInt();
    	System.out.println("Enter the max (b)");
    	int b= scan.nextInt();
    	System.out.println("Enter the n (interval number)");
    	int n= scan.nextInt();
    	*/
    	
    	FuncInfo fI= new FuncInfo (0,1,4);
		MidRule mR= new MidRule (0,1,4);
    	SimpRule sR= new SimpRule (0,1,4);
    	TrapRule tR= new TrapRule (0,1,4);
    	
    	System.out.println(tR);
    	//System.out.println(mR);
    	//System.out.println(sR);
    	//System.out.println(sR.getCoef());
    	
    	/*double temp [];
    	temp = tR.getCoef();
    	for (int i=0; i<temp.length; i++){
    		System.out.println (temp[i]+" ");
    	}
    	*/
    	
    	//System.out.println(fI.getArea1());
    	//System.out.println(sR.getApproxArea1());
    	
    	/*
    	SimpRule sR= new SimpRule (0,1,4);
    	double temp [];
    	temp = sR.getMidPoints();
    	for (int i=0; i<temp.length; i++){
    		System.out.println (temp[i]+" ");
    	}
    	*/
    	
    /*	MidRule mR= new MidRule (0,1,4);
    	double temp [];
    	temp = mR.getMidPoints();
    	for (int i=0; i<temp.length; i++){
    		System.out.println (temp[i]+" ");
    	}
    */	
    	
    	//MidRule mR= new MidRule(1,2,4);
    	//System.out.println (mR.getCoef());
    	//System.out.println(mR);
    	 	
 
    }
}
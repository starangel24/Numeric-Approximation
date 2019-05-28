public class MidRule extends FuncInfo{

   	private double delta;
    public MidRule (){
    	
    }
    public MidRule (int a, int b, int n) {
    	super (a,b,n);
    	delta= ((double) 1/getInterval())* (getMax()-getMin());
		/*min= getMin();
		max= getMax();
		interval= getInterval;
		*/
    }
    
    
    
    public double [] getMidPoints (){
    	double frac;
    	double temp=0.0;
    	double array []= new double [getInterval()];
    	frac= delta/2;
    	temp= temp+ frac;
    	for (int i=0; i<array.length; i++){
    		array[i]= temp;
    		temp+= delta;
    	}  	
    	return array;
    }
    
    public double getApproxArea1 (){
    	double approxArea=0.0;
    	double temp[];
    	temp= getMidPoints();
    	for (int i=0; i<temp.length; i++){
    		double num= temp[i];
    		approxArea= approxArea+ (3*(Math.pow(num,2)))+ (6*(Math.pow(num,1)) +4);	
    	}
    	return approxArea*delta;
    }
    public double getApproxArea2 (){
    	double approxArea=0.0;
    	double temp[];
    	temp= getMidPoints();
    	for (int i=0; i<temp.length; i++){
    		double num= temp[i];
    		approxArea= approxArea+ (Math.pow(num,4))+ 2;	
    	}
    	return approxArea*delta;
    }
    public double getApproxArea3 (){
    	double approxArea=0.0;
    	double temp[];
    	temp= getMidPoints();
    	for (int i=0; i<temp.length; i++){
    		double num= temp[i];
    		approxArea= approxArea+ (5*(Math.pow(num,3)))+ (4*(Math.pow(num,2)) +8*num);	
    	}
    	return approxArea*delta;
    }
    
    
    public double getPercentOfError1 (){
    	double error;
    	error= Math.abs(getArea1()- getApproxArea1());
    	
    	return error/getArea1()*100;
    }
    public double getPercentOfError2 (){
    	double error;
    	error= Math.abs(getArea2()- getApproxArea2());
    	
    	return error/getArea2()*100;
    }
    public double getPercentOfError3 (){
    	double error;
    	error= Math.abs(getArea3()- getApproxArea3());
    	
    	return error/getArea3()*100;
    }
    
    
    
    public String toString(){
    	StringBuffer sb= new StringBuffer ();
    	//sb.append("Delta: " +delta+ "\n");
    	//sb.append("Interval: "+ this.getInterval()+ "\n");
    	sb.append("This is for Midpoint Rule: "+ "\n");
    	sb.append(super.toString());
    	sb.append("Approximated Area for Function 1: " + getApproxArea1()+ "\n");
    	sb.append("Percent of Error for Function 1: " + getPercentOfError1()+ "\n");
    	sb.append("Approximated Area for Function 2: " + getApproxArea2()+"\n");
    	sb.append("Percent of Error: " + getPercentOfError2()+"\n");
    	sb.append("Approximated Area for Function 3: " + getApproxArea3()+"\n");
    	sb.append("Percent of Error: " + getPercentOfError3()+"\n");
		return sb.toString();
	}
}
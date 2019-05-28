public class FuncInfo {
	
	private int max;
	private int min;
	private int interval;
    private double area;
    private static final String FUNC1= "3x^2+6x+4";
    private static final String FUNC2= "x^4+2";
    private static final String FUNC3= "5x^3+4x^2+8x";

    public FuncInfo(){
    }
    	 
    public FuncInfo (int min, int max, int interval) {
    	setMin(min);
    	setMax(max);
    	setInterval(interval);	
    }
    
    public void setMin(int min){
    	this.min= min;
    }
    
    public int getMin(){
    	return this.min;
    }
    
    public void setMax(int max){
    	this.max= max;
    }
    
    public int getMax(){
    	return this.max;
    }
    
    public void setInterval(int interval){
    	this.interval=interval;
    }
    
    public int getInterval(){
    	return this.interval;
    }
    
    public double getArea1(){
    	area= ((Math.pow(max,3))+(3*(Math.pow(max,2)))+(4*max))-((Math.pow(min,3))+(3*(Math.pow(min,2)))+(4*min));
    	return area;	
    }
    public double getArea2(){
    	area= ((double)1/5*(Math.pow(max,5))+(2*max))-((double) 1/5*(Math.pow(min,5))+(2*min));
    	return area;	
    }
    public double getArea3(){
    	area= ((double)5/4*(Math.pow(max,4))+((4/3)*(Math.pow(max,3)))+(4*(Math.pow(max,2))));
    	area= area-((double)5/4*(Math.pow(min,4))+((4/3)*(Math.pow(min,3)))+(4*(Math.pow(min,2))));
    	return area;	
    }
    
        public String toString(){
    	StringBuffer sb= new StringBuffer ();
    	//sb.append("Interval: "+ this.getInterval()+ "\n");
    	sb.append("Function 1: " + FUNC1+ " from "+ this.getMin()+ " to " +this.getMax()+"\n");
    	sb.append("Actual Area: " + getArea1()+ "\n");
    	sb.append("Function 2: " + FUNC2+ " from "+ this.getMin()+ " to " +this.getMax()+"\n");
    	sb.append("Actual Area: " + getArea2()+ "\n");
    	sb.append("Function 3: " + FUNC3+ " from "+this.getMin()+ " to " +this.getMax()+"\n");
    	sb.append("Actual Area: " + getArea3()+ "\n");
	
    	return sb.toString();
    }
}
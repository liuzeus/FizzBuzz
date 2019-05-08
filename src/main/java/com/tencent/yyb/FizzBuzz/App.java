package com.tencent.yyb.FizzBuzz;

/**
 * FizzBuzz
 *
 */
public class App 
{
	private  int[] origin = new int[100];
	
    public String Conversion()
    {
    	StringBuilder stringBuilder = new StringBuilder();
		for(int i = 1; i <= origin.length - 1; ++i) {
			origin[i] = i;
		    //System.out.println(ReportNumber(origin[i]));
		    stringBuilder.append(ReportNumber(origin[i]));
		} 
		return stringBuilder.toString();
    }
    
    public  String ReportNumber(int NumberToFizzBuzz) {

        if(NumberToFizzBuzz%15==0){
           return "FizzBuzz";
        }
        
        if(NumberToFizzBuzz%3==0 || String.valueOf(NumberToFizzBuzz).contains("3")){
            return "Fizz";
        }
        
        if(NumberToFizzBuzz%5==0 || String.valueOf(NumberToFizzBuzz).contains("5")){
            return "Buzz";
        }    
        return String.valueOf(NumberToFizzBuzz);
    }
}



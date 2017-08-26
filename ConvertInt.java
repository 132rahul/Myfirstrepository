public class ConvertInt {
	 public static void main (String args[])
	    {
		     //int a = Integer.parseInt("123");
			//System.out.println(a);
	        String  convertingString="123456";//string value
	        System.out.println("String Before Conversion :  "+ convertingString);//print a string value before conversion
	        int output =  stringToint( convertingString );//calling a function stringToint conversion and o/p as output variable which of int typr
	        System.out.println("..........................................................................................");
	        System.out.println("Integer value : "+ output);//printing a integer value 
	        
	    }
	    
	    
	    public static int stringToint( String str ){
	        int i = 0, num = 0;
	        boolean a = false;//boolean variable
	        int len = str.length();//calculate the  length of string
	        if( str.charAt(0) == '-' ){
	            a = true;
	            i = 1;
	        }
	        while( i < len ){
	            num = num* 10;
	            num = num+ ( str.charAt(i++) - '0' );//add next(i) value to number 
	        }
	        if(a)//check for boolean
	        num = -num;//for integer
	        return num;
	    }  
}
	
	
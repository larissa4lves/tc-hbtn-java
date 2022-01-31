
public class Numero {
	
public static void dividir(int a, int b) {
		  
	       int resp = 0;
	       
	       try {
	    	     resp = a/b;
	    	     
	       }
	       catch(ArithmeticException exeption){
	    	   resp = 0;
	    	   System.out.println("Nao eh posivel dividir por zero");
	       }
	       
	       finally {
	    	   	   System.out.println(a + " / " + b + " = " + resp);
	       }
	       
}


}

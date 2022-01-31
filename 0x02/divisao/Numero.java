
public class Numero {
	
public static void dividir(int a, int b) {
		  
	       int resp = 0;
	       
	       try {
	    	     resp = a/b;
	    	     
	       }
	       catch(Exception ex){
	    	   resp = 0;
	    	   System.out.println("Nao eh posivel dividir por zero");
	       }
	       
	       finally {
	    	   System.out.printf("%d / %d = %d\n", a, b, resp);
	       }
	       
}


}


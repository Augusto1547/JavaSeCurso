package br.com.fuctura.intermediario.threadsNotifyWaitNotifyAll;

import java.util.Map;

public class Teste {
	public static void main(String[] args) {

		
//		  System.out.println(System.getProperty("user.dir"));
//		  System.out.println(System.getProperty("user.name"));
//		  System.out.println(System.getProperty("os.name"));
//		  System.out.println(System.getProperty("os.version"));
//		  System.getProperties().list(System.out);

		
        /*
		long startTime = System.currentTimeMillis();
		System.out.println("------------");
		System.out.println("------------");
		System.out.println("------------");
		System.out.println("------------");
		System.out.println("------------");
		long endTime = System.currentTimeMillis();
		
		long diff = endTime - startTime;
		System.out.println(diff);*/
 
		
//		char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
//		
//		char[] copyTo = new char[7];
//
//	    System.arraycopy(copyFrom,  2, copyTo, 0,7);
//	    System.out.println(new String(copyTo));
//	    
//	    System.out.println("");
	    
	    char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
	    char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
	    
	    System.out.println(new String(copyTo));
	    
	    String javaHome = System.getenv("JAVA_HOME");
	    System.out.println(javaHome);
	    
	    Map<String, String> env = System.getenv();
	    for (String nomeVariavel : env.keySet()) {
	      System.out.format("%s=%s\n", nomeVariavel, env.get(nomeVariavel));
	    }
	    

	    
	}

}

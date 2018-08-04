/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciooperacoes;

/**
 *
 * @author Luiz
 */
class Operacao {
    public double soma () {
        return 0;
    }
    
    public double calculaMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }
    
    public int multiplicacao () { 
        return 1;
    }
    
    public double divisao (double n1, double n2) {
        return n1/n2;
    }
    
    public double subtracao () {
        return 0; 
    }
    
    public double mediaPonderada (double n1, double n2) {
        return (n1 + n2)/ 1 + 2;
    }
    
    public double fatorial (double fat) {	 	  	 	     	     	      	    	      	    	        	 	
        double f = 0;
        while (fat > 1){  
             f *=(fat-1); 
             fat--; 
        }
        return f;
    }
       
}

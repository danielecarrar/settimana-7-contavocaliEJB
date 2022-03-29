package it.business;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;

@Stateless
@LocalBean
public class ContaVocaliEJB implements ContaVocaliEJBLocal {

    public ContaVocaliEJB() {}
    
    public int ContaVocali(String input) {
		int numeroVocali = 0;
		
    	input = input.toLowerCase();
    	
		for(int i =0; i<input.length(); i++) {
			switch (input.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': 
				numeroVocali++;
				break;
			}
		}   	
    	return numeroVocali;
    }
}
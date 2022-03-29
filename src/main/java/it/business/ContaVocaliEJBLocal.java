package it.business;

import jakarta.ejb.Local;

@Local
public interface ContaVocaliEJBLocal {
	public int ContaVocali(String input);
}

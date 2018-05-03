package com.atm;

public class AtmAccess {

	public static void main(String[] args) {
		ATM a = new ATM();
		Card cd = new Card();

		a.withDraw(cd);

	}
}

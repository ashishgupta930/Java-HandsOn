package com.nonprimitivedatatype.food;

public class ATM {

	Money withDraw(Card c, int p) { // money is reference here of money class
		Money m = new Money();
		return m;
	}
	public static void main(String[] args) {
		ATM a = new ATM();
		Card c = new Card();
		Money paisa = a.withDraw(c, 1234);
	}
	
}

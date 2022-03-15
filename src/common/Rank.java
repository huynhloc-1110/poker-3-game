package common;

public enum Rank {
	R2(2), R3(3), R4(4), R5(5), R6(6), R7(7), R8(8), R9(9), R10(10),
	J(10,"face"), Q(10,"face"), K(10,"face"), A(1);
	
	private int value;
	private boolean isFaceCard;
	
	private Rank(int value) {
		this.value = value;
		isFaceCard = false;
	}
	
	private Rank(int value, String face) {
		this.value = value;
		isFaceCard = (face == "face") ? true : false;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isFaceCard() {
		return isFaceCard;
	}
}

package common;

public enum Rank {
	R2(2), R3(3), R4(4), R5(5), R6(6), R7(7), R8(8), R9(9), R10(10),
	J(11), Q(11), K(11), A(1);
	
	private int value;
	
	private Rank(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

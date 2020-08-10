package Java_exercises.Expression;

public class Number extends Expression {

	private int value;
	
	public Number(int uneVal) {
		value = uneVal;
	}
	
	@Override
	public int evaluate(){
		return value;
	}
	@Override
	public String affiche(){
		return " " + value + " ";
	}

}

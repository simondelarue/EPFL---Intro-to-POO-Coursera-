package Java_exercises.Expression;

public abstract class BinOp extends Expression {

	protected Expression leftOp;
	protected Expression rightOp;
	
	public BinOp(Expression unLeftOp, Expression unRightOp){
		leftOp = unLeftOp;
		rightOp = unRightOp;
	}
}

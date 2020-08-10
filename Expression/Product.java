package Java_exercises.Expression;

public class Product extends BinOp {

	public Product(Expression unLeftOp, Expression unRightOp) {
		super(unLeftOp, unRightOp);
	}

	@Override
	public int evaluate() {
		return leftOp.evaluate() * rightOp.evaluate();
	}
	@Override
	public String affiche(){
		return leftOp.affiche() + "*" + rightOp.affiche();
	}
}

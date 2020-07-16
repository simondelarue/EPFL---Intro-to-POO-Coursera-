package expression;

public class Arith {

	public static void main(String[] args) {
		Expression term = new Sum(new Number(3), 
				new Product(new Number(2), new Number(5)));
		System.out.println(term.affiche() + " = " + term.evaluate());
	}

}

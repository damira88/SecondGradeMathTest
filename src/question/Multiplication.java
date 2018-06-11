package question;

public class Multiplication extends Question{

	public Multiplication(Range r) {
		super("Multiplication","*");
		  operand1=RandomNumber.getRandomInteger(r);
		  operand2=RandomNumber.getRandomInteger(r);
		
	}


	public void calc() {
	this.calculated=true;	
	 super.answer=operand1*operand2;
		
	}
	public String toString() {
		if (calculated)
			return operand1+"*"+operand2+"="+answer ;
			else
			return operand1+"*"+operand2+"=";
	}

}

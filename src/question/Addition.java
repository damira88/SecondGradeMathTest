package question;

public class Addition  extends Question{

	public Addition(Range r) {
		super("Addition " ,"+");
		  operand1=RandomNumber.getRandomInteger(r);
		  operand2=RandomNumber.getRandomInteger(r);
		  
	
	}

	
	public void calc() {
	
	super.answer=operand1+operand2;
	this.calculated =true;
		
	}
	public String toString() {
		if (calculated)
			return operand1+"+"+operand2+"="+answer ;
			else
			return operand1+"+"+operand2+"=";
		}

		
	}



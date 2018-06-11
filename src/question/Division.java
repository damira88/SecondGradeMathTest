package question;

public class Division extends Question{

	public Division(Range r) {
		super("Division ","/");
		  operand1=RandomNumber.getRandomInteger(r);
		  operand2=RandomNumber.getRandomInteger(r);
		  while(operand1<operand2) {
				operand1=RandomNumber.getRandomInteger(r);
				operand2=RandomNumber.getRandomInteger(r);
			}
	}

	@Override
	public void calc() {
		this.calculated =true;
		super.answer=operand1/operand2;
		
	}
	public String toString() {
		if (calculated)
			return operand1+"/"+operand2+"="+answer ;
			else
			return operand1+"/"+operand2+"=";
	}

}

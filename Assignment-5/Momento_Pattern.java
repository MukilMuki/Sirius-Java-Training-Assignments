package day_5;

interface PreviousCalculationToCareTaker{
	
}

interface PreviousCalculationToOriginator{
	public int getFirstNumber();
	public int getSecondNumber();
}

interface Calculator{
	public PreviousCalculationToCareTaker backupLastCalculation();
	public void restorePreviousCalculation(PreviousCalculationToCareTaker memento);
	
	public int getCalculationResult();
	public void setFirstNumber(int firstNumber);
	public void setSecondNumber(int secondNumber);

}
class PreviousCalculationImplementation implements PreviousCalculationToCareTaker,
										PreviousCalculationToOriginator{
	private int firstNumber;
	private int secondNumber;
	PreviousCalculationImplementation(int firstNumber,int secondNumber) {
		this.firstNumber=firstNumber;
		this.secondNumber=secondNumber;
	}
	@Override
	public int getFirstNumber() {
		// TODO Auto-generated method stub
		return firstNumber;
	}

	@Override
	public int getSecondNumber() {
		// TODO Auto-generated method stub
		return secondNumber;
	}
}

class CalculatorImplementaion implements Calculator{
	private int firstNumber;
	private int secondNumber;
	@Override
	public PreviousCalculationToCareTaker backupLastCalculation() {
		// TODO Auto-generated method stub
		return new PreviousCalculationImplementation(firstNumber,secondNumber);
	}
	@Override
	public void restorePreviousCalculation(PreviousCalculationToCareTaker memento) {
		// TODO Auto-generated method stub
		this.firstNumber=((PreviousCalculationToOriginator)memento).getFirstNumber();
		this.secondNumber=((PreviousCalculationToOriginator)memento).getSecondNumber();
	}
	@Override
	public int getCalculationResult() {
		// TODO Auto-generated method stub
		return firstNumber+secondNumber;
	}
	@Override
	public void setFirstNumber(int firstNumber) {
		// TODO Auto-generated method stub
		this.firstNumber=firstNumber;
		
	}
	@Override
	public void setSecondNumber(int secondNumber) {
		// TODO Auto-generated method stub
		this.secondNumber=secondNumber;
		
	}
}

public class Momento_Pattern {
	public static void main(String args[]) {
		Calculator calculator = new CalculatorImplementaion();
		calculator.setFirstNumber(100);
		calculator.setSecondNumber(2);
		System.out.println(calculator.getCalculationResult());
		PreviousCalculationToCareTaker memento = calculator.backupLastCalculation();
		
		calculator.setFirstNumber(10000);
		calculator.setSecondNumber(-10000200);
		System.out.println(calculator.getCalculationResult());
		calculator.restorePreviousCalculation(memento);
		
		System.out.println(calculator.getCalculationResult());
	}
}

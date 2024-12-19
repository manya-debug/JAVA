class DivByZeroException extends Exception{
	public DivByZeroException(String message){
		super(message);
	}
}
public class TestMyException{
	public static void main(String[]args){
		System.out.println("Exception");
		int nr1=10;
		int dr1=0;
		int result;
		try{
			if(dr1==0){
				throw new DivByZeroException("Divide by Zero is not allowed");
			}
		}
		catch(DivByZeroException e1){
			System.out.println(e1.getMessage());
		}
		catch(ArithmeticException e2){
			System.out.println(e2.getMessage());
		}
		finally{
			System.out.println("Finally block executed");
		}
	}
}
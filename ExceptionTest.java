public class ExceptionTest{
	public static void main(String args[]){
		try{
			int a = 15;
			System.out.println(15/0);		
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Finally bloack executed");
		}
		System.out.println("Rest of the code");//added comment
	}
}

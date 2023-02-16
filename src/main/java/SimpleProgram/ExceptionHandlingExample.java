package SimpleProgram;


	public class ExceptionHandlingExample {
	    public static void main(String[] args) {
	        try {
	            int[] numbers = {1, 2, 3};
	            System.out.println(numbers[4]); // trying to access element at index 4 (which does not exist)
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("An error occurred: " + e.getMessage()); // handling the exception
	        } finally {
	            System.out.println("The program has completed."); // code in the finally block always executes, regardless of whether an exception occurred or not
	        }
	    }
	}




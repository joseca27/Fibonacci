
public class Fibonacci {
	
	
	    private int number;

	    public Fibonacci(int number){
	        this.setNumber(number);
	    }                     

	    public int result(int number){
	        if(number==1){
	            return 1;
	        }
	        else if(number==2){
	            return 1;
	        }
	        else{
	            return result(number-1)+result(number-2);// recursivo
	        }
	    }

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}
	
	
	}



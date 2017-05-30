
public class FizzBuzzCopyCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Loops from 0 10 100
		for(int i = 1; i < 101; i++){
			
			if(i == 50){
				System.out.println("CopyBuzzCat");
			}
			else if(i == 60){
				System.out.println("CopyFizzBuzzCat");
			}
			else if(i%3 == 0){
				System.out.println("Fizz");
			} 
			else if(i%2 == 0){
				System.out.println("Copy");
			}
			else if(i%5 == 0){
				System.out.println("Buzz");
			}
			else if(i%10 == 0 & i%2 == 0 & i%5 == 0){
				System.out.println("CopyBuzzCat");
			}
			else System.out.println(i);
		}
				
	}

}


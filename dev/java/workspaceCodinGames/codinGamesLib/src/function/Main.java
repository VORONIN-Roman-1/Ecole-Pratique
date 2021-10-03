package function;

public class Main {

	public static void main(String[] args) {
		//System.out.println(Fibonacci.fib(5));  // Фибоначи по индексу
		//System.out.println(SumChifre.sumChifreNumber(123));  // Сумма цифр числа
		//System.out.println(Anagram.isAnagram("Hello", "hloel"));  // Анаграммы
	//	System.out.println(MotToApperCase.motToAp("hello my name is idi"));  // Все слова с большой буквы
	//	System.out.println(MotToApperCase.motToAp("hello my's name is idi"));  // Все слова с большой буквы
		
	/*	int[] ints = {-9, 14, 37, 102};
		System.out.println(exists(ints, 102)); // true
		System.out.println(exists(ints, 36)); // false
		*/

	}
	// Java code below

	    static boolean exists(int[] ints, int k) {
	        int indexMin=0;
	        int indexMax=ints.length-1;
			while (indexMax>indexMin){
				
	            int index=(indexMax+indexMin)/2;
	            if (k>ints[index]) indexMin=index+1;
	            else if (k<ints[index]) indexMax=index;
	            else if (k==ints[index]) return true;
	            System.out.println(index);
	            System.out.println("min"+indexMin);
	            System.out.println("max"+indexMax);
	            
	        }
			
	        return false;
		}
}

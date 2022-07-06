public class ArrayDemo {

	public static void main(String[] args) {
	
		int[] numbers = new int[5];
		
		numbers[0]=12;
		numbers[1]=16;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		int[] nums = {15, 14, 19, 21, 32};
		
		for (int i=0; i<nums.length ; i++) {
		
			System.out.println(nums[i]);
		
		}
		
		//System.out.println(numbers.length);
	}

}
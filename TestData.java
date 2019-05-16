import java.util.Random;

public class TestData {
	
	 public static int[] generateIntArray(int size, NumberType numberType) {
		if(size < 0) {
			throw new IllegalArgumentException("size must be non-negative");
		}
		int[] result = new int[size];
		Random random = new Random();
		for(int i=0; i<size; i++) {
			switch (numberType) {
			
			case POSITIVE:
				result[i] = random.nextInt(Integer.MAX_VALUE) + 1;
				break;
			
			case NEGATIVE:
				result[i] = random.nextInt(Integer.MAX_VALUE) - Integer.MAX_VALUE;
				break;
			
			case NON_NEGATIVE:
				result[i] = random.nextInt();
				break;
				
			case NON_POSITIVE:
				result[i] = random.nextInt(Integer.MAX_VALUE) - Integer.MAX_VALUE-1;
				break;
				
			case ALL:
				result[i] = random.nextInt(Integer.MAX_VALUE) - Integer.MAX_VALUE/2;
				break;

			case ONLY_ZERO:
				result[i] = 0;
				break;
			}
		}
		return result;
	}
	
	
	
	
	public static enum NumberType{
		POSITIVE,
		NEGATIVE, 
		NON_NEGATIVE,
		NON_POSITIVE,
		ALL,
		ONLY_ZERO;
	}
	
}

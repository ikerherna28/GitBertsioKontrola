
public class debug_ariketa_2 {

private static int load = 1;
	
	public static void main(String[] args) {
		int i;
		int total;
		
		i = process(2);

		total = (i * 100) / load;
		if (load == 0)
			System.out.println("The value of total is infinity");
		else 
			System.out.println("The value of total is "+total);
	}

	private static int process(int step) {
		int i = 1;
		int result = step;
		for (; i <= 3; ++i) {
			result = result * i * step + step;
			if (result > 100) {
				load = 0;
				step = step - result;
			}
			else {
				load = load * result;
				++step;
			}
		}
		
		// i, step, result, eta load aldagaien balioak
		System.out.println("i: " + i);
		System.out.println("step: " + step);
		System.out.println("result: " + result);
		System.out.println("load: " + load);

		return result;	
	}
}


import java.util.Arrays;
class NewSort {
	public static void main(String args[]) {
		int data[] = {
			3, -4, 0, 6, 1
		}
		;
		Arrays.sort(data);
		for (int c: data) {
			System.out.println(c);
		}
	}
}
import java.util.ArrayList;

public class countOdd {
	public static ArrayList<String> fn(int num) {
		ArrayList<String> result = new ArrayList<String>();
		if (num == 0) {
			result.add("0");
			return result;
		}
		for (String nav : fn(num - 1)) {

		}
		return null;
	}

	public static void main(String[] args) {

	}
}

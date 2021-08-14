import java.util.*;

public class RansomNote {
	Map<String, Integer> magazineMap;
	Map<String, Integer> noteMap;

	publi RansomNote(String magazine, String note) {
	}

	public boolean solve() {
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}

public class MarksOutOfBound extends Exception {
	private int detail;

	MarksOutOfBound(int a) {
		detail = a;
	}

	public String toString() {
		return "MarksOutOfBound[" + detail + " is not within 0-100 range]";
	}
}

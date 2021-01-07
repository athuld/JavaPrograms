public class Synchronize {
	public static void main(String args[]) {
		Callme target = new Callme();
		Caller ob1 = new Caller(target, "HELLO");
		Caller ob2 = new Caller(target, "SYNCHRONIZED");
		Caller ob3 = new Caller(target, "WORLD");
		// wait for threads to end
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}

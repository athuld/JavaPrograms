public class Even extends Thread {

	int l, h, i;

	Even(Range r) {
		this.l = r.n1;
		this.h = r.n2;
		this.start();
	}

	public void run() {
		for (i = l; i <= h; i++) {
			if (i % 2 == 0)
				System.out.print("\nEven Number :" + i);
		}
	}
}

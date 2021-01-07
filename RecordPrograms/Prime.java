public class Prime extends Thread {
	int l, h, i, p, j;

	Prime(Range r) {
		this.l = r.n1;
		this.h = r.n2;
		this.start();
	}

	public void run() {
		if (l == 2 || l == 3)
			System.out.print("\nPrime Number:" + l);
		for (i = l; i <= h; i++) {
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {
					break;
				}
			}

			if (i == j) {
				System.out.println("\nPrime Number:" + i);
			}
		}
	}
}

public class JoinSleepthread {
	public static void main(String[] args) throws InterruptedException {

		final Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println(i);
				}

			}
		};

		final Thread t2 = new Thread() {
			@Override
			public void run() {

				for (int i = 10; i <= 20; i++) {
					System.out.println(i);
					try {
						t1.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println("---------------------------------------------------------------------------");
			}
		};

		Thread t3 = new Thread() {
			@Override
			public void run() {

				try {
					t2.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				for (int i = 20; i <= 30; i++) {
					System.out.println(i);
				}

				System.out.println("-------------------------------------------------------------------------------");
			}
		};

		t1.start();

		t2.start();

		t3.start();

		

		System.out.println("Task is finished");
	}
}
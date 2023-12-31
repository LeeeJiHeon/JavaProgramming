package week_12;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

//class Prize5Exception extends Exception {}
//class Prize4Exception extends Exception {}
//class Prize3Exception extends Exception {}
//class Prize2Exception extends Exception {}
//class Prize1Exception extends Exception {}

public class Lotto9_3 extends Frame implements ActionListener {
	// la[0] : lotto number
	// la[1] : lotto looping number
	// la[2] : Bonus
	// la[3] : cnt
	// la[4] : Prize Message!
	// la[5] : State Message!
	
	Label la1, la2;
	Label la3; // Bonus
	Label la4; // cnt
	Label la5; // Prize Message!
	Label la6; // State Message!
	Button b1;
	Panel p1, p2;
	int lot[], lot2[], prize[], pos[], bonus, years;
	String expense;
	Thread t;
	boolean isbonus;
	boolean isrun;
	RunnableDemo R1;

	public Lotto9_3() {
		super("My Lotto Program 2");

		lot = new int[6];
		lot2 = new int[6];
		prize = new int[6];

		setLayout(new GridLayout(5, 1));
		Font f = new Font("TimesRoman", Font.BOLD, 40);
		la1 = new Label("0   0   0   0   0", Label.CENTER);
		la2 = new Label("0   0   0   0   0", Label.CENTER);
		la3 = new Label("0", Label.CENTER);
		la4 = new Label("0", Label.CENTER);
		la5 = new Label("0", Label.CENTER);
		la6 = new Label("0", Label.CENTER);
		la1.setFont(f);
		la2.setFont(f);
		la3.setFont(f);
		la4.setFont(f);
		la5.setFont(f);
		la6.setFont(f);
		la1.setBackground(Color.lightGray);
		la2.setBackground(Color.cyan);
		la3.setBackground(Color.green);
		la4.setBackground(Color.magenta);
		la5.setBackground(Color.orange);
		la6.setBackground(Color.YELLOW);
		b1 = new Button("Start");
		b1.addActionListener(this);
		b1.setFont(f);
		p1 = new Panel(new GridLayout(1, 3));
		p1.add(la3);
		p1.add(la4);
		p1.add(la5);
		
		add(la1);
		add(la2);
		add(p1);
		add(la6);
		
		p2 = new Panel(new GridLayout(1, 2));
		p2.add(b1);
		add(p2);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});

		// initLottoNo(lot);
		// javaSort(lot);
		//
		// running();
		//
		// // System.out.println(toString());

	}

	class RunnableDemo implements Runnable {
		public Thread t;
		private String threadName;
		boolean suspended = false;

		RunnableDemo(String name) {
			threadName = name;
			System.out.println("Creating " + threadName);
		}

		// public void run() {
		// System.out.println("Running " + threadName );
		// try {
		// for(int i = 10; i > 0; i--) {
		// System.out.println("Thread: " + threadName + ", " + i);
		// // Let the thread sleep for a while.
		// Thread.sleep(300);
		// synchronized(this) {
		// while(suspended) {
		// wait();
		// }
		// }
		// }
		// } catch (InterruptedException e) {
		// System.out.println("Thread " + threadName + " interrupted.");
		// }
		// System.out.println("Thread " + threadName + " exiting.");
		// }

		public void run() {
			int cnt = 0;

			dispLottoNo(lot, la1);

			// for (int i = 0; i < 1000; i++) {
			while (true) {
				dispLottoNo(lot2, la2);
				dispBonusNo();

				try {
					checkPrize();
				} catch (Prize5Exception e1) {
					// la5.setText("Prize 5 ");
					// System.out.println("Prize 5 Exception called. " +
					// Lotto9_3.this.toString());
				} catch (Prize4Exception e1) {
					la5.setText("Prize 4");
					System.out.println("Prize 4 Exception called. " + Lotto9_3.this.toString());
				} catch (Prize3Exception e1) {
					la5.setText("Prize 3");
					System.out.println("Prize 3 Exception called. " + Lotto9_3.this.toString());
				} catch (Prize2Exception e1) {
					la5.setText("Prize 2");
					System.out.println("Prize 2 Exception called. " + Lotto9_3.this.toString());
				} catch (Prize1Exception e1) {
					la5.setText("Prize 1");
					System.out.println("Prize 1 Exception called. " + Lotto9_3.this.toString());
					System.exit(0);
				} catch (Exception e) {
					// e.printStackTrace();
					la5.setText("Other Exception called.");
					System.out.println("Other Exception called.");
				}
				cnt++;

				la4.setText("" + cnt);

				years = cnt / 5 / 48;
				expense = cnt + "x1000";
				la6.setText("Start" + " : " + (cnt++) + ", " + (cnt / 5 / 48) + " years" + ", " + expense);

				try {
					Thread.sleep(3);

					synchronized (this) {
						while (suspended) {
							wait();
						}
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} // while
				// System.out.println("Finished...");
		}

		public void start() {
			System.out.println("Starting " + threadName);
			if (t == null) {
				t = new Thread(this, threadName);
				t.start();
			}
		}

		void suspend() {
			suspended = true;
		}

		synchronized void resume() {
			suspended = false;
			notify();
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (R1 == null) {
			R1 = new RunnableDemo("Thread-1");
			R1.start();
			//isrun = true;
		}
		
		if (isrun == false) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			R1.resume();
			isrun = true;
			b1.setLabel("Stop");
			System.out.println("Resuming First Thread");

		} else {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			R1.suspend();
			isrun = false;
			b1.setLabel("Start");
			System.out.println("Suspending First Thread");
		}

		//
		// if (isstart) {
		// isstart = false;
		// t = null;
		// } else {
		// isstart = true;
		// t = new Thread(this);
		// t.start();
		// }
		//
		// System.out.println("isstart=" + isstart);

		// if (isstart == true && t == null) {
		// t = new Thread(this);
		// t.start();
		// }

		// if (t != null && isstart) {
		// t.interrupt();
		// }
	}

	public void checkPrize() throws Exception {
		int cnt = 0;

		for (int i = 0; i < lot.length; i++) {
			for (int j = 0; j < lot2.length; j++) {
				if (lot[i] == lot2[j]) {
					cnt++;
				}
			}
		}

		isbonus = false;
		if (cnt == 5) {
			for (int j = 0; j < lot2.length; j++) {
				if (lot[j] == bonus) {
					isbonus = true;
				}
			}
		}
		switch (cnt) {
		case 0:
		case 1:
		case 2:
			prize[5]++;
			break;
		case 3: // 5등
			prize[4]++;
			throw new Prize5Exception();
		case 4: // 4등
			prize[3]++;
			throw new Prize4Exception();
		case 5:
			if (isbonus) { // 2등
				prize[1]++;
				throw new Prize2Exception();
			} else { // 3등
				prize[2]++;
				throw new Prize3Exception();
			}
		case 6: // 1등
			prize[0]++;
			throw new Prize1Exception();
		}
	}

	public String toString() {
		return "Lotto5_3 [lot=" + Arrays.toString(lot) + ", lot2=" + Arrays.toString(lot2) + ", prize="
				+ Arrays.toString(prize) + ", bonus=" + bonus + ", years=" + years + ", expense=" + expense + "]";
	}

	// public void initLottoNo(int lottery[]) {
	public void dispLottoNo(int lottery[], Label lab) {
		boolean hasValue = false;
		int cnt = 0;
		Random rd = new Random();

		while (cnt < lottery.length) {
			int num = rd.nextInt(45) + 1;
			hasValue = false;

			for (int j = 0; j < lottery.length; j++) {
				if (lottery[j] == num)
					hasValue = true;
			}
			if (hasValue == false) {
				lottery[cnt] = num;
				cnt++;
			}
		}

		javaSort(lottery);

		java.util.Arrays.sort(lottery);
		lab.setText(String.format("%02d ", lottery[0]) + String.format("%02d ", lottery[1])
				+ String.format("%02d ", lottery[2]) + String.format("%02d ", lottery[3])
				+ String.format("%02d ", lottery[4]) + String.format("%02d ", lottery[5]));
	}

	// public void initBonusNo() {
	public void dispBonusNo() {
		boolean hasValue = false;
		Random rd = new Random();

		while (true) {
			int num = rd.nextInt(45) + 1;
			hasValue = false;

			for (int j = 0; j < lot.length; j++) {
				if (lot2[j] == num)
					hasValue = true;
			}
			if (hasValue == false) {
				bonus = num;
				break;
			}
		}

		la3.setText(String.format("%02d ", bonus));
	}

	public void javaSort(int lottery[]) {
		java.util.Arrays.sort(lottery);
	}

	public static void main(String[] args) {
		Lotto9_3 lot = new Lotto9_3();
		lot.setSize(900, 500);
		lot.setVisible(true);
	}
}

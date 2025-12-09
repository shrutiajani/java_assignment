package p1;

	
		class MyThread extends Thread {
		    public void run() {
		        System.out.println("Thread running using Thread class");
		    }
		}

		public class TestThread {
		    public static void main(String[] args) {
		        MyThread t = new MyThread();
		        t.start();
		    }
		

	}



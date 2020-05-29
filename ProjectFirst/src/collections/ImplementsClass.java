package collections;

interface Runnable<T> {
	// run 추상메소드
	public void run(T t);
}

class Car implements Runnable<String> {
	@Override
	public void run(String str) {
		System.out.println("자동차가 달립니다.");
	}
}

class Bus implements Runnable<String> {
	@Override
	public void run(String str) {
		System.out.println("버스가 달립니다.");
	}
}

public class ImplementsClass {
	//메소드 구현.
	
	public static void callRun(Runnable<String> runnable) {
		runnable.run("Hello");
	}
	
	public static void main(String[] args) {
		Runnable<String> runnable = new Car();
		runnable.run("Car");
		runnable = new Bus();
		runnable.run("Bus");
//		runnable = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("달립니다.");
//			}
//		};
		// ↑↓와 같음
		runnable = (str) -> System.out.println("익명 객체 달립니다.");
		runnable.run("Run");
	
		callRun(new Car());
//		callRun(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("메소드 매게값 달립니다.");
//			}
//		});
		callRun((str) -> System.out.println("메소드 매개값 달립니다."));
		
	}
}

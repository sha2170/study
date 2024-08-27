package JavaEx02;

public class Singleton {
	// 클래스 자신의 타입으로 static 필드 선언
	private static Singleton singleton = new Singleton();
	
	// 외부에서 new 연산자로 생성자를 호출할 수 없도록 private으로
	private Singleton() {}
	
	// 외부에서 호출할 수 없는 static 메서드 사용
	public static Singleton getInstance() {
		// 자기자신의 객체를 리턴
		return singleton;
		
	}
}

package JavaEx02;

public class SingletonEx {

	public static void main(String[] args) {
		Singleton ob1 = Singleton.getInstance();
		Singleton ob2 = Singleton.getInstance();
		
		if(ob1 == ob2) {
			System.out.println("같은 Singleton 객체입니다.");
		}
		else {
			System.out.println("다른 Singleton 객체입니다.");
		}

	}

}

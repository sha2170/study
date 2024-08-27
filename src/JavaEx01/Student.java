package JavaEx01;

public class Student {
	// 멤버 필드
	private String stdNo; // 학번
	private String stdName; // 이름
	private int stdYear; // 학년
	
	// 매개변수가 있는 생성자
	// 생성자 : 클래스 이름과 동일한 메서드 | 멤버 필드를 초기화할 때 사용
	// 객체가 생성될 때 멤버 필드에 값을 저장하기 위해 사용
	// 호출하지 않아도 객체 생성될 때 자동으로 호출
	// 반환형 return 없음
	
	public Student(String stdNo, String stdName, int stdYear) {
		super(); // 자바의 모든 클래스는 object 클래스를 상속받음
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.stdYear = stdYear;
	}

	@Override
	public String toString() {
		return "Student [stdNo=" + stdNo + ", stdName=" + stdName + ", stdYear=" + stdYear + "]";
	}

	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdYear() {
		return stdYear;
	}

	public void setStdYear(int stdYear) {
		this.stdYear = stdYear;
	}
	
}

# ☁️STUDY☁️

### **📝 기초**
<details>
  <summary><h5><strong>Git과 Github</strong></h5></summary>
  
  <small>
  ** Git **<br>
    - 버전 제어 시스템<br><br>

  역할 <br>
    - repositories를 사용하여 프로젝트 관리<br>
    - 로컬 복사본에서 작업하기 위한 프로젝트 clone<br>
    - staging / commit<br>
    - branch / merge<br>
    - pull<br>
    - push<br><br>

  작업 과정<br>
    1. 폴더에서 Git 초기화 (init) > repository 만듦<br>
    2. 파일이 변경/추가/삭제 > 수정<br>
    3. stage에 추가할 수정된 파일 선택<br>
    4. staging된 파일 commit<br><br>

  Git을 사용하는 이유<br>
    - 개발자의 70% 이상이 사용중<br>
    - 어디서나 협업 가능<br>
    - 프로젝트 전체 내역 보기 가능<br>
    - 이전 버전으로 돌아가기 가능<br><br>

  Git 버전 확인 : git --version<br>
  DefaultBranch 확인 : git config --get init.defaultBranch<br>
  DefaultBranch 변경 : git config --global init.defaultBranch main<br><br>

  Git 설정 | user.name ,  user.email<br>
    - 로컬의 모든 저장소에 대한 사용자 이름과 이메일 설정<br>
    - git config --global user.name "사용자 이름"<br>
    - git config --global user.email "사용자 이메일"<br><br>

  mkdir | make directory <br>
    - 새로운 디렉토리(폴더)를 생성하는 명령어<br>
    - 현재 작업 중인 디렉토리 또는 지정된 경로에 새로운 디렉토리 생성<br>
    - mkdir workspace<br><br>
    
  cd | change directory<br>
    - 현재 작업 디렉토리를 변경하는 명령어<br>
    - 터미널에서 작업할 디렉토리 이동<br>
    - cd workspace<br><br>

  Git 초기화 : git init<br>
  Git 새파일 추가<br>
    - 빈 Repo에 파일 추가되면 모든 파일 추적 불가<br>
    - Git에서 추적하도록 하려면 파일 staging / staging 환경에 추가<br>
  Git 확인 : git status<br><br>

  Git Staging 환경<br>
    - 작업하는 동안 파일 추가/편집/제거 가능<br>
    - 작업의 일부를 완료할 때마다 Staging 환경에 추가해야함<br>
    - Staging된 파일은 작업 중인 저장소에 commit할 준비가 된 파일<br><br>

  git 폴더에 저장 > staging 환경에 추가 > commit<br>
  staging 환경에 추가 : git add 파일명<br>
  현재 디렉터리에 모든 파일을 staging 환경에 추가 : git add --all<br><br>

  Git Commit<br>
    - commit해야 진행 상황과 변경 사항 추적 가능<br>
    - commit할 때 commit message 포함 명확하게<br>
    - git commit -m "메시지 내용"<br><br>

  git status --short<br>
    - ?? : 추적되지 않은 파일<br>
    - A : 추가된 파일<br>
    - M : 수정된<br>
    - D : 삭제된<br><br>

  git commit -a -m "커밋 메시지"<br>
    - staging 환경 건너뛰고 바로 커밋 가능<br>
    - 권장하지 않음<br><br>

  커밋 로그 확인 : git log<br><br>

  Git 도움말<br>
    - git 명령어 -help : 특정 명령에 대해<br>
    - git 명령어 --all : 가능한 모든 명령 보기<br>
        - 터미널 목록보기에 갇히면, shift+G (목록끝 이동), q키로 종료<br><br>

  Git Branch<br>
    - 메인 repo의 새로운/별도의 버전<br>
    - main 브랜치에 영향을 주지 않고 프로젝트의 다양한 부분 작업<br>
    - 작업이 완료되면 기본 프로젝트와 병합 가능<br>
    - 작업 중인 프로젝트를 방해하거나 망가뜨리고 싶지 않을 때 : 새로운 branch 만들어서 작업<br>
        : git branch 브랜치명<br>
    - branch 확인 : git branch<br>
    - branch 변경(checkout) : git checkout 브랜치명<br>
    - 해당 branch가 없으면 새 branch 생성하고 이동 : git checkout -b 브랜치명<br><br>

  Branch 병합 (Merge)<br>
    - 메인 branch에서 작업<br>
    - git merge "병합할 branch명"<br>
    - 병합 후 임시 브런치 삭제 : git branch -d 브랜치명<br><br>

  git remote add origin 리모트repoURL<br><br>

  git push --set-upstream origin main<br>
    - main 브랜치를 originURL에 push, 기본 remote branch 설정<br>
    - 처음 인증 에러가 나면 : git credential -cache exit<br>
  </small>
</details>


<details>
  <summary><h5><strong>JAVA</strong></h5></summary>

  
  <small>
  ** JAVA **<br><br>

  줄바꿈<br>
    - System.out.println : 줄바꿈 O<br>
    - System.out.print : 줄바꿈 X<br><br>

  주석 처리<br>
    - 짧은 주석 : //<br>
    - 긴 주석 : /* */<br><br>

  메서드<br>
    - nextInt() : 정수를 가져오는 메서드<br>
    - nextDouble() : 실수를 가져오는 메서드<br><br>

  변수 : 데이터를 저장하는 메모리 공간, 선언과 초기화<br>
  데이터타입<br>
    - 정수형<br>
        int age = 24;<br>
        long population = 890000000000L;<br>
    - 실수형<br>
        double height = 169.4;<br>
        float weight = 70.5f;<br>
    - 문자형<br>
        char ch = '3';<br>
    - 논리형 | true/false<br>
        boolean isStudent = true;<br> <br>
  System.out.println("Age: " + age);<br>
    > 결과 : 24<br>

  명시적 형 변환(타입 캐스팅) : 큰 타입에서 작은 타입으로 수동 변환<br>
    double pi = 3.14;<br>
    int truncatedPi = (int) pi;<br>
    System.out.println("pi: "+ pi+", truncatedPi: " + truncatedPi);<br>
      > 결과 : pi: 3.14, truncatedPi: 3<br><br>

  연산자<br>
    - 산술연산자 : +, -, *, /<br>
    - 비교연산자 : ==, !=, >, <, <=, >=<br>
    - 논리연산자 : &&, ||, !<br><br>

  수를 입력받아 홀수인지 짝수인지 판별하는 프로그램<br><br>
    System.out.print("Enter number: ");<br>
    int num = sc.nextInt();<br>
    if (num % 2 == 0) {<br>
      System.out.println(num + " is an even number.");<br>
    } else {<br>
      System.out.println(num + " is an odd number.");<br>
    }
    if (num < 10) {<br>
			System.out.println(num + "은 한 자리 숫자입니다.");<br>
	 }<br>
		elseif (num < 100) { <br>
			System.out.println(num + "은 두 자리 숫자입니다.");<br>
	 }<br>
		else if (num < 1000) {<br>
			System.out.println(num + "은 세 자리 숫자입니다.");<br>
	 }<br><br>

  Switch문<br>
  	- switch문의 변수는 프리미티브 타입이어야 함<br><br>
  switch(num) {<br>
	case 1 : System.out.println("일");<br>
 		break;<br>
	case 2 : System.out.println("이");<br>
 		break;<br>
	default:<br>
 		System.out.println("아무것도 아님");<br>
	 	break;<br>
	 }<br><br>

 반복문<br>
 	- for : 고정된 횟수만큼 사용<br>
	* for(초기식; 조건식; 증감식)<br>
 	- while문 : 조건식이 참인동안 반복<br>
	- do~while문 : 코드 블록을 먼저 실행하고, 조건이 참이면 반복문 실행<br><br>
</details>

<details>
	<summary><h5><strong>프리미티브 타입 | 레퍼런스 타입</strong></h5></summary>

 <small>
 	변수 : 데이터를 보관하는 장소(memory)<br>
	- primitive 타입<br>
 			- 기본적인 데이터 타입(int/float 등)<br>
			- 값 자체를 저장<br>
	- reference 타입<br>
 			- 객체나 배열 같은 데이터 구조의 참조(주소)를 저장<br>
			- String, 객체<br>
	- 변수는 사용 전에 반드시 선언되어 있어야함
 	* 선언이란, '이름', '타입'을 지정하는 것<br><br>

 primitive 타입<br>
 	- 8가지 기본 데이터 타입<br>
		1. byte(1byte) : 정수<br>
		2. short(2bytes) : 정수<br>
		3. int(4bytes) : 정수<br>
		4. long(8bytes) : 정수<br>
		5. float(4bytes) : 실수<br>
		6. double(8bytes) : 실수<br>
		7. char(2bytes) : 문자 하나<br>
		8. boolean (not defined) : true, false<br><br>

 	- 기본 값을 가짐 | 정수 0, 실수 0.0 <br>
	- 값에 직접 접근하기 때문에 연산 속도가 빠름<br>
 	- 단순한 값을 저장하는 데 사용 | 추가적인 메서드나 속성을 가지지 않음<br><br>

reference 타입<br>
	- String(문자열) 포함 그 외 나머지 모두<br>
 	- reference 타입의 변수의 기본값은 항상 "NULL" | NULL은 어떤 객체도 참조하고 있지 않음을 의미<br>
	- 메모리 주소를 통해 값에 접근 | primitive 타입에 비해 상대적으로 접근속도가 느림<br>
 	- 객체이므로 메서드와 속성을 포함<br>
		 * 더 복잡한 동작화 데이터 관리가 가능<br>
	 	 * 메서드와 속성에 접근하기 위해서 멤버 연산자(.)를 사용<br><br>

* Java는 primitive 타입과 reference 타입 간의 변환을 위해 오토박싱과 언박싱을 제공함<br><br>

오토박싱(autoboxing)<br>
	- primitive 타입의 값을 해당하는 wrapper class 객체로 자동 변환하는 과정<br>
 	- Integer reflnteger = 5;<br>
	- primitive 값 5가 Integer 객체로 자동 변환<br><br>

언박싱(unboxing)<br>
	- wrapper class 객체에서 primitive 타입의 값을 자동으로 추출하는 과정<br>
 	- int primitiveInt = reflnteger;<br>
	- Integer 객체를 다시 기본형 int로 자동 변환<br><br>
</details>

<details>
	<summary><h5><strong>배열과 반복문</strong></h5></summary>

 <small>
 ** 배열 **<br>
  - 동일한 타입의 데이터를 연속적으로 저장하는 데이터 구조<br>
  - 배열의 변수는 참조형 변수(래퍼런스 타입)<br>
  - 인덱스와 값을 일대일 대응해 관리하는 자료구조<br>
  - 어떤 위치에 있는 데이터든 한 번에 접근 가능<br>
  - 배열의 크기는 생성 시에 결정, 이후 변경 불가능<br>
  - 순차적 접근 / 임의 접근 모두 가능<br><br>

배열 선언 : 타입[] 변수명;<br>
  	    int[] numbers; | 정수형 배열 선언<br><br>

정적 초기화<br>
  	- 배열을 생성하면서 동시에 초기값을 지정<br>
   	- int[] numbers = {2, 4, 6, 8, 10}; | 선언과 동시에 초기화<br>
동적 초기화<br>
  	- 배열을 생성할 때 크기만 지정, 이후에 각 요소에 값을 할당<br>
   	- String[] names = new String[5]; | 선언과 동시에 초기화<br>
     	- String[] names; | 선언<br>
          names = new String[5]; | 초기화<br><br>

배열의 길이<br>
   	- .length 속성을 통해 배열의 길이(요소의 길이)를 알 수 있음<br>
    	- numbers.length<br><br>

배열 요소에 접근 및 수정<br>
	- 접근 : 인덱스 사용해서 배열의 특정 요소에 접근<br>
 		인덱스는 0부터 시작 | numbers[0]<br>
   	- 수정 : 특정 인덱스 요소에 새로운 값을 할당해서 배열의 요소를 수정<br>
    		numbers[0] = 1;<br><br>

배열의 요소 순회<br>
	- for 반복문 : for 반복문을 사용해서 배열의 모든 요소 순회<br>
 		      for(int i=0; i<numbers.length; i++)<br>
	 		{ numbers[i] = i; }<br>
    	- 향상된 for문 (for-each문)<br>
 		      for(int num:numbers)<br>
	 		{ num }<br><br>
2차원 배열<br>
	- 행과 열을 가진 테이블 형태의 데이터 구조<br>
 	- 배열의 배열로 구현<br>
  	- 매트릭스, 테이블 데이터, 그리드와 같은 복잡한 데이터 구조를 효율적으로 표현 가능<br>
   	- 인덱스 접근 | [행 인덱스][열 인덱스]<br>
    		int[][] arr = {{1,2,3},{4,5,6}}; | 2행 3열의 2차원 배열<br><br>

** java.util.arrays 클래스 **<br>
	- 배열을 다루기 위한 다양한 메서드들이 존재<br>
 	- sort(array) : 배열 요소를 오름차순으로 정렬<br>
  	- binarySearch(array,key) : 정렬된 배열에서 지정된 값의 인덱스를 이진검색 알고리즘을 사용해 찾음<br>
   	- CopyOf(originalArray, newLength) : 지정된 길이만큼 새로운 배열로 복사<br>
    	- equals(arr1,arr2) : 같은지 비교<br>
     	- fill(arr, value) : 배열의 모든 요소를 특정 값으로 채움<br>
      	- toString(arr) : 배열의 요소를 문자열 형태로 반환하여 출력하기 쉽게 함<br>
       	- deepToString(arr) : 다차원 배열의 요소를 문자열 형태로 반환하여 출력하기 쉽게 함<br>
	- deepEquals(arr1,arr2) : 다차원 배열의 내용이 같은지 깊은 비교<br><br>
 	

     
     
	  
	

  
  









   
</details>

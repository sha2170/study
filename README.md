# ☁️STUDY☁️

### **📝 기초**
<details>
  <summary><h5><strong>Git과 Github</strong></h5></summary>
  
  <small>
  **Git**<br>
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
  **JAVA**<br>

  
</details>


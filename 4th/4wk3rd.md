# 4주차 - 3강 Domain Model

### Domain Model 이란
* 사용자 인터페이스(웹에 대한 것) -> 응용 -> 도메인 -> 인프라스트럭쳐(DB, 웹에 대한 것.. 등 로우레벨)
* 응용+도메인 -> 묶어서 처리하고 있었음
* 여기서 __도메인 계층__만 모아서 Domain model이라 부름
* 주요 이유
  * 얇음
  * 업무 규칙 포함x
  * 작업을 조정
  * 도메인 객체의 협력자에게 위임
* 행위(Operation)이 중요함
* getter는 비즈니스 로직을 절대 포함하지x

### DAO vs Repository
* DAO가 데이터 관리 vs repository는 도메인 모델 관리
* DB중심 vs 도메인 도델 중심
* ERD 먼저 그림 vs 도메인 모델 먼저만든 후 JPA엔터티 매핑
  * 전자는 DB가 바뀌면 프로그램이 바뀜 vs 후자는 프로그램 지원하기 위해 DB조정


### java .of
[링크](https://sorjfkrh5078.tistory.com/314)

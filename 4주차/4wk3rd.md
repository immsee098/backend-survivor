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

- Repository 
- VO(Value Object)
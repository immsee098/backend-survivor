# 4주차 - 1강 Layered Architecture

* 관심사의 분리 -> 코드를 어떻게 배치하느냐=설계 -> 설계를 개선=리펙토링

### 관심사의 분리
* __관심사란?:__ 코드에 영향을 미치는 정보의 집합
* 응집도: 하나에 기능이 많이 뭉쳐져 있느냐
* 결합도: coupling. 하나를 고쳤더니 나머지 하나도 영향 받음
* 꼭 그런 건 아니지만 둘은 반비례 관계
  
### Layered Atchitecture
* 무엇을 기준으로 관심사를 나눠줄 것인가?
* __다층 구조__: 비즈니스 로직을 분리한 DB와 클라이언트 사이에 위치한 클라이언트 서버
  * ex. 3-tier, 4계층(DDD)
* 기능은 웹과 분리될 수 있음. 기능-비즈니스 로직 / 웹 - UI Layer, MVC Controller
  * 컨트롤러에 붙은 *기능*적인 건 다 빼줘야함 
  * 그래서 Service 생성해서 *기능을 위한 토대*를 전부 빼줌
  * 비즈니스 로직은 아래 계층에서 다룸


### Business Service
* 각 기능별 메서드로 분리하고, application 패키지에 모아둠

### UUID(범용고유식별자)
* identifier 전략
* sort가 안됨
* ULID
  * UUID랑 비슷한데 sort 가능
  * 이유: 시간을 넣어주기 때매
* TSID
  * 위에서 사용한 라이브러리와 동일한 개발자가 ULID를 개선


### 자바 이중 콜론 연산자(::)
* 람다식에서 파라미터를 중복해서 쓰기 싫을 때 사용
* 람다에서만 사용가능함. 아닐땐 new사용~
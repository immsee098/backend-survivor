# 5주차 - 2강 Unit Test

### V 모델
* 어떻게 테스트 할 거라는 걸 계획 가능
1. 요구사항 분석 → 사용자 중심 ⇒ 인수 테스트
2. 시스템 설계 → 시스템 사양 결정(스펙 문서) ⇒ 시스템 테스트
3. 아키텍처 설계 → 고수준 설계 ⇒ 통합 테스트 (개발자용)
4. 모듈 설계 → 저수준 설계 ⇒ 단위 테스트 (개발자용)
5. 구현 → 코딩
  
- Test Matrix
- 내적 품질(테스트 코드 작성등)을 높이면 좋은 이유
- JUnit
- 단위 테스트
- E2E 테스트

### 3계층
* Presentation - UI
* Domain - 문제 영역에 대한 것
* Data
[3계층](https://martinfowler.com/bliki/images/presentationDomainDataLayering/all_more.png)

### DAO(Data Access Object)
* __DataBase__에 접근 하기 위한 로직 & 비지니스 로직을 분리하기 위해 사용.
* 생성 시 캡슐화가 깨지지 않도록 외부로 return 하는 건 new로 새로 생성해서 보냄
  * ex)return new ArrayList<>(postsDtos)


### DAO와 Service의 차이
* DAO는 단일 데이터 접근/갱신만 처리. Service는 여러 DAO를 호출하여 여러번의 데이터 접근/갱신을 하며 그렇게 읽은 데이터에 대한 비즈니스 로직을 수행하고, 그것을 하나의(혹은 여러개의) 트랜잭션으로 묶는다. 
* 트랜젝션은 Service 단위 


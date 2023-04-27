# 3주차 - 1강 DTO

### DTO (Data Transfer Object) 란?
* -> 데이터 전송 객체
* 프로세스 간 통신(__IPC__, Inter-Process Communication), remote하게 작업할 때
  * 서로 다른 프로그램 간 통신
  * BE와 FE를 나눌 때 필수적인 것
  * IPC에서 사용하는 기술
    * File -> 가장 기본적인 접근. 원격에서 어려움
    * Socket -> 파일과 유사하나 원격에서 사용가능
      * HTTP 같은 고수준 프로토콜 활용
      * REST를 이용하면 RPC(SOAP등)가 아닌 Resource에 대한 CRUD로 정리해야함
    * Java에서는 RPC를 위해 RMI(Remote method Innovation)이란 기술을 제공 ~> 좀 프리함
      * 최근에는 제약을 많이 걺(http만 쓴다 등...)
* 사용 이유: 중요한 정보를 노출시키지 않고 통신을 원활하게 하기 위해
  
### “무기력한 도메인 모델” 
* 안티 패턴인 이유
  * 따지고보면 객체가 아닌 절차 지향적 모델임
* 도메인 객체들에 비즈니스 로직(확인, 계산, 비즈니스 규칙 등)이 거의 없거나 아예 없음

### DTO 
* 단순하게는 getter setter로만 이루어짐 
* 자바빈즈(JavaBeans)
  * 기본 생성자(constructor)을 가지고 있어야함
  * getter setter 필 
  * 링크 참조 (https://ko.wikipedia.org/wiki/%EC%9E%90%EB%B0%94%EB%B9%88%EC%A6%88)
* EJB(Enterprise JavaBeans)
  * 위의 java bean이랑 구별하기 위해서...
* Java의 record
  * 불변(immutable) 데이터 객체를 쉽게 생성할 수 있도록 하는 새로운 유형의 클래스
  * getter setter 자동

### Tier 간 전송
* DTO 자체를 그냥 전송 불가능->직렬화 하는 __마샬링__ 필요 ~> JSON으로 
* FE <-> BE 사이 or BE <-> DB 사이 
* VO(value object)를 DTO로 쓰기도 -> 이때의 DTO는 백과 DB와의 연결뜻람
* BE <-> FE / BE <-> Db 사이에 사용
- DAO
- ORM
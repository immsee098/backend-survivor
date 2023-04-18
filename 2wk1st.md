# 2주차 - 1강 REST API


### REST API
* FE와 BE를 연결하는 방법 중 하나. 애플리케이션 간 데이터 통신. REST API 대신 SOAP나 GraphQL등도 있다.
  * REST는 프로토콜이 아님 / SOAP는 프로토콜임
* Tomcat
  * WAS임
  * [웹서버와 was의 차이](https://gmlwjd9405.github.io/images/web/webserver-vs-was1.png)
- 자바 서블릿... 국비시절의 악몽이 되살아난다...

### API(Application Programming Interface)
* 애플리케이션을 만들기 위한 인터페이스 ~> 컴퓨터와 컴퓨터를 연결하기 위한 것
* 구현X 어떻게 소통하냐에 대한 명세O

### 정보은닉
* 내부에서 일어나는 것은 모두 감춰야함
* __정보은닉__(Information Hiding)과 __캡슐화__(Encapsulation)의 차이
  * 정보 은닉:어딘가의 뒤로 숨기는 것
  * 캡슐화: 한곳에 묶어줌. 내외부의 인터페이스를 통해서만 소통
  * 정보 은닉이 더 큰 개념. 그 안에 있는 것이 캡슐화


### REST
* 상태 전송 ~> 네트워크 기반 
* REST는 아키텍쳐를 위한 아키텍쳐 스타일..이다?
  * Architecture와 Architecture Style의 차이
    * Architecture: 이미 설계한 것
    * Architecture Style: 어떤 공통된 방법론
* Uniform Interface
  * 서버<->클라이언트 간
  * 구현은 독립적임 
* 필딩 제약 조건
  * 해당 제약 조건을 따르냐/따르지 않느냐로 REST 구분
  * __Resource__: 추상. 모든 시간에 통용되는 엔티티의 집합
    * 실제 데이터를 의미하는 것은 아님
  * API 문서->Swagger등.
    - 아래 참고 ~> 더 정리가 필요할 거 가은...
    - [https://www.youtube.com/watch?v=RP_f5dMoHFc](https://www.youtube.com/watch?v=RP_f5dMoHFc)
    - [https://blog.npcode.com/2017/03/02/바쁜-개발자들을-위한-rest-논문-요약/](https://blog.npcode.com/2017/03/02/%eb%b0%94%ec%81%9c-%ea%b0%9c%eb%b0%9c%ec%9e%90%eb%93%a4%ec%9d%84-%ec%9c%84%ed%95%9c-rest-%eb%85%bc%eb%ac%b8-%ec%9a%94%ec%95%bd/)
    - [https://blog.npcode.com/2017/04/03/rest의-representation이란-무엇인가/](https://blog.npcode.com/2017/04/03/rest%ec%9d%98-representation%ec%9d%b4%eb%9e%80-%eb%ac%b4%ec%97%87%ec%9d%b8%ea%b0%80/)

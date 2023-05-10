# 5주차 - 1강 Dependency Injection

### Factory
* 단일 책임 원칙 - 객체 직접생성x, 객체를 생성하는 책임 자체만 가진 객체 생성
* 해당 객체를 싱글턴처럼 쓸 수도
  
### Dependency Injection
* 의존성 주입(new 사용)
* 스프링의 경우 생성자 사용

### IoC(Inversion of Control)
* 제어의 반전 
* 순서대로 진행이 되며 제어권을 가지고 있음
* 프레임워크의 특징 같은 거

### Spring Bean Factory
* 스프링이 관리하는 객체들
* Application 파일의 @ComponentScan
  * @component 붙은 거 전부 가져다 쓰기
    * Bean Configuration 파일에 Bean을 따로 등록하지 않아도 사용할 수 있다
* @Controller, @Service, @Repository 등 붙은 것들 Bean 아래 넣어줌
* 참고(https://velog.io/@bunny/springboot-%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98-Service)

* 싱글톤 패턴이란?
* 객체의 인스턴스가 오직 1개만 생성되는 패턴
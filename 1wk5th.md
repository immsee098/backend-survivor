# 1주차 - 5강 spring web mvc

- [Spring](https://docs.spring.io/spring-framework/docs/current/reference/html/overview.html#overview)(링크된 문서에서 핵심을 캐치할 것, 괴롭지만 한 번은 해내야 함)
- Spring Boot
- Spring initializer
- Web Server와 Web Application Server(WAS)
    - Tomcat

  
### Spring MVC
* Model-View-Controller 아키텍쳐 패턴 
  + view -> 표현: 눈에 보이는 것들
  + controller -> 입력: 입력에 대한 처리(버튼을 누름 등..)
  + model -> 그 외의 모든것(버튼 입력 flag 값으로 불이 켜지거나 꺼지는 것 등..)
    - 관심사의 분리 : 모델에 핵심 비즈니스가 들어감 
    - View에서 참조하는 데이터 -> 일반적으로 쓰이는 데이터
      - Spring MVC는 Model 인터페이스 = Map과 유사
      - 웹 관련된 UI레이어에서만 MVC를 쓸 수 있게해줌
  + 더 큰 아키텍쳐 필요할 때도 
      - Webflux 도입
      - Controller 대신 Handler 사용하기도
      - 헥사고날 아키텍처 사용 시에 controller는 in 어댑터 중 하나일뿐.. (회사소스 잘보자..)


### Java Annotation
- Spring Annotation
    - @RestController 
      - 해당 컨트롤러는 아래 두 개의 어노테이션을 붙여 만든 어노테이션
        + @Controller
        + @ResponseBody
    - @GetMapping
        + @RequestMapping(method=RequestMapping.GET)

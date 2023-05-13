# 3주차 - 3강 Jackson ObjectMapper

### Jackson ObjectMapper 
* DTO <-(변환)-> JSON(문자열) 
* writeValueAsString : Object to String
* ObjectMapper
* `@JsonProperty`
  * key값 바꿔주는 것
  * 비슷한 것으로 JsonNaming -> 전체dto를 camel-case로 바꿔준다거나 등. 

#### Bean과 DI
* Spring이 등록된 객체를 관리 ~> Bean이라 부름
* 생성자에 해당 bean 명시하면 받아서 사용 가능함
* 사용한다 -> 의존성이 있다 -> Dependency Injection(DI)


### Component
* Spring이 관리함. 자동으로 @Component 붙어있는 것을 검색함(Component Scan)
* 이후 Spring IOC Container에 전부 주입해줌
  * IOC 컨테이너에서는 Singletone 즉 하나만 생성함(설정에 따라 조금씩 달라지기도..) 
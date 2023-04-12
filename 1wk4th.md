# 1주차 - 4강 Java HTTP Server

- Java HTTP Server
  - high level http api
    - InetSocketAddress : IP 주소 및 포트 번호에서 소켓 주소를 만듦(IP 소켓주소 구현)
  
- Java NIO
  - Java의 기존 IO를 개선한 패키지
  - 버퍼를 사용한 입출력으로 IO보다는 성능이 좋음. 버퍼 내에서 원하는 위치를 읽고 쓸 수 있음
  - IO는 블로킹 / NIO블로킹, 논블로킹 양쪽
  - 참고(https://brunch.co.kr/@myner/47)
  
- Java Lambda expression(람다식)
  - Lamda란: 메서드를 하나의 식(expression)으로 표현한 것 
  - Java Functional interface(함수형 인터페이스)
    - Handler처럼 인터페이스가 1개인 것들은 대체로 람다 사용 가능


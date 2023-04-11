# 1주차 - 2강 

### TCP/IP 통신
* __인터넷 프로토콜 스위트__: 인터넷에서 컴퓨터들이 서로 정보를 주고받는데 사용하는 프로토콜 모음. 
* TCP/IP는 이중 일부이다.(가장 많이씀)
+ http 1.1는 tcp/ip를 기반으로 올라간다


### TCP와 UDP
* 전송 계층의 대표적인 프로토콜
- TCP: 연결이 필요함. 전달 및 순서 보장. (전화)
- UDP: 연결하지 않고 데이터를 보냄. 전달 및 순서를 보장하지 않음. (편지)


### Socket과 Socket API 구분
* Socket 프로그래밍을 위한 api가 Socket API임
* 네트워크 소켓: endpoint(종착접)끼리 연결되는 것
* 소켓api: 위의 연결이 어떻게 되는지 프로그래밍 하는것

+ Socket은 파일과 유사하게 다룸 ~> JAVA는 IO를 Stream으로 모두 다룸


### TCP 통신 순서
1. Listen, 서버측 접속 요청 받는 소켓 오픈(포트 등 잡음)
2. Connect, 클라이언트 소켓 생성, 서버에 접속 요청
3. Accept, 서버는 접속 요청 받아서 통신 소켓 새로 생성
4. Send&Recive, 데이터 주고받음 (여러번 가능)
5. Close, 소켓 닫음(recieve로 인지)
* 단 JAVA Socket은 host, port만 알면 됨(2,3번 과정 알아서)
  * OutputStream or OutputStreamWriter을 많이 씀
  * Chunk -> 한 번에 처리하는 단위


### Http client
* 위의 2, 4, 5번 처리
  
  
### URI와 URL
+ _URI는 식별하고, URL은 위치를 가르킨다._
![URL URL](https://www.charlezz.com/wordpress/wp-content/uploads/2021/03/www.charlezz.com-uri-url-uri-vs-url.png)

- header 작성 시 example.com뒤에 / 슬래시 붙이는게 원칙이긴함.
- GET http://example.com/ HTTP/1.1 형태
- 호스트(host) : IP를 가진 양방향 통신이 가능한 컴퓨터
  - IP 주소
  - Domain name : 호스트명. 웹주소라 생각하면됨
  - DNS : Domain Name System ~> IP주소<->도메인으로 바꿔주는 데이터베이스 시스템. 네임서버임
    + 주소.com을 입력
    + 주소.com을 가지고 있는 네임 서버에 접속
    + IP 주소를 확인
    + IP 주소를 전달
    + IP 주소를 가진 서버로 접속
    + 연결된 브라우저 실행

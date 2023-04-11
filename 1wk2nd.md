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


### Http client
* 위의 2, 4, 5번 처리

15분
  
- URI와 URL
- 호스트(host)
    - IP 주소
    - Domain name
    - DNS
- 포트(port)
- path(경로)
- Java text blocks
- Java InputStream과 OutputStream
- Java try-with-resources

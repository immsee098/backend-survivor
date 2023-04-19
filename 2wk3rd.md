# 2주차 - 3강 Collection pattern 

### Java ServerSocket
  - Socket 상속이 아님. 완전 다른거임(Send/Recieve안됨)
    - _Socket_: 서버 프로그램으로 연결 요청. 데이터 전송을 담당(accept)
    - _ServerSocket_: 서버 프로그램에서 사용하는 소켓.포트를 통해 연결 요청이 오기를 대기
  
### Blocking vs Non-Blocking
  - Blocking: 제어권을 자신이 가짐. I/O에서 기다리는 것. TCP통신에서는 오래 멈추면 안되어서 비동기/이벤트 기반 처리가 필요함
  - Non-Blocking: 제어권을 남에게 줌. 남이 다른 일을 진행할 수 있게 함
  - 참고(https://jh-7.tistory.com/25)
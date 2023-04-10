# 1주차 - 1강 

#### HTTP(Hypertext Transfer Protocol)
* 무상태 프로토콜 ~> 각각의 요청이 독립적/즉 항상 누구인지 인지시켜줘야함
* 이를 위해 쿠키, 세션, 로컬 스토리지 등을 이용 
* 쿠키/세션 차이 적어두기


HTTP이란? : 
* HTML 등의 하이퍼미디어 문서를 전송하기 위한 애플리케이션 레이어(os 7계층) 프로토콜(규칙)
* but 브라우저<->서버간 통신을 위해 사용되기도.
* 아래는 확인해야 할 계층(2~4는 인프라 / 7은 직접 만드는 부분)
1. 2계층 - 데이터 링크 계층 ⇒ MAC address / 기기의 추상화(기기사면 생김)
2. 3계층 - 네트워크 계층 ⇒ IP address / 인터넷 프로토콜(서로를 인식 방법)
3. 4계층 - 전송 계층 → TCP, UDP ⇒ Port number / 프로그램간의 연결
4. 7계층 - 응용 계층 → HTTP 등
![http 이미지](https://developer.mozilla.org/en-US/docs/Web/HTTP/Overview/http-layers.png)
- tls를 거쳐서 바로 http를 사용
    
- HTTP와 HTTPS의 차이(TLS)
- 클라이언트-서버 모델:
    클라이언트 -> 요청하는 역
    서비스/리소스 -> 공급하는 쪽(html 하이퍼미디어 형태로 문서 전송)
- stateless와 stateful
- HTTP Cookie와 HTTP Session
- HTTP 메시지: 트랜젝션을 통해 서로 주고받음
    -기본적으로는 사람이 읽을 수 있는 형태 지향
    -기본적으로는 요청/응답 구조가 동일함
    -headers에 필요한 것 전부 담아줌(이쪽은 교제 복붙)

- HTTP 메시지 구조
    - HTTP 요청(Reuqest)와 응답(Response)
        - multipart/form-data
    - HTTP 요청 메서드(HTTP request methods)
        - 멱등성
    - HTTP 응답 상태 코드(HTTP response status code)
        - 리다이렉션

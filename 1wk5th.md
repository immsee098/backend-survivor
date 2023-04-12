# 1주차 - 5강 spring web mvc

### HTTP(Hypertext Transfer Protocol)
* __무상태 프로토콜__ ~> 각각의 요청이 독립적/즉 *항상* 누구인지 인지시켜줘야함
#### stateless와 stateful
* 이를 위해 쿠키, 세션, 로컬 스토리지 등을 이용 
* 쿠키/세션 
    + __쿠키__는 클라이언트(브라우저) 로컬에 저장되는 키와 값이 들어있는 작은 데이터 파일.
    + __세션__은 쿠키를 기반하고 있지만, 사용자 정보 파일을 브라우저에 저장하는 쿠키와 달리 세션은 서버 측에서 관리.
    + 보통 세션의 key는 쿠키로 관리함(accessToken 등)

#### HTTP이란? : 
* HTML 등의 하이퍼미디어 문서를 전송하기 위한 애플리케이션 레이어(os 7계층) 프로토콜(규칙)
* but 브라우저<->서버간 통신을 위해 사용되기도.
* 아래는 확인해야 할 계층(2~4는 인프라 / 7은 직접 만드는 부분)
  1. 2계층 - 데이터 링크 계층 ⇒ MAC address / 기기의 추상화(기기사면 생김)
  2. 3계층 - 네트워크 계층 ⇒ IP address / 인터넷 프로토콜(서로를 인식 방법)
  3. 4계층 - 전송 계층 → TCP, UDP ⇒ Port number / 프로그램간의 연결
  4. 7계층 - 응용 계층 → HTTP 등
![http 이미지](https://developer.mozilla.org/en-US/docs/Web/HTTP/Overview/http-layers.png)
  ~> tls를 거쳐서 바로 http를 사용
    
#### HTTP와 HTTPS의 차이(TLS)
* HTTPS를 사용한 웹 페이지를 통해 전송되는 모든 데이터는 추가적인 보안 계층이 존재. 암호화 추가됨.
* 이것이 TLS(전송계층보안) 프로토콜이라 함. 443번 포트 사용.
  
#### 클라이언트-서버 모델:
* 클라이언트와 서버 간의 상호작용을 기반으로 한 분산 컴퓨팅 모델
    - 클라이언트 -> 요청하는 역
    - 서비스/리소스 -> 공급하는 쪽(html 하이퍼미디어 형태로 문서 전송)


#### HTTP 메시지
* HTTP 메시지: *트랜젝션*을 통해 서로 주고받음
    + 기본적으로는 사람이 읽을 수 있는 형태 지향
    + 기본적으로는 요청/응답 구조가 동일함
      + Start line → 요청과 응답의 형태가 다름.
        + url link / method / 프로토콜 버전 등
      + Headers
        + response/request header
        + Content-length 받음(Body의 길이)
      + 빈 줄
      + Body
        + 크기를 알기 어려움
        + 텍스트가 아닐수도(이미지, 바이너리 등...~> multipart/form-data)
    + 해당 링크 참조 (https://developer.mozilla.org/ko/docs/Web/HTTP/Messages)
    ![http 메시지](https://developer.mozilla.org/en-US/docs/Web/HTTP/Messages/httpmsg2.png)

    + HTTP 요청(Reuqest)와 응답(Response)
    + HTTP 요청 메서드(HTTP request methods)
        - CRUD ~> GET/POST/PUT 등등...
          - POST는 Create
          - PUT는 바꿔치기(Overwrite/전체 업데이트)
          - PATCH는 Update(부분적 업데이트)
          - OPTIONS ~> CRUD중 뭐가 가능한지 등...
        - HEAD ~> 바디 없이 헤더만 얻기(권한 등)
        - 멱등성
          - 같은 행동을 여러번해도 동일성 보장(GET등) 
          - POST는 멱등성을 보장하지 않음
    - HTTP 응답 상태 코드(HTTP response status code)
        - 1XX, 2XX, 3XX, 4XX...
          - 1xx -> 정보성 / 직접 쓰는 일 드뭄(자세한 건 책)
          - 304 not modified ~> 캐시 등을 써서 바뀐 것이 없을때 보통 보임
          - 5XX -> 서버에러
        - 리다이렉션

# 3주차 - 4강 CORS

### Same-Origin Policy
* 웹 브라우저가 처리하는 보안 정책
* 동일 출처 정책
  * 리소스의 출처(BE)가 요청하는 현재 페이지(FE)랑 다르면 접근할 수 없게 하는 보안 정책
* JSONP
  * <script> 태그에서는 출처 따지지 않음을 이용
  * 허나 번거로운 방법... 그래서 나온 것이 브라우저에서 처리하는 CORS


### CORS 란(cross-orgin-resource sharing)
* api 응답 헤더에 `Access-Control-Allow-Origin` 속성 포함시키면 됨 
* 서버 쪽에 특정 요청이라면 괜찮다는 걸 의미
  * ex) Access-Control-Allow-Origin: https://ahastudio.com
  * 요청하는 쪽의 Origin을 써주면됨

### Spring Web MVC에서 CORS
* HttpServletResponse -> addHeader이용->요청하는 쪽의 Origin을 써주면됨
  * Origin에 * 해주면 모든 허용
* 근데 이렇게 하나하나 하면 너무 번거로우니 __`@CrossOrigin`__ 사용
* 


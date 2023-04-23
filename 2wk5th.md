# 2주차 - 5강 spring web mvc

* @RequestMapping
  - 아래 Annotation 상세 구현 들어가면 requestmappting이 다 붙어있음
  * @GetMapping
  * @PostMapping
  * @PatchMapping
  * @DeleteMapping
  * @PathVariable
    * URI 변수를 받는 용도 
* @RequestBody
  * body를 담아 보내야함
  * required false도 가능
* @ExceptionHandler
  * 컨트롤러 계층에서 나오는 예외를 잡아서 메서드로 처리해줌
  * Service, Repository에서 발생하는 에러는 제외 
  - 참고(https://velog.io/@kiiiyeon/%EC%8A%A4%ED%94%84%EB%A7%81-ExceptionHandler%EB%A5%BC-%ED%86%B5%ED%95%9C-%EC%98%88%EC%99%B8%EC%B2%98%EB%A6%AC)
* @ResponseStatus
  * http 상태코드 설정
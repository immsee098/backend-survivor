# 5주차 - 3강 Spring Test

### 통합 테스트(Integration Test)

### Spring Test
* Spring은 코드에 구조적으로 개입하는 게 적어서, 단위 테스트를 쉽게 작성할 수 O
* 모든 Bean을 IOC 컨테이너에 넣어줌 

### WebMvcTest
* springboot test보다 가벼움

### MockMvc
* 서버 띄우는 걸 흉내낼 수 있음
* 테스트 용도로만
* @SpyBean: mokito의 spy를 쓸 수 있게 해줌
  * Method가 어떻게 호출되는지 기록하는 용도

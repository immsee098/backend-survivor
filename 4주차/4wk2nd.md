# 4주차 - 2강 Data Access


### 3계층
* Presentation - UI
* Domain - 문제 영역에 대한 것
* Data
[3계층](https://martinfowler.com/bliki/images/presentationDomainDataLayering/all_more.png)

### DAO(Data Access Object)
* __DataBase__에 접근 하기 위한 로직 & 비지니스 로직을 분리하기 위해 사용.
* 생성 시 캡슐화가 깨지지 않도록 외부로 return 하는 건 new로 새로 생성해서 보냄
  * ex)return new ArrayList<>(postsDtos)


### DAO와 Service의 차이
* DAO는 단일 데이터 접근/갱신만 처리. Service는 여러 DAO를 호출하여 여러번의 데이터 접근/갱신을 하며 그렇게 읽은 데이터에 대한 비즈니스 로직을 수행하고, 그것을 하나의(혹은 여러개의) 트랜잭션으로 묶는다. 
* 트랜젝션은 Service 단위 


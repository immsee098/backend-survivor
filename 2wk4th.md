# 2주차 - 4강 Collection pattern 적용

### CRUD
* create, read, update, delete

### CQS
* CRUD의 중요한 특징-Command Query 둘로 나눌 수 있음
  * Command - Create, Update, Delete ~> 상태가 변함 안전하지 않음
  * Query - Read ~> 상태가 변하지 않음
* 상태를 바꾸면서 return 하지 말것.
  
1. `GET /posts` → 게시물 목록 (Read, Collection) → List (습관적인 표현 중 하나)
2. `GET /posts/{id}` → 게시물 상세 (Read, Element) → Detail (습관적인 표현 중 하나)
3. `POST /posts` → 게시물 생성 (Create) → Post ID는 서버에서 생성함.
4. `PUT 또는 PATCH /posts/{id}` → 게시물 수정 (Update, Element)
5. `DELETE /posts/{id}` → 게시물 삭제 (Delement, Element)


### 추상적인 개념?
* 로그인/로그아웃 등은... 추상적인 개념인 '세션'을 도입하곤 한다. 

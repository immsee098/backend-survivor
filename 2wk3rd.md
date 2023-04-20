# 2주차 - 3강 Collection pattern 

### Collection Pattern?
* 사용하는 경우: /posts, /posts/test 등... 모든 게시물 등을 하나의 URI로 표현 가능할떄
  * /posts/{id}(post id) 등으로 표현
  * 이때 post id는 리소스의 id가 아님 ~> resource id를 구성하는 요소 중 하나. posts 그룹 내 식별자(id)임
  * 그룹명(posts, items...etc)은 복수형으로 써주자
* /posts/1/comments or /comments?post_id=1 의 결과물은 동일
  * 삭제 등을 할 때는 디렉토리 구조가 아닌 /comments/1 형식으로 바로 쓰는 편이 나을지도
* /posts/1/edit -> 수정 등을 할 때는 행위를 표기하기도
* 그룹이 아니면 단수형을 쓴다(ex. /session)
  
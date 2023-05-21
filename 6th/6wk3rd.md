# 6주차 - 3강 Relational Algerbra

### 연산
* 하나의 relation으로 새로운 relation을 만들어냄
  * ex. join을 해서 새 튜플을 만들어냄
* 단항연산 / 다항연산


* 곱집합(Cartesian Product)
  * SELECT * FROM A1, B2 형태
  * 그럼 A1개수*A2개수 만큼 값이 찍힘 
  * 이걸 피하기 위해
  ```
  SELECT people.name, age, gender, items.name AS item_name, usage
  FROM people, items
  WHERE people.name = items.person_name;
  ```
  * 이걸 피하기 위해 join씀

관계 대수
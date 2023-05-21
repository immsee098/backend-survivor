# 6주차 - 2강 Relational Model

### 직렬화(Serialization)
* 객체를 *복구*할 수 있게 데이터화 하는 것. 원시 형태의 데이터를 변조함 
* 직렬화는 역직렬화를 통해 복원 가능함.
* 바이너리라면 Byte Stream, 텍스트라면 JSON이나 XML등
* 원래는 직렬화 = 마샬링과 비슷하나 JAVA에서는 좀 다름!

### 마샬링
* 마샬링이 좀 더 큰 개념. *변환의 과정* 자체를 뜻함
* 원격 객체로 복원 가능. 
* 변환자체에 목적이 있음. 대상과 변환할 오브젝트가 한정되지 x. 다른 언어간의 데이터 전송은 직렬화x 마샬링o

### JSON(Javascript Object Notation)
* key-value 쌍
* Java의 Map과 유사
* FE - BE가 통신할 떄 사용 


### JAVA의 DTO
* Java의 Map과 유사하나 스키마 관리및 안정성을 위해 DTO를 사용
* 데이터 전송이기만 하면DTO임 

## PrintMessage

문자열을 테두리 선으로 감싸거나 밑줄을 표시하는 예제 프로그램</br>
`framework`
1. `Product` : 추상 메소드 use와 createClone이 선언되어 있는 인터페이스
2. `Manager` : createClone을 사용해서 인스턴스를 복제하는 클래스

`Anonymous`
1. `MessageBox` : 문자열은 테두리로 표시하는 클래스, use와 createClone을 구현
2. `UnderlinePen` : 문자열에 밑줄을 표시하는 클래스, use와 createClone을 구현
3. `Main` : 동작 테스트용 클래스

> Manager에 ConcretePrototype들을 등록하고, 등록된 이름으로 Product를 clone해 사용한다.

> createClone 메소드가 중복된 내용으로 구현돼서 Product를 추상 메소드로 바꾸고 crateClone 메소드의 구현을 Product로 넘겼다.

> Product 가 Cloneable 인터페이스를 implements 해야 clone 메소드를 사용할 수 있다.

> 소스 내부에 클래스의 이름을 사용하지 않았기 때문에 소스 파일이 없어도 (class 파일만 가지고) 재사용할 수 있다.
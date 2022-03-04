## Print

주어진 문자열을 Adapter를 통해 변환해서 출력하는 프로그램

상속을 이용한 Adapter 패턴, Banner의 메소드를 Main에서 숨긴다. Print의 메소드를 이용해 호출

> Main 클래스에서 PrintBanner가 아닌 Print로 변수를 선언하는 이유는 PrintBanner 클래스는 Banner 클래스를 확장했기 때문에 Banner 클래스의 메소드에 접근할 수 있는데 Print로 변수를 선언하면 Print 인터페이스의 메소드들만 접근할 수 있게 되기 때문이다. 

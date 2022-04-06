## Prototype 패턴

인스턴스로부터 별도의 인스턴스를 만드는 패턴</br>

> 클래스로부터 인스턴스를 만들지 않고 인스턴스를 복사해서 새로운 인스턴스를 만드는 경우

1. 종류가 너무 많아 클래스로 정리되지 않는 경우
    > 취급하는 오브젝트의 종류가 너무 많아서 각각을 별도의 클래스로 만들어 다수의 소스 파일을 작성해야 하는 경우
2. 클래스로부터 인스턴스 생성이 어려운경우
    > 생성하고 싶은 인스턴스가 복작한 작업을 거쳐 만들어지기 때문에 클래스로부터 만들기가 매우 어려운 경우</br> ex) 사용자 조작으로 만들어진 인스턴스를 다시 만들고 싶은 경우
3. framework와 생성할 인스턴스를 분리하고 싶은 경우
    > 인스턴스를 생성할 때의 framework를 특정 클래스에 의존하지 않도록 만들고 싶은 경우</br>
    클래스 이름을 지정해서 인스턴스를 만드는 것이 아니라 이미 '모형'이 되는 인스턴스를 등록해 두고, 그 등록된 인스턴스를 복사해서 인스턴스를 생성

Prototype은 '원형', '모범'을 뜻하는데, 이러한 원형이 되는 Prototype 인스턴스를 통해 복제하는 clone을 수행
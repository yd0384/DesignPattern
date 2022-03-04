## Iterator 패턴

무엇인가 많이 모여있는 것들을 순서대로 지정하면서 전체를 검색하는 처리를 실행하기 위한 것

- `Aggregate` : 집합체를 나타내는 인터페이스, iterator를 가짐
- `Iterator` : 요소를 하나씩 나열, 루프 변수와 같은 역할을 수행하는 인터페이스

> 인터페이스를 만들고, ConcreteIterator, ConcreteAggregate를 구현해서 사용, `Concrete` : 구체적인 구현

> 여러개의 Iterator를 용도에 따라 만들 수 있다.
## TicketMaker

싱글톤 패턴을 활용하여 하나의 인스턴스만 생성되는 것을 보장하는 TicketMaker 클래스</br>
생성자를 private로 해서 클래스 외부로부터 new 되지 않도록 하는 것을 명심</br>
synchronized 키워드로 다중 스레드에서 실행된다고 해도 티켓 번호가 중복되지 않도록 함
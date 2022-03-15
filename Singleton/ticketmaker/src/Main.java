public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        System.out.println(TicketMaker.getInstance().getNextTicketNumber() + "번 티켓 발급완료");
        System.out.println(TicketMaker.getInstance().getNextTicketNumber() + "번 티켓 발급완료");
        System.out.println(TicketMaker.getInstance().getNextTicketNumber() + "번 티켓 발급완료");
        System.out.println("end");
    }
}

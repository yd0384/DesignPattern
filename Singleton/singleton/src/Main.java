public class Main {
    public static void main(String[] args){
        System.out.println("start");
        Singleton obj1 = Singleton.getSingleton();
        Singleton obj2 = Singleton.getSingleton();
        if (obj1 == obj2) {
            System.out.println("obj1과 obj2는 같은 인스턴스 입니다.");
        }
        else {
            System.out.println("obj1과 obj2는 다른 인스턴스 입니다.");
        }
        System.out.println("end");
    }
}

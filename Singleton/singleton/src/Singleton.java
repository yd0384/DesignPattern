public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("새 인스턴스를 생성했습니다.");
    }
    public static Singleton getSingleton() {
        return singleton;
    }
}

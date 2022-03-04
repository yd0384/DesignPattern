public class Banner{
    private String string;
    public Banner(String string) {
        this.string = string;
    }
    public void showWithParentheses() {
        System.out.println("(" + string + ")");
    }
    public void showWithAsterisk() {
        System.out.println("*" + string + "*");
    }
}
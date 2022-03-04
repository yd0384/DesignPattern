public class PrintBanner extends Print{
    private Banner banner;
    public PrintBanner(String string){
        this.banner = new Banner(string);
    }
    public void printWeak(){
        banner.showWithParentheses();
    }
    public void printStrong(){
        banner.showWithAsterisk();
    }
}

public class PrintBanner extends Banner implements Print{
    public PrintBanner(String string){
        super(string);
    }
    public void printWeak(){
        showWithParentheses();
    }
    public void printStrong(){
        showWithAsterisk();
    }
}

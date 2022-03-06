public class StringDisplay extends AbstractDisplay {
    private String string;
    private int width;
    public StringDisplay(String string){
        this.string = string;
        this.width = string.getBytes().length;
    }
    public void open(){
        printLine();
    }
    public void print(){
        System.out.println("|" + string + "|");
    }
    public void close(){
        printLine();
    }
    private void printLine(){
        System.out.print("+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < width; i++) {
            sb.append("-");
        }
        System.out.print(sb);
        System.out.println("+");
    }
}

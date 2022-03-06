public class CharDisplay extends AbstractDisplay {
    private char character;
    public CharDisplay(char character){
        this.character = character;
    }
    public void open(){
        System.out.print("<<");
    }
    public void print(){
        System.out.print(character);
    }
    public void close(){
        System.out.println(">>");
    }
}

package idcard;
import framework.*;

public class IDCard extends Product {
    private String owner;
    private int cardNumber;
    IDCard(String owner, int cardNumber) {
        System.out.println(cardNumber + "번 " + owner + "의 카드를 만듭니다.");
        this.owner = owner;
        this.cardNumber = cardNumber;
    }
    @Override
    public void use() {
        System.out.println(cardNumber + "번 " + owner + "의 카드를 사용합니다.");
    }
    public String getOwner() {
        return owner;
    }
    public int getCardNumber() {
        return cardNumber;
    }
}

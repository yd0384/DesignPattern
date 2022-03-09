package idcard;
import framework.*;
import java.util.*;

public class IDCardFactory extends Factory {
    private Map<Integer, String> owners = new HashMap<>();
    private int cardNumberCounter = 0;
    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, ++cardNumberCounter);
    }
    @Override
    protected void registerProduct(Product product) {
        owners.put(((IDCard)product).getCardNumber(), ((IDCard)product).getOwner());
    }
    public Map<Integer, String> getOwners() {
        return owners;
    }
}

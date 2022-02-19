package commom.base;

public class Order {
    private final String code;
    
    public Order(String code) {
        this.code = code;
    }

    public String toString() {
        return "Order={" + "code=" + code +"}";
    }
}

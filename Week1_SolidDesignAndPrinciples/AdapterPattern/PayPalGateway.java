package AdapterPattern;

public class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

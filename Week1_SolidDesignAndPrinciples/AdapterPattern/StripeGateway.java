package AdapterPattern;

public class StripeGateway {
    public void pay(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
    }
}

class PiggyBank {
    private int savings;
    private final String id;

    public PiggyBank(String id) {
        this.id = id;
        savings = 0;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            savings = savings + amount;
        }
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= savings) {
            savings = savings - amount;
            return true;
        }
        return false;
    }

    public int getSavings() {
        return savings;
    }

    public String getId() {
        return id;
    }
}

public class Main {
    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        pb.deposit(100);
        pb.withdraw(30);
        System.out.println("Savings: " + pb.getSavings());
        System.out.println("Withdrawal accepted: " + pb.withdraw(500));
        System.out.println("Savings: " + pb.getSavings());
    }
}

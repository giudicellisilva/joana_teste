public final class Purse {
    private final Currency currency;
    private long balance;
    /** Create a new purse with newly minted money,
     given the Currency capability. */
    public Purse(Currency currency, long balance) {
        this.currency = currency;
        this.balance = balance;
    }
    /** Create an empty purse with the same currency
     as an existing purse. */
    public Purse(Purse p) {
        currency = p.currency; balance = 0;
    }
    /** Transfer money into this purse from another. */
    public void takeFrom(Purse src, long amount) {
        if (currency != src.currency
                || amount < 0 || amount > src.balance
                || amount + balance < 0) {
            throw new IllegalArgumentException();
        }
        src.balance -= amount;
        balance += amount;
    }
    public long getBalance() {
        return balance;
    }
}

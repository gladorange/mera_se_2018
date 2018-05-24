package zudin.task10;

public class Product implements Item {
   private String name;
   private int priсe;
   private int balance;
   private int soldOut;

    public String getName() {
        return name;
    }

    public int getPriсe() {
        return priсe;
    }

    public int getBalance() {
        return balance;
    }

    public int getSoldOut() {
        return soldOut;
    }

    public Product(String name, int priсe, int balance, int soldOut) {
        this.name = name;
        this.priсe = priсe;
        this.balance = balance;
        this.soldOut = soldOut;
    }
}

public class User implements IObserver {
    private final String name;
    private final String password;
    private final int age;
    private final int charityAmmount = 1000;
    private int balance;

    public User(String name, String password, int age, int balance) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.balance = balance;
    }

    public void print() {
        String string = String.join("\r\n", "Name: " + this.name, "Password: " + this.password, "Age: " + this.age, "Balance: " + this.balance);
        System.out.println(string + "\n");
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public void notifyObserver() {
        this.balance += charityAmmount;
        System.out.println(this.name + " got " + charityAmmount + "!" + "\n");
    }
}

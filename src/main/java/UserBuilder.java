public class UserBuilder {
    private String name;
    private String password;
    private int age;
    private int balance;

    public User build() {
        return new User(this.name, this.password, this.age, this.balance);
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setBalance(int balance) {
        this.balance = balance;
        return this;
    }
}

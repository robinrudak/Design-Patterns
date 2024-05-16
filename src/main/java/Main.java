public class Main {

    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder();
        UserList userList = new UserList();
        Bank bank = new Bank("Charity Bank");

        User user = userBuilder
                .setName("jesus")
                .setPassword("gaming")
                .setAge(2)
                .setBalance(2000)
                .build();

        userList.addUser(user);
        User user2 = userBuilder
                .setName("bengan")
                .setPassword("banan123")
                .setBalance(1000)
                .build();
        userList.addUser(user2);

        User user3 = userBuilder
                .setName("sven")
                .setPassword("gaming")
                .setBalance(5000)
                .setAge(30)
                .build();
        userList.addUser(user3);

        User user4 = userBuilder
                .setName("adam")
                .setPassword("abcd1234")
                .setAge(30)
                .build();
        userList.addUser(user4);

        userList.getNext().print();
        userList.getNext().print();
        userList.getNext().print();
        userList.getNext().print();

        userList.sortByBalance();

        bank.addObserver(user2);
        bank.addObserver(user4);
        bank.giveMoney();

        userList.reset();
        userList.getNext().print();
        userList.getNext().print();
        userList.getNext().print();
        userList.getNext().print();
    }
}
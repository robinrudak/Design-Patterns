import java.util.ArrayList;

public class UserList {
    ArrayList<User> userList = new ArrayList<User>();
    private int currentPosition = 0;

    public boolean hasNext() {
        return currentPosition >= 0 && currentPosition < userList.size();
    }

    public User getNext() {
        if (!hasNext()) {
            return null;
        }
        User user = userList.get(currentPosition);
        currentPosition++;
        return user;
    }

    public void reset() {
        currentPosition = 0;
    }

    public void addUser(User user) {
        userList.add(user);
    }


    public void sortByBalance() {
        Sort.insertionSort(this.userList);
    }
}

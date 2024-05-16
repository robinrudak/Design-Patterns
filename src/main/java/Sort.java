import java.util.ArrayList;

public class Sort {
    public static ArrayList<User> insertionSort(ArrayList<User> people) {
        for (int i = 1; i < people.size(); i++) {
            User personToSort = people.get(i);
            int j = i;
            while (j > 0) {
                if (people.get(j - 1).getBalance() > personToSort.getBalance()) {
                    people.set(j, people.get(j - 1));
                    j--;
                } else {
                    break;
                }
            }
            people.set(j, personToSort);
        }

        return people;
    }


}


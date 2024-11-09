import java.util.*;

public class syntax {
            public static void main(String[] args) {
                        ArrayList<String> cars = new ArrayList<String>();

                        // add items
                        cars.add("volvo");
                        cars.add("bmw");
                        cars.add("mercedes");

                        System.out.println(cars);

                        // get items
                        String mycar = cars.get(0);

                        // modify an item
                        cars.set(1, "modifiec car");

                        boolean ispresent = cars.contains("mercedes");

                        // size
                        int size = cars.size();

                        // implement loops
                        for (int i = 0; i < cars.size(); i++) {
                                    System.out.print(cars.get(i) + " ");
                        }

                        // remove element
                        cars.remove(2); // removes element at first index
                        cars.clear(); // clears all elements
            }
}

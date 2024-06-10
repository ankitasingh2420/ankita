// import java.util.ArrayList;

// public class Main {
//     public static void main(String[] args) {
//         // Create a new ArrayList of Strings
//         ArrayList<String> fruits = new ArrayList<>();

//         // Add elements to the ArrayList
//         fruits.add("Apple");
//         fruits.add("Banana");
//         fruits.add("Orange");
//         fruits.remove(2);

//         // Print the ArrayList
//         System.out.println("Fruits: " + fruits);
//     }
// }



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a new ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.remove(2);

        // Build the desired output format
        StringBuilder output = new StringBuilder("Fruits [");
        for (int i = 0; i < fruits.size(); i++) {
            output.append("{").append(fruits.get(i).toLowerCase()).append("}");
            if (i < fruits.size() - 1) {
                output.append(",");
            }
        }
        output.append("]");

        // Print the formatted output
        System.out.println(output);
    }
}

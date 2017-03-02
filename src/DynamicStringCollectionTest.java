public class DynamicStringCollectionTest {
    public static void main(String[] args) {

        System.out.println("\n### ARRAY-TESTS ###");
        DynamicStringArray array = new DynamicStringArray();

        //Append
        array.append("Alice");
        array.append("Bob");
        array.append("Dave");
        printTestA("\nArray: ", array);

        //Insert
        array.insert("Charly", 2);
        printTestA("\nAfter insert: ", array);

        //Get element by index
        System.out.println("\nGet-Test: " + array.get(2));

        //Get length of array
        System.out.println("\nGet-length Test: " + array.getLength());

        //Delete element by index
        array.delete(1);
        printTestA("\nAfter delete: ", array);


        System.out.println("\n### LIST-TESTS ###");

        //List
        DynamicStringList list = new DynamicStringList();

        //Append
        list.append("Alice");
        list.append("Bob");
        list.append("Dave");
        printTestL("\nList: ", list);

        //Insert
        list.insert("Charly", 2);
        printTestL("\nAfter insert: ", list);

        //Get element by index
        System.out.println("\nGet-Test: " + list.get(2));

        //Get length of list
        System.out.println("\nGet-length Test: " + list.getLength());

        //Delete element by index
        list.delete(1);
        printTestL("\nAfter delete: ", list);

    }

    //printTestA("Array: ", array);
    public static void printTestA (String text, DynamicStringArray array) {
        System.out.println(text);
        for (int i = 0; i < array.getLength(); i++) {
            System.out.println(array.get(i));
        }
    }

    //printTestL("List: ", list);
    public static void printTestL (String text, DynamicStringList list) {
        System.out.println(text);
        for (int i = 0; i < list.getLength(); i++) {
            System.out.println(list.get(i));
        }
    }
}

import java.util.*;

public class DataStructuresExample {

    // Example using LinkedList
    public static void linkedListExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        System.out.println("LinkedList:");
        for (String item : linkedList) {
            System.out.println(item);
        }
    }

    // Example using HashMap
    public static void hashMapExample() {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 25);
        hashMap.put("Charlie", 35);

        System.out.println("HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Example using Stack
    public static void stackExample() {
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    // Example using Queue
    public static void queueExample() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");

        System.out.println("Queue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    // Example using Collections class
    public static void collectionsExample() {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        Collections.sort(numbers);

        System.out.println("Sorted List using Collections:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // Example using Map interface (HashMap already demonstrated)
    public static void mapExample() {
        Map<String, String> map = new TreeMap<>();
        map.put("B", "Banana");
        map.put("A", "Apple");
        map.put("C", "Cherry");

        System.out.println("TreeMap (Sorted):");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Example using static variable and method
    public static class StaticExample {
        private static int counter = 0; // Static variable

        public static void incrementCounter() { // Static method
            counter++;
        }

        public static int getCounter() {
            return counter;
        }
    }

    // Example using Vector
    public static void vectorExample() {
        Vector<String> vector = new Vector<>();
        vector.add("One");
        vector.add("Two");
        vector.add("Three");

        System.out.println("Vector:");
        for (String item : vector) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Demonstrate LinkedList
        linkedListExample();

        // Demonstrate HashMap
        hashMapExample();

        // Demonstrate Stack
        stackExample();

        // Demonstrate Queue
        queueExample();

        // Demonstrate Collections
        collectionsExample();

        // Demonstrate Map
        mapExample();

        // Demonstrate Static variable and method
        StaticExample.incrementCounter();
        StaticExample.incrementCounter();
        System.out.println("Static Counter: " + StaticExample.getCounter());

        // Demonstrate Vector
        vectorExample();
    }
}

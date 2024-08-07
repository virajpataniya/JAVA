import java.util.*;

public class CRUDOperationsExample {

    // Example with LinkedList
    public static void linkedListCRUD() {
        LinkedList<String> linkedList = new LinkedList<>();

        // Create
        linkedList.add("Apple");
        linkedList.add("Banana");

        // Read
        System.out.println("LinkedList (Read): " + linkedList);

        // Update
        linkedList.set(1, "Blueberry");

        // Delete
        linkedList.remove("Apple");

        System.out.println("LinkedList (After Update & Delete): " + linkedList);
    }

    // Example with HashMap
    public static void hashMapCRUD() {
        Map<String, Integer> hashMap = new HashMap<>();

        // Create
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 25);

        // Read
        System.out.println("HashMap (Read): " + hashMap);

        // Update
        hashMap.put("Alice", 31); // Update value for Alice

        // Delete
        hashMap.remove("Bob");

        System.out.println("HashMap (After Update & Delete): " + hashMap);
    }

    // Example with Stack
    public static void stackCRUD() {
        Stack<String> stack = new Stack<>();

        // Create
        stack.push("First");
        stack.push("Second");

        // Read
        System.out.println("Stack (Peek): " + stack.peek());

        // Update (Stack does not have a direct update method, so we simulate it)
        stack.set(1, "UpdatedSecond");

        // Delete
        stack.pop();

        System.out.println("Stack (After Update & Delete): " + stack);
    }

    // Example with Queue
    public static void queueCRUD() {
        Queue<String> queue = new LinkedList<>();

        // Create
        queue.offer("One");
        queue.offer("Two");

        // Read
        System.out.println("Queue (Peek): " + queue.peek());

        // Update (Queue does not have a direct update method, so we simulate it)
        LinkedList<String> tempList = new LinkedList<>(queue);
        tempList.set(1, "UpdatedTwo");
        queue = new LinkedList<>(tempList);

        // Delete
        queue.poll();

        System.out.println("Queue (After Update & Delete): " + queue);
    }

    // Example with Collections (for List operations)
    public static void collectionsCRUD() {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 1));

        // Create
        list.add(4);

        // Read
        System.out.println("Collections List (Read): " + list);

        // Update
        list.set(2, 7);

        // Delete
        list.remove(Integer.valueOf(1));

        System.out.println("Collections List (After Update & Delete): " + list);
    }

    // Example with Map (TreeMap as an example of a sorted Map)
    public static void mapCRUD() {
        Map<String, String> map = new TreeMap<>();

        // Create
        map.put("B", "Banana");
        map.put("A", "Apple");

        // Read
        System.out.println("TreeMap (Read): " + map);

        // Update
        map.put("A", "Apricot"); // Update value for Apple

        // Delete
        map.remove("B");

        System.out.println("TreeMap (After Update & Delete): " + map);
    }

    // Example with static variable and method
    public static class StaticExample {
        private static int counter = 0; // Static variable

        public static void incrementCounter() { // Static method
            counter++;
        }

        public static int getCounter() {
            return counter;
        }
    }

    // Example with Vector
    public static void vectorCRUD() {
        Vector<String> vector = new Vector<>();

        // Create
        vector.add("One");
        vector.add("Two");

        // Read
        System.out.println("Vector (Read): " + vector);

        // Update
        vector.set(1, "UpdatedTwo");

        // Delete
        vector.remove("One");

        System.out.println("Vector (After Update & Delete): " + vector);
    }

    public static void main(String[] args) {
        // LinkedList CRUD operations
        linkedListCRUD();

        // HashMap CRUD operations
        hashMapCRUD();

        // Stack CRUD operations
        stackCRUD();

        // Queue CRUD operations
        queueCRUD();

        // Collections CRUD operations
        collectionsCRUD();

        // Map CRUD operations
        mapCRUD();

        // Static variable and method operations
        StaticExample.incrementCounter();
        StaticExample.incrementCounter();
        System.out.println("Static Counter: " + StaticExample.getCounter());

        // Vector CRUD operations
        vectorCRUD();
    }
}

//Theory

/*
 * 
 * . Array
Description:

A fixed-size collection of elements of the same type.
Index-based access to elements.
Important Methods:

length: Gets the size of the array.
Usage:

Useful when you know the size of the collection in advance.
Fast access and iteration.
Example:

java
Copy code
int[] array = new int[5];
array[0] = 10;
2. ArrayList
Description:

A resizable array implementation of the List interface.
Important Methods:

add(E e): Adds an element.
get(int index): Retrieves an element.
set(int index, E element): Replaces an element.
remove(int index): Removes an element by index.
size(): Returns the number of elements.
clear(): Removes all elements.
Usage:

Dynamic size, easy to use for lists that may change in size.
Provides fast random access.
Example:

java
Copy code
ArrayList<String> list = new ArrayList<>();
list.add("A");
list.add("B");
3. LinkedList
Description:

A doubly linked list implementation of the List and Deque interfaces.
Important Methods:

add(E e): Adds an element.
get(int index): Retrieves an element.
set(int index, E element): Replaces an element.
remove(int index): Removes an element by index.
addFirst(E e): Adds an element at the beginning.
addLast(E e): Adds an element at the end.
poll(): Retrieves and removes the head of the list.
Usage:

Good for frequently adding or removing elements.
Less efficient for random access compared to ArrayList.
Example:

java
Copy code
LinkedList<String> list = new LinkedList<>();
list.add("A");
list.addFirst("B");
4. HashMap
Description:

A hash table based implementation of the Map interface.
Important Methods:

put(K key, V value): Adds a key-value pair.
get(Object key): Retrieves the value for a key.
remove(Object key): Removes the key-value pair.
containsKey(Object key): Checks if the map contains a key.
keySet(): Returns a set of keys.
values(): Returns a collection of values.
Usage:

Fast lookups and updates for key-value pairs.
Does not maintain order.
Example:

java
Copy code
HashMap<String, Integer> map = new HashMap<>();
map.put("A", 1);
map.put("B", 2);
5. TreeMap
Description:

A Red-Black tree-based implementation of the Map interface that maintains keys in sorted order.
Important Methods:

put(K key, V value): Adds a key-value pair.
get(Object key): Retrieves the value for a key.
remove(Object key): Removes the key-value pair.
firstKey(): Retrieves the first key.
lastKey(): Retrieves the last key.
Usage:

Provides a sorted view of keys.
Slower than HashMap for lookups due to tree structure.
Example:

java
Copy code
TreeMap<String, Integer> map = new TreeMap<>();
map.put("A", 1);
map.put("B", 2);
6. HashSet
Description:

A hash table-based implementation of the Set interface, does not allow duplicate elements.
Important Methods:

add(E e): Adds an element.
remove(Object o): Removes an element.
contains(Object o): Checks if the set contains an element.
size(): Returns the number of elements.
clear(): Removes all elements.
Usage:

Fast operations for checking existence, adding, and removing elements.
Does not maintain any order.
Example:

java
Copy code
HashSet<String> set = new HashSet<>();
set.add("A");
set.add("B");
7. LinkedHashSet
Description:

A hash table and linked list implementation of the Set interface that maintains insertion order.
Important Methods:

add(E e): Adds an element.
remove(Object o): Removes an element.
contains(Object o): Checks if the set contains an element.
size(): Returns the number of elements.
clear(): Removes all elements.
Usage:

Maintains the order of elements as they were inserted.
Example:

java
Copy code
LinkedHashSet<String> set = new LinkedHashSet<>();
set.add("A");
set.add("B");
8. Vector
Description:

A synchronized dynamic array implementation of the List interface.
Important Methods:

add(E e): Adds an element.
get(int index): Retrieves an element.
set(int index, E element): Replaces an element.
remove(int index): Removes an element by index.
size(): Returns the number of elements.
Usage:

Provides thread-safe operations.
Slower than ArrayList due to synchronization.
Example:

java
Copy code
Vector<String> vector = new Vector<>();
vector.add("A");
vector.add("B");
9. Stack
Description:

A last-in, first-out (LIFO) stack implementation of the Deque interface.
Important Methods:

push(E e): Pushes an element onto the stack.
pop(): Removes and returns the top element.
peek(): Retrieves the top element without removing it.
isEmpty(): Checks if the stack is empty.
Usage:

Useful for problems involving recursive operations, backtracking, etc.
Example:

java
Copy code
Stack<String> stack = new Stack<>();
stack.push("A");
stack.push("B");
stack.pop(); // Returns "B"
10. PriorityQueue
Description:

A priority queue implementation of the Queue interface that orders elements based on their natural ordering or a provided comparator.
Important Methods:

offer(E e): Adds an element.
poll(): Retrieves and removes the highest-priority element.
peek(): Retrieves the highest-priority element without removing it.
size(): Returns the number of elements.
Usage:

Useful for scenarios requiring priority-based processing.
Example:

java
Copy code
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(5);
pq.offer(3);
pq.poll(); // Returns 3
11. Deque (ArrayDeque)
Description:

A resizable array implementation of the Deque interface that supports both stack and queue operations.
Important Methods:

addFirst(E e): Adds an element at the front.
addLast(E e): Adds an element at the end.
removeFirst(): Removes and returns the first element.
removeLast(): Removes and returns the last element.
peekFirst(): Retrieves the first element without removing it.
peekLast(): Retrieves the last element without removing it.
Usage:

Efficient implementation for double-ended queues.
Example:

java
Copy code
Deque<String> deque = new ArrayDeque<>();
deque.addFirst("A");
deque.addLast("B");
deque.removeFirst(); // Returns "A"
12. Collections
Description:

A utility class providing static methods for operating on or returning collections.
Important Methods:

sort(List<T> list): Sorts a list.
shuffle(List<?> list): Randomly shuffles a list.
reverse(List<?> list): Reverses the order of a list.
max(Collection<? extends T> coll): Returns the maximum element.
min(Collection<? extends T> coll): Returns the minimum element.
Usage:

Provides utility methods to manipulate and work with collections.
Example:

java
Copy code
List<Integer> list = Arrays.asList(5, 3, 8, 1);
Collections.sort(list); // Sorts the list
Summary
Array: Fixed-size collection.
ArrayList: Resizable array, fast access.
LinkedList: Doubly linked list, efficient for insertions and deletions.
HashMap: Key-value pairs with fast access, no order.
TreeMap: Sorted key-value pairs.
HashSet: Unordered set, no duplicates.
LinkedHashSet: Ordered set, maintains insertion order.
Vector: Synchronized dynamic array.
Stack: LIFO structure.
PriorityQueue: Elements ordered by priority.
Deque (ArrayDeque): Double-ended queue.
Collections: Utility methods for manipulating collections.

 * 
 */
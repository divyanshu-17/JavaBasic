package in;

public class CollectionInfo {
    public static void main(String[] args) {
        System.out.println(
                "That's actually the whole point of Collections over arrays — they resize automatically behind " +
                "the scenes as you add more elements.");
    }
//    **Yes** — all Collections in Java are mutable in size by default. You can add and remove elements freely:
//
//            ```java
//    List<Integer> list = new ArrayList<>();
//list.add(1);    // ✅
//list.add(2);    // ✅
//list.remove(0); // ✅
//```
//
//        ---
//
//        ## But there are exceptions:
//
//            **Fixed size — `Arrays.asList()`:**
//            ```java
//    List<Integer> list = Arrays.asList(1, 2, 3);
//list.add(4);    // ❌ UnsupportedOperationException
//list.set(0, 9); // ✅ can change values but not size
//```
//
//        **Completely immutable — `List.of()`:**
//            ```java
//    List<Integer> list = List.of(1, 2, 3);
//list.add(4);    // ❌ UnsupportedOperationException
//list.set(0, 9); // ❌ UnsupportedOperationException
//```
//
//        ---
//
//        ## Quick comparison:
//
//            | | Size changeable? | Values changeable? |
//            |---|---|---|
//            | `ArrayList` | ✅ | ✅ |
//            | `Arrays.asList()` | ❌ | ✅ |
//            | `List.of()` | ❌ | ❌ |
//
//            ---
//
//    So by default yes — but Java gives you ways to **lock** the size or make it fully immutable when needed.
    //Yes all of them are mutable in size by default:
    //java// Queue
    //Queue<Integer> queue = new LinkedList<>();
    //queue.add(1);
    //queue.add(2);  // ✅ grows freely
    //
    //Set
    //Set<String> set = new HashSet<>();
    //set.add("Dibu");
    //set.add("John"); // ✅ grows freely
    //
    // Map
    //Map<String, Integer> map = new HashMap<>();
    //map.put("Dibu", 22);
    //map.put("John", 25); // ✅ grows freely
    //
    //Unlike arrays which are fixed size forever:
    //javaint[] arr = new int[5]; // ❌ stuck at 5, can never grow
    //That's actually the whole point of Collections over arrays — they resize automatically behind the scenes as you add more elements.
    //
    //Same immutable rules apply to all of them too:
    //javaSet<String> set = Set.of("Dibu", "John");
    //set.add("Bob"); // ❌ UnsupportedOperationException
    //
    //Map<String, Integer> map = Map.of("Dibu", 22);
    //map.put("John", 25); // ❌ UnsupportedOperationException
    //So by default mutable — but you can lock them with Set.of(), Map.of() etc just like List.of().
}

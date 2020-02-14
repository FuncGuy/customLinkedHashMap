public class BasicHashMapTest {
    public static void main(String[] args) {
        BasicHashMap<Integer, Integer> map = new BasicHashMap();
        map.put(1, 1);
        System.out.println(map.get(1).value);
        map.put(1, 2);
        System.out.println(map.get(1).value);
        map.put(15, 14);
        System.out.println(map.toString());
    }
}

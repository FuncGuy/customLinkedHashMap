public class BasicHashMapTest {
    public static void main(String[] args) {
        BasicHashMap<Integer, Integer> map = new BasicHashMap();
        map.put(1, 1);
        System.out.println(map.get(1));
        map.put(1, 2);
        System.out.println(map.get(1));
        map.put(15, 14);
        System.out.println(map.get(15));
        map.put(16,12);
        System.out.println(map.get(16));
        System.out.println(map);
    }
}

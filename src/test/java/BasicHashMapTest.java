import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BasicHashMapTest {

    @Test
    public void testShouldInsertKeyValueInHashMap(){

        BasicHashMap<String, String> map = new BasicHashMap();

        map.put("Salvatore", "Redis");
        map.put("Salvatore", "Salvatore");
        map.put("Tirumalesh","Salvatore");
        map.put("Tirumalesh","Salvatore");
        map.put("Tirumaleshh","Salvatore");

        System.out.println(map);

        assertThat(map.size(), is(3));
    }

    @Test
    public void testShouldInsertKeyValueInHashMapf(){

        BasicHashMap<Integer, Integer> map = new BasicHashMap();


        map.put(1,2);
        map.put(2,3);
        map.put(3,2);
        map.put(4,2);
        map.put(5,2);
        map.put(6,2);
        map.put(7,2);
        map.put(8,2);
        map.put(9,2);
        map.put(10,2);
        map.put(11,2);
        map.put(12,2);
        map.put(13,2);
        map.put(14,2);
        System.out.println(map);

        //assertThat(map.size(), is(2));
    }

}

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

        assertThat(map.size(), is(3));
    }

}

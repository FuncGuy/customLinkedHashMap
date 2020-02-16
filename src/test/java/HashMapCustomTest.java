import org.junit.Test;

import java.util.HashMap;


public class HashMapCustomTest {

    @Test
    public void testMapShouldAcceptKeyAndValuePairs(){
        HashMapCustom<String, String> map = new HashMapCustom<>();
        map.put("Tirumalesh", "Salvatore");
        map.put("Redis", "No-sql");
        map.put("Redis","key-value");
        for(int i = 0; i< 500000;i++)
            map.put(i+"",i+"b");
        map.display();

    }

    @Test
    public void testMapShouldAcceptKeyAndValuePairss(){
        HashMap<String, String> map = new HashMap<>();
        map.put("Tirumalesh", "Salvatore");
        map.put("Redis", "No-sql");
        map.put("Redis","key-value");
        for(int i = 0; i< 500000;i++)
            map.put(i+"",i+"b");
        System.out.println(map);

    }


}
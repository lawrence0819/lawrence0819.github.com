import java.util.HashMap;
import java.util.Map;

public class Cache {

    private static final Map<String, Object> container = new HashMap<String, Object>();

    private Cache() {}

    public static Object get(String key) {
        return container.get(key);
    }

    public static void put(String key, Object value) {
        container.put(key, value);
    }

}

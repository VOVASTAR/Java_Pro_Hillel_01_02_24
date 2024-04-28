package homework.hw12.task1To5;

import java.util.HashMap;
import java.util.Map;

public class CacheControlDirectiveRequest {

    private String cacheDirectiveName;
    private Integer value;

    private Map<String, Integer> headers = new HashMap<>() {{
        put("max-age", null);
        put("max-stale", null);
        put("min-fresh", null);
        put("no-cache", null);
        put("no-store", null);
        put("no-transform", null);
        put("only-if-cached", null);
    }};

    public Map<String, Integer> getHeaders() {
        return headers;
    }
}

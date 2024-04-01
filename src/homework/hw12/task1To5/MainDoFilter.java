package homework.hw12.task1To5;

import homework.hw12.task1To5.filters.FilterCacheControlValid;
import homework.hw12.task1To5.filters.FilterContainsStringInUri;
import homework.hw12.task1To5.filters.FilterPayloadJSON;
import homework.hw12.task1To5.filters.FilterRegexInUri;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class MainDoFilter {
    public static void main(String[] args) throws URISyntaxException {
        String payload = "{\"key\": \"value\"}";
        List<String> headers = new ArrayList<>() {
            {
                add("no-cache");
                add("max-age=3600");
                add("max-stale=600");
            }
        };
        Request request = new Request(new URI("https://www.baeldung.com/"), headers, payload);

        ChainOfFilters chainOfFilters = new ChainOfFilters(
                new FilterRegexInUri(),
                new FilterContainsStringInUri("baeldung"),
                new FilterCacheControlValid(headers),
                new FilterPayloadJSON(payload));
        chainOfFilters.doFilter(request);

    }
}

package homework.hw12;

import java.net.URI;
import java.net.URISyntaxException;

public class MainDoFilter {
    public static void main(String[] args) throws URISyntaxException {
        String payload = "{\"key\": \"value\"";
        Request request = new Request(new URI("https://www.baeldung.com/"), null, payload);

        ChainOfFilters chainOfFilters = new ChainOfFilters(
                new FilterRegexInUri(),
                new FilterContainsStringInUri("baeldung"),
                new FilterPayloadJSON(payload));
        chainOfFilters.doFilter(request);
//        System.out.println(chainOfFilters.isContainsStringInUri("baeldung"));

    }
}

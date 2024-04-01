package homework.hw12.task1To5;

import java.net.URI;
import java.util.List;

public class Request {
    private URI address;
    private List<String> headers;
    private String payload;

    public Request(URI address, List<String> headers, String payload) {
        this.address = address;
        this.headers = headers;
        this.payload = payload;
    }

    public URI getAddress() {
        return address;
    }

    public List<String> getHeaders() {
        return headers;
    }

    public String getPayload() {
        return payload;
    }
}

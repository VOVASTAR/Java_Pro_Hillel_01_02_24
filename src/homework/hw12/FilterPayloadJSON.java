package homework.hw12;

import org.json.JSONException;
import org.json.JSONObject;

public class FilterPayloadJSON implements Filter {

    private String payload;


    public FilterPayloadJSON(String payload) {
        this.payload = payload;
    }

    @Override
    public void doFilter(Request request, ChainOfFilters chainOfFilters) {
        boolean status;
        try {
            if (payload == null || payload.isEmpty()) {
                status = false;
                System.out.println("try false");
                return;
            }
            JSONObject f = new JSONObject(payload);
            status = true;
            System.out.println("try true");
        } catch (JSONException ex) {
            System.out.println("try ex");
            status = false;
            System.out.println(ex.getMessage());
        }
    }

}

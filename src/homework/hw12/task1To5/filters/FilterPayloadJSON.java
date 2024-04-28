package homework.hw12.task1To5.filters;

import homework.hw12.task1To5.ChainOfFilters;
import homework.hw12.task1To5.Filter;
import homework.hw12.task1To5.Request;
import org.json.JSONException;
import org.json.JSONObject;

public class FilterPayloadJSON implements Filter {

    private String payload;

    public FilterPayloadJSON(String payload) {
        this.payload = payload;
    }

    @Override
    public void doFilter(Request request, ChainOfFilters chainOfFilters) {
        try {
            if (payload == null || payload.isEmpty()) {
                System.out.println("400 Bad Request: " + this.getClass().getSimpleName());
                chainOfFilters.setValidFilterStatus(false);
                return;
            }
            JSONObject jsonValidation = new JSONObject(payload);
        } catch (JSONException e) {
            System.out.println("400 Bad Request: " + this.getClass().getSimpleName());
            chainOfFilters.setValidFilterStatus(false);
        }
    }
}

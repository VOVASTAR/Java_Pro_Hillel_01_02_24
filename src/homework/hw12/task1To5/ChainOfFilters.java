package homework.hw12.task1To5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ChainOfFilters {

    private List<Filter> filters = new LinkedList<>();

    private boolean isValidFilterStatus = true;

    public ChainOfFilters(Filter... filters) {
        this.filters.addAll(Arrays.asList(filters));
    }

    public void doFilter(Request request) {
        for (Filter filter : filters) {
            filter.doFilter(request, this);
        }
        if (isValidFilterStatus) {
            System.out.println("200 OK");
        }
    }

    public boolean getValidFilterStatus() {
        return isValidFilterStatus;
    }

    public void setValidFilterStatus(boolean status) {
        this.isValidFilterStatus = status;
    }
}

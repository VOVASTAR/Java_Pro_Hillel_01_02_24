package homework.hw12.task1To5.filters;

import homework.hw12.task1To5.ChainOfFilters;
import homework.hw12.task1To5.Filter;
import homework.hw12.task1To5.Request;

import java.util.function.Predicate;

public class FilterContainsStringInUri implements Filter {

    private String string;

    public FilterContainsStringInUri(String partString) {
        this.string = partString;
    }

    @Override
    public void doFilter(Request request, ChainOfFilters chainOfFilters) {
        Predicate<String> predicate = str -> request.getAddress().toString().contains(str);
        if (!predicate.test(string)) {
            System.out.println("400 Bad Request: " + this.getClass().getSimpleName());
            chainOfFilters.setValidFilterStatus(false);
        }
    }
}

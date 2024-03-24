package homework.hw12;

import java.util.function.Predicate;

public class FilterContainsStringInUri implements Filter {

    private String string;

    public FilterContainsStringInUri(String partString) {
        this.string = partString;
    }

    @Override
    public void doFilter(Request request, ChainOfFilters chainOfFilters) {

//        https://www.baeldung.com/
        Predicate<String> predicate = str -> request.getAddress().toString().contains(str);
        System.out.println(predicate.test(string));
//        return predicate.test(str);
    }
}

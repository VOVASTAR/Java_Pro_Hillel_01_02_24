package homework.hw12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterRegexInUri implements Filter {

    private String regex;

    Pattern pattern = Pattern.compile("[a-z:.\\/]+");


//    public FilterRegexInUri(String regex) {
//        this.regex = regex;
//    }

    //    Filter filter = (request, chainOfFilters) -> request.getAddress().toString().contains(str).
    @Override
    public void doFilter(Request request, ChainOfFilters chainOfFilters) {
//        System.out.println("Hello");
//        Pattern.matches()
        Matcher matcher = pattern.matcher(request.getAddress().toString());
        System.out.println(matcher.matches());
//        https://www.baeldung.com/

    }


}

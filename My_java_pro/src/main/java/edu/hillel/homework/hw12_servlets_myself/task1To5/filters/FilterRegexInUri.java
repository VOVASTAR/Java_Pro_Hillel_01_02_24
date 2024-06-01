package edu.hillel.homework.hw12_servlets_myself.task1To5.filters;

import edu.hillel.homework.hw12_servlets_myself.task1To5.ChainOfFilters;
import edu.hillel.homework.hw12_servlets_myself.task1To5.Filter;
import edu.hillel.homework.hw12_servlets_myself.task1To5.Request;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterRegexInUri implements Filter {

    Pattern pattern = Pattern.compile("[a-z:./]+");

    @Override
    public void doFilter(Request request, ChainOfFilters chainOfFilters) {
        Matcher matcher = pattern.matcher(request.getAddress().toString());
        if (!matcher.matches()) {
            System.out.println("400 Bad Request: " + this.getClass().getSimpleName());
            chainOfFilters.setValidFilterStatus(false);
        }
    }
}

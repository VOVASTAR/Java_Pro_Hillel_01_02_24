package edu.hillel.homework.hw12_servlets_myself.task1To5.filters;

import edu.hillel.homework.hw12_servlets_myself.task1To5.CacheControlDirectiveRequest;
import edu.hillel.homework.hw12_servlets_myself.task1To5.ChainOfFilters;
import edu.hillel.homework.hw12_servlets_myself.task1To5.Filter;
import edu.hillel.homework.hw12_servlets_myself.task1To5.Request;

import java.util.List;
import java.util.Map;

public class FilterCacheControlValid implements Filter {

    private List<String> cacheControl;

    public FilterCacheControlValid(List<String> cacheControl) {
        this.cacheControl = cacheControl;
    }

    @Override
    public void doFilter(Request request, ChainOfFilters chainOfFilters) {

        CacheControlDirectiveRequest CacheControlDirectiveRequest = new CacheControlDirectiveRequest();
        Map<String, Integer> headers = CacheControlDirectiveRequest.getHeaders();

        for (String string : cacheControl) {
            String[] headerPart = string.split("=");
            boolean containsKey = headers.containsKey(headerPart[0].toLowerCase());
            if (!containsKey) {
                System.out.println("400 Bad Request: " + this.getClass().getSimpleName());
                chainOfFilters.setValidFilterStatus(false);
            }
            if (headerPart.length == 2) {
                try {
                    headers.put(headerPart[0], Integer.parseInt(headerPart[1]));
                } catch (NumberFormatException e) {
                    System.out.println("400 Bad Request: " + this.getClass().getSimpleName());
                    chainOfFilters.setValidFilterStatus(false);
                }
            }
        }
    }
}

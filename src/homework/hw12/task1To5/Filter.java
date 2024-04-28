package homework.hw12.task1To5;

@FunctionalInterface
public interface Filter {

    void doFilter(Request request, ChainOfFilters chainOfFilters);

}

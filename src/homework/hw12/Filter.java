package homework.hw12;

@FunctionalInterface
public interface Filter {

    void doFilter(Request request, ChainOfFilters chainOfFilters);
}

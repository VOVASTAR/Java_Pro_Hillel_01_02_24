package edu.hillel.homework.hw12_servlets_myself.task1To5;

@FunctionalInterface
public interface Filter {

    void doFilter(Request request, ChainOfFilters chainOfFilters);

}

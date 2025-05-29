package Sorter_StrategyPattern;

public class DescendingSort implements SortAlgorithm {
    @Override
    public boolean compare(int a, int b) {
        return a > b;
    }
}

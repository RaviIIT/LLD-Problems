package Sorter_StrategyPattern;

public class AscendingSort implements SortAlgorithm {
    @Override
    public boolean compare(int a, int b) {
        return a < b;
    }
}
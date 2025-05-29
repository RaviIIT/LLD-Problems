package Sorter_StrategyPattern;

public class AlgorithmFactory {
    public static SortAlgorithm getSortAlgorithm(AlgorithmType algorithmType){
        switch(algorithmType){
            case ASCENDING:
                return new AscendingSort();
            case DESCENDING:
                return new DescendingSort();
        }
        return new CustomSort();
    }
}

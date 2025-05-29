// Strategy Pattern
// Identifier -> When different algorithms are used a/q different situations.
// Ex - Sorting algorithm, Filtering logic for Shopping portal, Nearest parking spot finder, etc.
// In the subjectClass (here Sorter), make an algorithmInterface variable and take it using constructor.
// Implement the algorithms in child classes of algorithmInterface.
// When someone call Sorter, he will need to pass the algorithmType. Can take this as ENUM and use Factory pattern to set the algorithm from ENUM.


package Sorter_StrategyPattern;

import java.util.List;

public class Sorter {
    List<Integer> list;
    SortAlgorithm sortAlgorithm;
    AlgorithmType algorithmType;

    Sorter(List<Integer> list, AlgorithmType algorithmType){
        this.list = list;   
        this.sortAlgorithm = AlgorithmFactory.getSortAlgorithm(algorithmType);
    }
    List<Integer> sort(){
        int n = list.size();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                // main algorithm is here for sorting
                // abstracted out to SortAlgorithm interface
                // so that we can change the sorting algorithm without changing the Sorter class
                // we can use different sorting algorithms by setting the sortAlgorithm variable to different SortAlgorithm implementations
                // this is the strategy pattern
                if( sortAlgorithm.compare(list.get(i), list.get(j))) {
                    swap(list, i, j);
                }

            }
        }
        return list;
    }
    void setSortStrategy(SortAlgorithm sortAlgorithm){
        this.sortAlgorithm = sortAlgorithm;
    }
}

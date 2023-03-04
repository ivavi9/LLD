package strategy;

import java.util.List;

public class RainTrapProblem {

    private List<Integer> sizeBuilding;
    private String timeComplexity;
    private String spaceComplexity;

    public RainTrapProblem(List<Integer> sizeBuilding, String timeComplexity, String spaceComplexity){
        this.sizeBuilding = sizeBuilding;
        this.timeComplexity = timeComplexity;
        this.spaceComplexity = spaceComplexity;
    }

    public int solve(){
        RainTrapAlgo rainTrapAlgo = FactoryRainTrapAlgo.getAlgorithm(timeComplexity,spaceComplexity);
        return rainTrapAlgo.computeResult(timeComplexity,spaceComplexity);
    }

}

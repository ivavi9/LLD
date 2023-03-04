package strategy;

public class FactoryRainTrapAlgo {

    private static RainTrapAlgo fast = new SolveRainTrapFast();
    private static RainTrapAlgo faster = new SolveRainTrapFaster();
    private static RainTrapAlgo fastest = new SolveRainTrapFastest();

    public static RainTrapAlgo getAlgorithm(String timeComplexity, String spaceComplexity){
        if(timeComplexity.equals("N2")){
            return fast;
        } else if (spaceComplexity.equals("N")) {
            return faster;

        }else{
            return fastest;
        }
    }


}

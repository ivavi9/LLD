package strategy;

import java.util.List;

public class Client
{
    public static void main(String[] args) {
        RainTrapProblem rainTrapProblem = new RainTrapProblem(List.of(new Integer[]{1, 3, 4, 5}),"N","1");
        System.out.println(rainTrapProblem.solve());
    }
}

package rx.loadbalancer.loadbalancer;

import java.util.Arrays;
import java.util.Random;

/**
 * Select the next element using a random number.  
 * 
 * The weights are sorted such as that each cell in the array represents the
 * sum of the previous weight plus it's weight.
 * 
 * Worst case runtime complexity is O(log N)
 * 
 * @author elandau
 *
 */
public class RandomWeightSelector implements WeightSelector {

    private Random random = new Random();
    
    @Override
    public Integer call(Integer[] weights, Integer count) {
        return Arrays.binarySearch(weights, random.nextInt(count));
    }
}

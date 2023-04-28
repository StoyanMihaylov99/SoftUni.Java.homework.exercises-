package randomArrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayList<T> extends ArrayList<T> {

    private final Random random;



    public RandomArrayList(){
        super();
        this.random = new Random();
    }

    public T getRandomElement() {
        int index = random.nextInt(super.size());
        T result = super.get(index);

        return result;
    }


}

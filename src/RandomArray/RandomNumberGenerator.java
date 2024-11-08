package RandomArray;

public class RandomNumberGenerator {

    public int random(int rangeMin, int rangeMax) {
        // include first or last number
        if (rangeMin != rangeMax) {
            int range = rangeMax - rangeMin + 1;
            int random = (int) (Math.random() * range) + rangeMin;
            return random;
        }else System.out.println("wrong=-1"); return -1;
    }
}

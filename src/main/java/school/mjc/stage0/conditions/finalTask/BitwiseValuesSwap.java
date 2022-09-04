package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first ^= second;
        second ^= second;
        first ^= second;
    }
}

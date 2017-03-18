package ru.matlcev.sortingtask;

public class PairMinMax implements Comparable<PairMinMax> {

    private int maximumValue;
    private int minimumValue;
    private int delta;

    PairMinMax(int minimumValue, int maximumValue) {

        this.minimumValue = minimumValue;
        this.maximumValue = maximumValue;
        delta = maximumValue - minimumValue;
    }

    public int getMaximumValue() {
        return maximumValue;
    }

    public int getMinimumValue() {
        return minimumValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        PairMinMax that = (PairMinMax) obj;

        if (maximumValue != that.maximumValue) return false;
        return minimumValue == that.minimumValue;
    }

    public boolean equals(int minimumValue, int maximumValue) {

        return this.maximumValue == maximumValue && this.minimumValue == minimumValue;
    }

    @Override
    public int hashCode() {
        int result = maximumValue;
        result = 31 * result + minimumValue;
        return result;
    }

    @Override
    public String toString() {

        return "Min: " + minimumValue + " Max: " + maximumValue + " Delta: " + delta;
    }

    public int compareTo(PairMinMax obj) {

        if(this.delta > obj.delta) return 1;
        if(this.delta < obj.delta) return -1;
        return 0;
    }
}

package main;

public class Pair implements Comparable<Pair> {
    Integer distance;
    Integer index;
    public Pair(int distance, int vertex)
    {
        this.distance = distance;
        this.index = vertex;

    }

    @Override
    public int compareTo(Pair o) {
        return this.distance.compareTo(o.distance);
    }
}

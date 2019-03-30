public class Counter {


    private int count;

    public Counter(int initial){
        this.count = initial;
    }
    public int inc(int step){
        count = count + step;
        return count;
    }

    public int getCount() {
        return count;
    }
}

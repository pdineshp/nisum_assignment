package mypkg10;

public class Interval {


    int begin, end;

    Interval(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public String toString() {
        return "{" + begin + "," + end + "}";
    }

}

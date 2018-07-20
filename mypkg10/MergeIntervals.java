package mypkg10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MergeIntervals {
	

    // Function to merge overlapping intervals
    public static void mergeIntervals(List<Interval> intervals)
    {
        // sort the intervals in increasing order of their starting time
        Collections.sort(intervals, (a, b) -> a.begin - b.begin);

        // create an empty stack
        Stack<Interval> stack = new Stack();

        // do for each interval
        for (Interval curr: intervals)
        {
            // if stack is empty or top interval in stack do not overlap
            // with current interval, push it to the stack
            if (stack.empty() || curr.begin > stack.peek().end) {
                stack.push(curr);
            }

            // if top interval of stack overlap with current interval,
            // merge two intervals by updating ending of top interval
            // to ending of current interval
            if (stack.peek().end < curr.end) {
                stack.peek().end = curr.end;
            }
        }

        // print all non-overlapping intervals
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args)
    {
        List<Interval> intervals = Arrays.asList(new Interval(94133,94133), new Interval(94200,94299),
                                        new Interval(94226,94399));

        mergeIntervals(intervals);
    }


}

/**

Input: schedule = [[[1,2],[5,6]],[[1,3]],[[4,10]]]
Output: [[3,4]]
Explanation:
There are a total of three employees, and all common
free time intervals would be [-inf, 1], [3, 4], [10, inf].
We discard any intervals that contain inf as they aren't finite.

 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<Interval> res = new ArrayList<>();
        List<Interval> intervals = new ArrayList<>();
        // Flattening the schedule
        for (List<Interval> employee : schedule)
            for (Interval interval : employee)
                intervals.add(interval);
        // Sorting by start of each Interval
        Collections.sort(intervals, (a, b) -> a.start - b.start);
        int end = intervals.get(0).end;
        // Checking for free time between intervals
        for (Interval interval : intervals) {
            if (interval.start > end)
                res.add(new Interval(end, interval.start));
            end = Math.max(end, interval.end);
        }
        return res;
    }
}
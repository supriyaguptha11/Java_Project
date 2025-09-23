package basics;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public static long findMinimumDays(List<Integer> pages, int k, int p) {
        long low = 1, high = (long) 1e14;
        long answer = high;

        while (low <= high) {
            long mid = (low + high) / 2;
            if (isPossible(pages, k, p, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    private static boolean isPossible(List<Integer> pages, int k, int p, long days) {
        int n = pages.size();
        long[] work = new long[n + 1]; // difference array
        long total = 0;

        for (int i = 0; i < n; i++) {
            total += work[i]; // apply pending work
            long remaining = pages.get(i) - total;

            if (remaining > 0) {
                long requiredDays = (remaining + p - 1) / p;
                if (requiredDays > days) return false;

                total += requiredDays * p;
                if (i + k <= n) {
                    work[i + k] -= requiredDays * p;
                }
                days -= requiredDays;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        List<Integer> pages = new ArrayList<>();
        pages.add(5);
        pages.add(1);
        pages.add(2);
        System.out.println(findMinimumDays(pages, 3, 3));

    }
}
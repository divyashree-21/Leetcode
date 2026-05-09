import java.util.*;

class MedianFinder {

    ArrayList<Integer> list;

    public MedianFinder() {

        list = new ArrayList<>();
    }

    public void addNum(int num) {

        int i = 0;

        while (i < list.size() && list.get(i) < num) {
            i++;
        }

        list.add(i, num);
    }

    public double findMedian() {

        int n = list.size();

        if (n % 2 == 1) {

            return list.get(n / 2);

        } else {

            return (list.get(n / 2) + list.get((n / 2) - 1)) / 2.0;
        }
    }
}
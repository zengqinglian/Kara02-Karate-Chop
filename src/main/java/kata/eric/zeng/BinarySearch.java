package kata.eric.zeng;

public class BinarySearch<T extends Comparable<T>> {
    public int chopRecursion(T[] sortedNums, T target) {
        int length = sortedNums.length;
        if (length == 0) {
            return -1;
        }
        return recursionChop(sortedNums, 0, length - 1, target);
    }

    private int recursionChop(T[] sortedNums, int startIndex, int endIndex, T target) {
        int length = endIndex - startIndex + 1;
        if (length == 1) {
            if (sortedNums[endIndex] == target) {
                return endIndex;
            } else {
                return -1;
            }
        }
        if (length == 2) {
            if (sortedNums[endIndex] != target && sortedNums[startIndex] != target) {
                return -1;
            } else if (sortedNums[endIndex] == target) {
                return endIndex;
            } else {
                return startIndex;
            }
        }

        int mid = startIndex + length / 2;

        if (sortedNums[mid].compareTo(target) == 0) {
            return mid;
        } else if (sortedNums[mid].compareTo(target) > 0) {
            return recursionChop(sortedNums, startIndex, mid - 1, target);
        } else {
            return recursionChop(sortedNums, mid + 1, endIndex, target);
        }
    }
}

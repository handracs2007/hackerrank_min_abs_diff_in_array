import kotlin.math.abs

// https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem

fun minimumAbsoluteDifference(arr: Array<Int>): Int {
    var minDiff = -1

    // Let's sort the array
    arr.sort()

    // Let's find the min difference
    for (i in 0 until arr.size - 1) {
        val diff = abs(arr[i] - arr[i + 1])

        if (diff < minDiff || minDiff == -1 )
            minDiff = diff
    }

    return minDiff
}

fun main() {

}
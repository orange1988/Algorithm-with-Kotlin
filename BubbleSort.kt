/**
 * Created by Orange on 17/5/26.
 */

fun main(args: Array<String>) {

    var D = arrayOf(6, 2, 3, 3, 9, 9, 2, 3, 9, 8, 3, 9, 7, 7, 3)

    var N = D.size;

    println("original array  = " + D.toList())

    while (N > 1) {
        for (i in 1 until N) {
            if (D[i - 1] > D[i]) {
                println("swap  = " + D.toList())
                var temp = D[i - 1]
                D[i - 1] = D[i]
                D[i] = temp

            }
        }
        N--
    }

    println("sorted array  = " + D.toList())

}

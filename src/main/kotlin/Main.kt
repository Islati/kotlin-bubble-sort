fun swap(numbers: IntArray, position: Int, nextPosition: Int): IntArray{
    val tmp: Int = numbers[position]
    numbers[position] = numbers[nextPosition]
    numbers[nextPosition] = tmp //Puts the previous value in the swapped space
    return numbers;
}

fun bubbleSort(numbers: IntArray): IntArray {
    var swapped = true;

    do {
        swapped = false;
        for (i in 0 until numbers.size - 1) {
            if (numbers[i] < numbers[i + 1]) {
                continue;
            }

            swap(numbers, i, i + 1);
            swapped = true;
        }

    } while (swapped == true);
    return numbers; 
}

fun main(args: Array<String>) {
    var integers = intArrayOf(5,1,2,6,9,11,22,12,13,4,3,8,7);
    println("Beginning bubbleswap on 5,1,2,6,9,11,22,12,13,4,3,8,7")
    integers = bubbleSort(integers);

    for(i in 0 until integers.size) {
        print("$i,");
    }

    println("")
    println("Bubble swap completed")
}
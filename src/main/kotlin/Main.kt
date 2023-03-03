fun main(args: Array<String>) {
    var t: Int = 0;
    var reverse = false
    var input: Int = readln().toInt();
    var solonum = (1..input * 2 step (2)).toList();
    for (j in 1..input * 2 - 1) {
        for (i in 1..input * 2 - 1) {
            if (i == input - t) {
                for (r in 1..solonum[t])
                    print("*")
                break
            } else {
                print(" ")
            }
        }
        if (j !=input * 2 - 1)
        println()
        if ((t + 1 < input) && !reverse)
            t++
        else {
            reverse = true
            t--
        }
    }

}


//  1st Program
//def calculate(a, b, operation) {
//    operation(a, b)
//}
//
//def add = { x, y -> x + y }
//def subtract = { x, y -> x - y }
//def multiply = { x, y -> x * y }
//
//println "Addition: ${calculate(10, 5, add)}"
//println "Subtraction: ${calculate(10, 5, subtract)}"
//println "Multiplication: ${calculate(10, 5, multiply)}"




//  2nd Program
//print "Enter a sentence: "
//def input = System.console()?.readLine() ?: "hello world hello"
//def words = input.toLowerCase().split(" ")
//
//def freqMap = [:]
//
//words.each { word ->
//    freqMap[word] = freqMap.get(word, 0) + 1
//}
//
//freqMap.each { key, value ->
//    println "$key → $value"
//}



//  3rd Program
def words = ["hi", "hello", "bye", "good", "sun"]
def groupedMap = [:].withDefault { [] }

words.each { word ->
    groupedMap[word.length()] << word
}

groupedMap.each { length, wordList ->
    println "$length → $wordList"
}



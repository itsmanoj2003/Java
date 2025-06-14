
// 1st Program
def file = new File("manoj.txt")
file.write("Manoj Prabhakaran")
println "File content: ${file.text}"




// 2nd Program
try {
    def a = 10
    def b = 0
    def result = a / b
} catch (ArithmeticException e) {
    println "Divide by zero error!"
} finally {
    println "Division attempted."
}

try {
    def missingFile = new File("notfound.txt")
    println missingFile.text
} catch (FileNotFoundException e) {
    println "File not found!"
}




// 3rd Program
class MyClass {
    def methodMissing(String name, args) {
        println "Method '${name}' is not defined"
    }

    def propertyMissing(String name) {
        return "undefined"
    }
}
def obj = new MyClass()
obj.hello()
println obj.unknownProp





// 4th Program
def dynamicObj = new Expando()
dynamicObj.name = "Manoj"
dynamicObj.city = "Kovilpatti"
println "${dynamicObj.name} from ${dynamicObj.city}"

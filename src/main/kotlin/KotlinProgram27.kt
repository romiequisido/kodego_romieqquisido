fun main(){
    var joe = Person("Joe", 21)
    println("**********")
    println("${joe.name}'s current age is ${joe.age}")
    println("After 1 year....")
    joe.ageUp()
    println("${joe.name}'s current age is ${joe.age}")

//    var joe  = Person("Joe", 21)
//    var anna = Person("Anna", 21)
//    var joe = Person()
//    joe.name = "Joe"
//    println(joe.name)
//    joe.walk()
//    joe.eat()

//    var anna = Person()
//    anna.name = "Anna"
//    println(anna.name)
//    anna.walk()
//    anna.eat()

//    var mark = Person()
//    mark.name = "mark"
//    println(mark.name)
//    mark.walk()
//    mark.eat()
}

class Person (var name: String, var age:Int){ //constructor
    //var name : String = "John"
    //var age : Int = 21
    //var name:String = personName
    //var age: Int = personAge

    init {
        println("Object Created")
        println("name is $name")
        println("age is $age")
    }

    fun walk(){
        println("A person walks")
    }
    fun eat(){
        println("A person eats")
    }
    fun displayAge(){
        println(age)
    }
    fun ageUp(){
        age++
    }
}
fun main(){
    //Immutable list
    var people = listOf<String>("Donald","Dray","Larry", "Terry", "Juan")
    println(people)

    //mutable lists
    var cars = mutableListOf<String>("Rolls Royce", "Koenigsegg","Jeep", "Bugatti","Range rover")
    //prints out the number of elements in a list
    println(cars.count())
    //prints out the last element in a list
    println(cars.last())
    //prints out the first  element in a list
    println(cars.first())
    //prints the element at the 4th index in the list
    println(cars[4])
    //adds an element in the list
    cars.add("Lamborghini")
    println(cars)

    var ages = mutableListOf<Int>(12,14,24,13,28,30,17,18,27,25,29)
    var youths = ages.filter { age-> age>18 }
    println(youths)
    println(ages.maxOrNull())
    //lowest age
    println(ages.minOrNull())
    //the highest age
    println(ages.sum())
    //average age
    println(ages.average())
}
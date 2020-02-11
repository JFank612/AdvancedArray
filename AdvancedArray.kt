fun main(arg: Array<String>){
    var taco = arrayOf<String>("shell", "ground beef", "cheese", "lettuce", "sour cream")
    var amount = arrayOf("10", "5", "4", "2", "2")

    var combArray = arrayOf<Array<String>>()

    combArray+= taco
    combArray+= amount

    var rows:Int = combArray[0].size -1

    println("shell")
    println("ground beef")
    println("cheese")
    println("lettuce")
    println("sour cream")
    print("Enter ingredient:")
    var inventory:String = readLine()!!
    var inventoryNum = -1

    for (i:Int in 0..rows)
    {
        var items:String = combArray[0][i]

        if (items == inventory) {
            inventoryNum = i
        }
    }
    if (inventoryNum != -1)
    {
        println("Item: " + combArray[0][inventoryNum] + " with " + combArray[1][inventoryNum] + " remaining")
        print("How much are you adding/subtracting:")
        val newAmount:Int = readLine()!!.toInt()


        if(((combArray[1][inventoryNum]).toInt() + newAmount) > 0)
        {
            println("Item: " + combArray[0][inventoryNum])
            println("Original amount: " + combArray[1][inventoryNum])
            combArray[1][inventoryNum] = ((combArray[1][inventoryNum]).toInt() + newAmount).toString()
            println("Change in amount: $newAmount")
            println("There are: " + combArray[1][inventoryNum] + " remaining " + combArray[0][inventoryNum])
        }
        else if(((combArray[1][inventoryNum]).toInt() + newAmount) == 0)
        {

            println("Item: " + combArray[0][inventoryNum])
            println("Original amount: " + combArray[1][inventoryNum])
            combArray[1][inventoryNum] = ((combArray[1][inventoryNum]).toInt() + newAmount).toString()
            println("Change in amount: $newAmount")
            println("New amount remaining: " + combArray[1][inventoryNum])
            println("There is/are none left of this item.")
        }
        else{
            println("Sorry, that amount is invalid.")
            println("Item: " + combArray[0][inventoryNum])
            println("Original amount: " + combArray[1][inventoryNum])
            println("Requested Amount: $newAmount")
            println("Amount received: -" + combArray[1][inventoryNum])
            combArray[1][inventoryNum] = "0"
            println("New amount remaining: " + combArray[1][inventoryNum])
            println("There is/are none left of this item.")
        }
    }
    else
    {
        println("Invalid item.")
    }


}
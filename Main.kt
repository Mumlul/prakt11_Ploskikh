
fun main() {
    //zadanie 1
    /*val today = WeekDay.FRIDAY
    val favoriteColor = Color.BLUE

    today.printAsString()
    today.printAsNumber()

    favoriteColor.printAsString()
    favoriteColor.printAsNumber()*/

    //zadanie 2
    try {
        println("Введите название фрукта который вы хотите купить")
        var s= readln()
        val fruit= Fruits.valueOf(s)
        fruit.jj(fruit)
        fruit.printQuantity()
        fruit.printPrice()
        println("общая стоимость продуктов:"+fruit.calculateTotalPrice())
        println(fruit.isAvailableInStock(s,fruit))
        //z2.2
        println("Введите время года про которое хотите узнать")
        s= readln()
        println("1:${Season.valueOf(s).getDescription()}")
        println("2: ${Season.valueOf(s).getActivities()}")
        println("3: ${Season.valueOf(s).getWeather()}")
        println("4: ${Season.valueOf(s).getFavoriteFoods()}")
    }catch (e:Exception){
        println("no")
    }



}



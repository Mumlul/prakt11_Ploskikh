enum class Color {
    RED, GREEN, BLUE, YELLOW;

    fun printAsString() {
        println(this.name)
    }

    fun printAsNumber() {
        println(this.ordinal + 1)
    }
}
enum class WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;


    fun printAsString() {
        println(when (this) {
            MONDAY -> "Monday"
            TUESDAY -> "Tuesday"
            WEDNESDAY -> "Wednesday"
            THURSDAY -> "Thursday"
            FRIDAY -> "Friday"
            SATURDAY -> "Saturday"
            SUNDAY -> "Sunday"
        })
    }

    fun printAsNumber() {
        println(this.ordinal + 1)
    }
}

enum class Fruits(var qty: Int, var price: Double) {
    BANANA(10, 0.9), APPLE(12, 1.1), ORANGE(5, 1.5), KIWI(15, 1.8);

    fun printQuantity() {
        println("Кол-во:"+this.qty)
    }

    fun jj(fr:Fruits):Int{
        println("Введите сколько вам надо")
        fr.qty= readln()!!.toInt()
        return fr.qty
    }

    fun printPrice() {
        println("Стоимость 1:"+this.price)
    }

    fun calculateTotalPrice(): Double {
        return qty * price
    }

    fun isAvailableInStock(s:String,fr:Fruits): String {
        if(checkProductAvailability(s,fr)==true)
        return "покупка прошла успешно"
        else return "извините товара на складе не хватило"
    }


    companion object {
        private var productsInStock = mapOf(
            "BANANA" to 10,
            "APPLE" to 20,
            "ORANGE" to 40,
            "KIWI" to 50
        )


        fun checkProductAvailability(productName: String,fr:Fruits): Boolean {
            if(productsInStock.containsKey(productName) && productsInStock[productName]!! >fr.qty ){
                return true
            }
            else return false
        }
    }
}

enum class Season {
    SPRING, SUMMER, AUTUMN, WINTER;

    fun getDescription(): String {
        return when (this) {
            SPRING -> "Весна это когда много грязи"
            SUMMER -> "Лето это когда сначала месяц сессия а потом отдых"
            AUTUMN -> "Осень это когда дети плачут"
            WINTER -> "Зима это когда дед мороз вламывается в чужие дома"
        }
    }

    fun getActivities(): String {
        return when (this) {
            SPRING -> "Активности весной это аллергия"
            SUMMER -> "Активности летом это работа(очень много)"
            AUTUMN -> "Активности осенью это очень много плакать"
            WINTER -> "Активности зимой это убирать снег(но только тем кто живет в домах за городом)"
        }
    }

    fun getWeather(): String {
        return when (this) {
            SPRING -> "Погода весной это потоп"
            SUMMER -> "Погода летом это ад"
            AUTUMN -> "Погода осенью это не понятно что "
            WINTER -> "Погода зимой это 40 слоев одежды"
        }
    }

    fun getFavoriteFoods(): String {
        return when (this) {
            SPRING -> "Я не знаю"
            SUMMER -> "Мороженное"
            AUTUMN -> "Я не знаю"
            WINTER -> "Салатики"
        }
    }

}
fun main(args: Array<String>) {
    val amount: Int = 25000
    val commission: Double = 0.75
    val minCommission: Int = 35

    val commissionsResult =  if (amount * commission / 100 > minCommission) amount * commission / 100 else (minCommission)

    println("Commission is : $commissionsResult rub")

}
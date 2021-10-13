
fun main (){
    println("Please Enter the year")
    var year = readLine()!!.toInt()

    if (year <= 1582){
        if(year % 4 == 0){
            println("leap year")
        }else{
            println("not leap year")
        }

    }else{
        if(year % 400 == 0){
            println("leap year")

        }else if (year % 100 == 0) {
            println("not leap year")
        }else if (year % 4 == 0) {
            println("leap year")
        }else{
            println("not leap year")

        }


    }


}
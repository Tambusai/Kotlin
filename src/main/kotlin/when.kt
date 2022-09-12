fun main(args: Array<String>){
    var x : Int=12

    when (x){
        3,4,5,6 -> print("it is summer season")
        6,7,8,9 -> print("it is rainly season")
        8,10,11 -> print("it is autumn season")
        10,12,1,2 -> print("it is winter season")
        else -> {
            print("salah input")
        }
    }
}

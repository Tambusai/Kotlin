fun main() {
    println("Masukan nilai UTS")
    var uts: Int = readLine()!!.toInt()
    println("Masukan nilai UAS")
    var uas: Int = readLine()!!.toInt()
    var Nilai: Double = (0.4 * uts) + (0.5 * uas)



    if (Nilai >= 80) {
        println("ANDA NAIK SEMESTER")
    } else {
        println("AMBIL CUTIMU")
    }
}
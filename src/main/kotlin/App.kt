import utils.ExecuteGameUtils
import utils.IOUtils

fun main() {
    val routines = Routines()
    val obj = ExecuteGameUtils()
    println(obj.printHeader())
    readLine()?.let {
        routines.openMenu(it)
    }
}


























import about.About
import utils.ExecuteGameContract
import utils.ExecuteGameUtils
import utils.IOUtils

class Routines {


    val about = About()
    val obj = ExecuteGameUtils()

    private var inputPlayer1 = 0
    private var inputPlayer2 = 0
    private var nilaiPlayer1 = 0
    private var nilaiPlayer2 = 0

    private var namePlayer1 = ""
    private var namePlayer22 = ""

    fun setGame(namePlayer : String, namePlayer2 : String, choicePlayer: Int, choicePlayer2: Int) {
        inputPlayer1 = choicePlayer
        inputPlayer2 = choicePlayer2
        namePlayer1 = namePlayer
        namePlayer22 = namePlayer2

        if (choicePlayer == 0 && choicePlayer2 == 2 || choicePlayer == 2 && choicePlayer2 == 1 || choicePlayer == 1 && choicePlayer2 == 0) nilaiPlayer1++
        else if ((choicePlayer2 == 0 && choicePlayer == 2 || choicePlayer2 == 2) && choicePlayer == 1 || choicePlayer2 == 1 && choicePlayer == 0) nilaiPlayer2++
    }


    fun returGameTotal() {
        val returGame =
            if (nilaiPlayer1 > nilaiPlayer2) "$namePlayer1 telah menjadi juara dan $namePlayer22 kalah." else if (nilaiPlayer1 < nilaiPlayer2) "$namePlayer22 telah menjadi juara dan $namePlayer1 kalah." else "Tidak ada yang juara, skor yang diperoleh sama."
        println("Hasil Permainan: ")
        println("* $namePlayer1 mendapatkan skor: " + nilaiPlayer1)
        println("* $namePlayer22 mendapatkan skor: " + nilaiPlayer2)
        println(returGame)
    }


     fun openMenu(menu: String) {
        when (menu) {
            "1" -> {
                inputParamGame()
            }
            "2" -> {
                about.aboutApss()
            }
            "3" -> {
                System.exit(0)
            }
            else -> {
                println("No menu matches")
                main()
            }
        }
    }

    fun inputParamGame(){


        println("Masukkan Nama Pemain Pertama")
        var namaPlayer = readLine()

        println("Masukkan Nama Pemain ke-Dua")
        var namaPlayer2 = readLine()


        println("Hallo, $namaPlayer & $namaPlayer2 !! Selamat datang di arena permainan")
        println("============= Batu - Gunting - Kertas =============")

        namaPlayer?.let { namaPlayer2?.let { it1 -> executeGame(it, it1) } }
    }





    fun executeGame( p1: String, p2: String){

        val obj = ExecuteGameUtils()

        print("Berapa kali ingin bermain? ")
        val numberOfGames = IOUtils.readInt()

        var count = 0
        while (count < numberOfGames) {
            println(obj.characterChoice())
            println("Input untuk $p1 : ")
            var choicePlayer = IOUtils.readInt()
            if (choicePlayer < 0 || choicePlayer > 2) choicePlayer = 0
            println(obj.playerChoice(p1 ,choicePlayer))

            println("Input untuk $p2 : ")
            var choicePlayer2 = IOUtils.readInt()
            if (choicePlayer2 < 0 || choicePlayer2 > 2) choicePlayer2 = 0

            println(obj.playerChoice(p2,choicePlayer2))


            setGame(p1, p2, choicePlayer, choicePlayer2)
            val result = obj.returnGame(choicePlayer, choicePlayer2)
            println ("Hasil : $result")
            count++
        }
        returGameTotal()
        println("===================================================")



    }
}
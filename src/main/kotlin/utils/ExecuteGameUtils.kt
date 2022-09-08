package utils

class ExecuteGameUtils : ExecuteGameContract {
    override fun playerChoice(player:String, tipe: Int): String {
        return "$player memilih: " + if  (tipe == 0) "Batu" else if (tipe == 1) "Kertas" else "Gunting"
    }

    override fun characterChoice(): String{
        return """Pilih tangan : 
            0 -> Batu 
            1 -> Kertas
            2 -> Gunting """
    }

    override  fun printHeader(): String {
       return """
            ======================================
            GAME SUIT TERMINAL VERSION
            ======================================
            1. Mulai Permainan
            2. Tetang Aplikasi
            3. Exit
            ======================================
            Enter menu ? (1/2/3)
            ======================================
        """
    }

    override fun returnGame(choicePlayer: Int, choicePlayer2: Int): String{
       return if (choicePlayer == 0 && choicePlayer2 == 2 || choicePlayer == 2 && choicePlayer2 == 1 || choicePlayer == 1 && choicePlayer2 == 0) {
                "Menang"
            } else if (choicePlayer2 == 0 && choicePlayer == 2 || choicePlayer2 == 2 && choicePlayer == 1 || choicePlayer2 == 1 && choicePlayer == 0) {
                "Kalah"
            } else "Seri"
    }





}
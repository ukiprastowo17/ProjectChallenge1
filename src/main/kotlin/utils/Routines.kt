package utils

class PlayerChoice {

    fun playerChoice(tipe: Int): String {
        return if (tipe == 0) "Batu" else if (tipe == 1) "Kertas" else "Gunting"
    }
}
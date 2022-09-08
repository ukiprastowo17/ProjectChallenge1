package utils

interface  ExecuteGameContract {
     fun playerChoice(player:String, tipe: Int): String
     fun characterChoice(): String
     fun printHeader(): String
     fun returnGame( choicePlayer: Int, choicePlayer2: Int): String
}
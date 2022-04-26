var time =0U
var now = 0U
var minute = 0U
var hour = 0U
val today =0U
val yesterday = 0U
val longAgo = 0U

fun main() {
    println("Введите время")
    time = readLine()?.toUInt() ?: return
    val f = when {
        time <= 60u -> {
            println("Был(а) только что")
        }

        time >= 61u && time <= 60u * 60u -> {
             Cminute(); when {
                minute == 1u|| minute == 21u || minute == 31u || minute == 41u || minute == 51u
                    -> println ("Был(а)  $minute минуту назад")
                        minute >= 2u && minute <= 4u ||
                        minute >= 22u && minute <= 24u ||
                        minute >= 32u && minute <= 34u ||
                        minute >= 42u && minute <= 44u ||
                        minute >= 52u && minute <= 54u
                    -> println("Был(а) $minute минуты назад")
                else ->
                    println("Был(а)  $minute минут назад")

            }
        }

        time >= 60u * 60u + 1u && time <= 24u * 60u * 60u -> {
            Chour(); when {
                hour == 1u
                    -> println("Был(а) $hour час назад ")
                hour >= 2u && hour <= 4u ||
                hour >= 22u && hour >= 24u
                    -> println("Был(а) $hour часа назад ")
                else
                   -> println("Был(а) $hour часов назад ")

            }
            println("Был(а) $hour часов назад.")
        }

        time >= 24u * 60u * 60u + 1u && time <= 24u * 60u * 60u * 2u -> {
            println("Был(а) сегодня")
        }

        time >= 24u * 60u * 60u * 2u + 1u && time <= 24u * 60u * 60u * 3u -> {
            println("Был(а) вчера")
        }

        else -> {
            println("Был(а) давно")
        }
    }
}
fun Cminute() {
    minute = time / 60u
}
fun Chour () {
    hour = time  / 60u / 60u
}
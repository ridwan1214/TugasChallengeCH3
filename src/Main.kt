class Main {

    companion object :CallBack {
        @JvmStatic
        fun main(args: Array<String>) {

            val ulang = true
            do{
                println("==========================")
                println("GAME SUIT TERMINAL VERSION")
                println("==========================")
                println("Masukkan Pilihan")
                println("Gunting || Batu || Kertas")
                println("")
                print("Masukkan Pemain 1: ")
                val pemain1: String? = readLine()
                print("Masukkan Pemain 2: ")
                val pemain2: String? = readLine()

                val controller = Controller(this)

                if (pemain1 == pemain2){
                    controller.hasilDraw(pemain1, pemain2)
                } else {
                    controller.hasilMenang(pemain1, pemain2)
                }

            } while (ulang)
        }

        override fun tampilkanHasilDraw(hasil: String) {
            println("")
            println("Hasil:")
            println(hasil)
            println(" ")
        }

        override fun tampilanP1Win(hasil: String) {
            println("")
            println("Hasil:")
            println(hasil)
            println(" ")
        }

        override fun tampilanP2Win(hasil: String) {
            println("")
            println("Hasil:")
            println(hasil)
            println(" ")
        }
    }
}
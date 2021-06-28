class Controller (private val callBack: CallBack) {
    private val dataGunting = listOf("Gunting","GUNTING","gunting")
    private val dataKertas = listOf("Kertas","KERTAS","kertas")
    private val dataBatu = listOf("Batu","BATU","batu")

    fun hasilDraw(pemain1: String?, pemain2: String?) {
        if (dataGunting.contains(pemain1) && dataGunting.contains(pemain2)) {
            callBack.tampilkanHasilDraw("DRAW!")
        }
        else if (dataKertas.contains(pemain1) && dataKertas.contains(pemain2)) {
            callBack.tampilkanHasilDraw("DRAW!")
        }
        else if (dataBatu.contains(pemain1) && dataBatu.contains(pemain2)) {
            callBack.tampilkanHasilDraw("DRAW!")
        } else {
            println("Salah Kata bos, tolong di cek kembali inputannya")
            println("")
        }
    }

    fun hasilMenang(pemain1: String?, pemain2: String?){
        if (dataGunting.contains(pemain1) && dataBatu.contains(pemain2)) {
            callBack.tampilanP2Win("Pemain 2 MENANG!")
        }
        else if (dataGunting.contains(pemain1) && dataKertas.contains(pemain2)) {
            callBack.tampilanP1Win("Pemain 1 MENANG!")
        }
        else if (dataBatu.contains(pemain1) && dataGunting.contains(pemain2)) {
            callBack.tampilanP1Win("Pemain 1 MENANG!")
        }
        else if (dataBatu.contains(pemain1) && dataKertas.contains(pemain2)) {
            callBack.tampilanP2Win("Pemain 2 MENANG!")
        }
        else if (dataKertas.contains(pemain1) && dataGunting.contains(pemain2)) {
            callBack.tampilanP2Win("Pemain 2 MENANG!")
        }
        else if (dataKertas.contains(pemain1) && dataBatu.contains(pemain2)) {
            callBack.tampilanP1Win("Pemain 1 MENANG!")
        }
        else {
            hasilDraw(pemain1,pemain2)
        }
    }
}
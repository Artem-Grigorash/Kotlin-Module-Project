fun printCommandList() {
    println("-----------------------------------------")
    println("Command list:\n--For archives:--\n${Commands.CrAr} \n${Commands.ShAr} \n${Commands.DeAr} \n${Commands.OpAr}")
    println("--For notes:--\n${Commands.CrNo} \n${Commands.ShNo} \n${Commands.DeNo} \n${Commands.OpNo} \n${Commands.ReNo}\n${Commands.ClNo}")
    println("--For navigation:--\n${Commands.BACK} \n${Commands.ShCo}")
    println("-----------------------------------------")
}

enum class Commands(val com: String) {
    CrAr("create archive"),
    ShAr("show archives"),
    DeAr("delete archive"),
    OpAr("open archive"),

    CrNo("create note"),
    ShNo("show notes"),
    DeNo("delete note"),
    OpNo("open note"),
    ReNo("add text"),
    ClNo("clean note"),

    BACK("back"),
    ShCo("show commands");
}


fun printCommandList() {
    println("-----------------------------------------")
    println("Command list:\n--For archives:--\n${Commands.CrAr.com} \n${Commands.ShAr.com} \n${Commands.DeAr.com} \n${Commands.OpAr.com}")
    println("--For notes:--\n${Commands.CrNo.com} \n${Commands.ShNo.com} \n${Commands.DeNo.com} \n${Commands.OpNo.com} \n${Commands.ReNo.com}\n${Commands.ClNo.com}")
    println("--For navigation:--\n${Commands.BACK.com} \n${Commands.ShCo.com}")
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


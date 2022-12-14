import java.util.*

fun main() {
    val read = Scanner(System.`in`)
    val archive = Archives()
    var screen = Screens.S.scr
    var flag = true
    println("Let`s start")
    printCommandList()
    archive.showElements()
    var command = read.nextLine()
    while (flag) {
        when (command) {
            Commands.CrAr.com -> {
                if (screen == Screens.S.scr)
                    archive.createNotesList()
                else
                    println(Screens.GB.scr)
            }
            Commands.ShAr.com -> {
                if (screen == Screens.S.scr)
                    archive.showElements()
                else
                    println(Screens.GB.scr)
            }
            Commands.DeAr.com -> {
                if (screen == Screens.S.scr)
                    archive.deleteNoteList()
                else
                    println(Screens.GB.scr)
            }
            Commands.OpAr.com -> {
                if (screen == Screens.S.scr) {
                    archive.openNoteList()
                    screen = Screens.L.scr
                } else
                    println(Screens.GB.scr)
            }

            Commands.CrNo.com -> {
                if (screen == Screens.L.scr)
                    archive.makeNewNote()
                else
                    println(Screens.O.scr)
            }
            Commands.ShNo.com -> {
                if (screen == Screens.L.scr)
                    archive.showMyNotes()
                else
                    println(Screens.O.scr)
            }
            Commands.DeNo.com -> {
                if (screen == Screens.L.scr)
                    archive.deleteMyNote()
                else
                    println(Screens.O.scr)
            }
            Commands.OpNo.com -> {
                if (screen == Screens.L.scr) {
                    archive.openMyNote()
                    screen = Screens.N.scr
                } else
                    println(Screens.O.scr)
            }
            Commands.ReNo.com -> {
                if (screen == Screens.L.scr)
                    archive.redactMyNote()
                else
                    println(Screens.O.scr)
            }
            Commands.ClNo.com -> {
                if (screen == Screens.L.scr)
                    archive.cleanMyNote()
                else
                    println(Screens.O.scr)
            }

            Commands.BACK.com -> {
                when (screen) {
                    Screens.S.scr -> flag = false
                    Screens.L.scr -> {
                        archive.backFromNoteList()
                        screen = Screens.S.scr
                    }
                    Screens.N.scr -> {
                        archive.showMyNotes()
                        screen = Screens.L.scr
                    }
                }
            }
            Commands.ShCo.com -> {
                printCommandList()
            }

            else -> println("!Wrong command!")
        }
        if (flag)
            command = read.nextLine()
    }
}

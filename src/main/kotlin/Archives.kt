data class Archives(
    var listsOfNotes: HashMap<String, NotesList> = HashMap(),
) : Scan(), Choise {
    private var lastOpened: NotesList? = null

    fun createNotesList() {
        val title = getTitle(Variants.IAE.variant)
        listsOfNotes[title] = NotesList(title)
        println("The archive was created successfully")
        showElements()
    }

    fun deleteNoteList() {
        val title = getTitle(Variants.INE.variant)
        listsOfNotes.remove(title)
        println("Archive successfully deleted")
        showElements()
    }

    fun openNoteList() {
        val title = getTitle(Variants.INE.variant)
        listsOfNotes[title]?.showElements()
        lastOpened = listsOfNotes[title]
    }

    fun makeNewNote() {
        lastOpened?.createNote()
    }

    fun showMyNotes() {
        lastOpened?.showElements()
    }

    fun deleteMyNote() {
        lastOpened?.deleteNote()
    }

    fun openMyNote() {
        lastOpened?.openNote()
    }

    fun redactMyNote() {
        lastOpened?.redactNote()
    }

    fun cleanMyNote() {
        lastOpened?.cleanNote()
    }

    fun backFromNoteList() {
        lastOpened = null
        showElements()
    }

    override fun showElements() {
        println("Archives:")
        var position = 1
        for (element in listsOfNotes.keys)
            println("${position++}. $element")
        if (listsOfNotes.size == 0)
            println("now is empty")
    }

    override fun getTitle(variant: String): String {
        println("Enter the title")
        var title: String = read.nextLine()
        when (variant) {
            Variants.INE.variant -> {
                while (!listsOfNotes.containsKey(title)) {
                    println(variant)
                    title = read.nextLine()
                }
            }
            Variants.IAE.variant -> {
                while (listsOfNotes.containsKey(title)) {
                    println(variant)
                    title = read.nextLine()
                }
            }
        }
        return title
    }
}

data class Archives(
    var listsOfNotes: HashMap<String, NotesList> = HashMap(),
    var listNames: HashSet<String> = HashSet()
) : Choise(title = "NoteList", list = listNames) {
    private var lastOpened: NotesList? = null

    fun createNotesList() {
        val title = getTitle(Variants.IAE.variant)
        listNames.add(title)
        listsOfNotes[title] = NotesList(title)
        println("The archive was created successfully")
        showElements()
    }

    fun deleteNoteList() {
        val title = getTitle(Variants.INE.variant)
        listNames.remove(title)
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
}

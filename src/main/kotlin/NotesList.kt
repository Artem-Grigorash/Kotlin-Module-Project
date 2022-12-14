open class NotesList(
    name: String = "",
    private var notes: HashMap<String, Note> = HashMap(),
    private var noteNames: HashSet<String> = HashSet()
) : Choise(title = name, list = noteNames) {
    fun createNote() {
        val title = getTitle(Variants.IAE.variant)
        println("Enter the text")
        val text: String = read.nextLine()
        noteNames.add(title)
        notes[title] = Note(title, text)
        println("The note was created successfully")
        showElements()
    }

    fun deleteNote() {
        val title = getTitle(Variants.INE.variant)
        noteNames.remove(title)
        notes.remove(title)
        showElements()
    }

    fun openNote() {
        val title = getTitle(Variants.INE.variant)
        notes[title]?.showNote()
    }

    fun redactNote() {
        val title = getTitle(Variants.INE.variant)
        notes[title]?.showNote()
        notes[title]?.addText()
    }

    fun cleanNote() {
        val title = getTitle(Variants.INE.variant)
        notes[title]?.removeText()
    }
}


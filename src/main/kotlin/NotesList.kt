open class NotesList(
    name: String = "",
    private var notes: HashMap<String, Note> = HashMap(),
) : Scan(), Choise {
    fun createNote() {
        val title = getTitle(Variants.IAE.variant)
        println("Enter the text")
        val text: String = read.nextLine()
        notes[title] = Note(title, text)
        println("The note was created successfully")
        showElements()
    }

    fun deleteNote() {
        val title = getTitle(Variants.INE.variant)
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

    override fun showElements() {
        println("Notes:")
        var position = 1
        for (element in notes.keys)
            println("${position++}. $element")
        if (notes.size == 0)
            println("now is empty")
    }

    override fun getTitle(variant: String): String {
        println("Enter the title")
        var title: String = read.nextLine()
        when (variant) {
            Variants.INE.variant -> {
                while (!notes.containsKey(title)) {
                    println(variant)
                    title = read.nextLine()
                }
            }
            Variants.IAE.variant -> {
                while (notes.containsKey(title)) {
                    println(variant)
                    title = read.nextLine()
                }
            }
        }
        return title
    }
}


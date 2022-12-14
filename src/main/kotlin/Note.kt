class Note(
    private val title: String,
    private var text: String?
) : Scan() {
    fun showNote() {
        println("-- $title --")
        println(text)
    }

    fun addText() {
        println("Enter the text")
        val newText = read.nextLine()
        text += newText
        showNote()
    }

    fun removeText() {
        text = ""
        showNote()
    }
}
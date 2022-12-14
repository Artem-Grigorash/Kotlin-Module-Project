import kotlin.collections.HashSet

open class Choise(
    val title: String,
    var list: HashSet<String>
) : Scan() {
    open fun showElements() {
        println("$title:")
        var position = 1
        for (element in list)
            println("${position++}. $element")
        if (list.size == 0)
            println("now is empty")
    }

    fun getTitle(variant: String): String {
        println("Enter the title")
        var title: String = read.nextLine()
        when (variant) {
            Variants.INE.variant -> {
                while (!list.contains(title)) {
                    println(variant)
                    title = read.nextLine()
                }
            }
            Variants.IAE.variant -> {
                while (list.contains(title)) {
                    println(variant)
                    title = read.nextLine()
                }
            }
        }
        return title
    }
}
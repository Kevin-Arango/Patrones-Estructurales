package structural_pattern.Flyweight

class PlayList(private val playListName: String) {
    private val playItems= ArrayList<PlayItem?>()

    fun addPlayItem(songName: String) {
        playItems.add(PlayItemFactory.createPlayItem(songName))
    }

    fun printList() {
        var out = "\nPlayList > $playListName"
        playItems.forEach{out += "\n\t" + it.toString()}
        println(out)
    }
}

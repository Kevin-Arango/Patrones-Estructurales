package structural_pattern.Flyweight

import java.util.HashMap

class PlayItemFactory {
    companion object {

        private val ENABLE_FLYWEIGHT = true
        private val playItems = hashMapOf<String, PlayItem>()
        private var idSequence = 0L

        fun createPlayItem(songName: String): PlayItem? {
            return if (ENABLE_FLYWEIGHT && playItems.containsKey(songName)) {
                playItems[songName]
            } else {
                val playItem = PlayItem(++idSequence, songName.uppercase())
                playItems[songName] = playItem
                playItem
            }
        }
    }
}


import structural_pattern.Flyweight.PlayList


fun main() {
        val playListAbilene = PlayList("Musica Popular")
        playListAbilene.addPlayItem("La Llorona")
        playListAbilene.addPlayItem("La llorona")
        playListAbilene.addPlayItem("La Matraca")
        playListAbilene.addPlayItem("La Sierra")
        playListAbilene.addPlayItem("Los 2 Hermanos")
        playListAbilene.addPlayItem("La Llorona")
        playListAbilene.printList()

        val playListAntonio = PlayList("Música Rock")
        playListAntonio.addPlayItem("La Llorona")
        playListAntonio.addPlayItem("Bohemian Rhapsody")
        playListAntonio.addPlayItem("Stairway to Heaven")
        playListAntonio.addPlayItem("Hotel California")
        playListAntonio.addPlayItem("Sweet Child o' Mine")
        playListAntonio.printList()
}

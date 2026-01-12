public class Ballet extends MusicalShow {
    private Person choreographer;  // 1) исправлено

    public Ballet(String title, int duration, Director director, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor.toString(), librettoText);  // 2) исправлено
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }
}

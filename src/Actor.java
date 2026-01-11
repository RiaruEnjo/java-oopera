class Actor extends Person {
    protected int height;

    public Actor(String name, String surname, String gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
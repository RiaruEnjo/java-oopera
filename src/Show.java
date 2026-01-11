import java.util.*;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected List<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printDirectorInfo() {
        System.out.println("Режиссёр: " + director);
    }

    public void printActorsList() {
        System.out.println("Актёры:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + ")");
        }
    }

    public void addActor(Actor newActor) {
        for (Actor existing : listOfActors) {
            if (existing.getName().equals(newActor.getName()) &&
                    existing.getSurname().equals(newActor.getSurname()) &&
                    existing.getHeight() == newActor.getHeight()) {
                System.out.println("Предупреждение: актёр уже есть в списке!");
                return;
            }
        }
        listOfActors.add(newActor);
        System.out.println("Актёр добавлен.");
    }

    public void replaceActor(Actor newActor, String oldSurname) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(oldSurname)) {
                listOfActors.set(i, newActor);
                found = true;
                System.out.println("Актёр заменён.");
                break;
            }
        }
        if (!found) {
            System.out.println("Предупреждение: актёр с фамилией " + oldSurname + " не найден!");
        }
    }

    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
    public Director getDirector() {
        return director;
    }
    public List<Actor> getListOfActors() {
        return new ArrayList<>(listOfActors);
    }

    public static void main(String[] args) {
        Director dir = new Director("Иван", "Петров", "муж", 5);
        Show show = new Show("Гамлет", 120, dir);
        Actor act1 = new Actor("Олег", "Табаков", "муж", 175);
        show.addActor(act1);
        show.printDirectorInfo();
        show.printActorsList();
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        if (listOfActors.isEmpty()) {
            System.out.println("Нет актёров");
            return;
        }
        for (Actor actor : listOfActors) {
            System.out.println(actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + ")");
        }
    }

    public void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Предупреждение: актёр уже есть в списке!");
            return;
        }
        listOfActors.add(newActor);
        System.out.println("Актёр добавлен.");
    }

    public void replaceActor(Actor newActor, String oldSurname) {
        boolean found = false;
        int count = 0;

        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(oldSurname)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Предупреждение: актёр с фамилией " + oldSurname + " не найден!");
            return;
        }
        if (count > 1) {
            System.out.println("Предупреждение: найдено " + count + " актёров с фамилией " + oldSurname);
            return;
        }

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(oldSurname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр заменён.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Ошибка: актёр не заменён!");
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
}

public class Theatre {
    public static void main(String[] args) {
        System.out.println("=== ТЕАТР ===");

        Director dir = new Director("Иван", "Петров", Gender.MALE, 5);

        Actor actor1 = new Actor("Олег", "Табаков", Gender.MALE, 175);
        Actor actor2 = new Actor("Мария", "Иванова", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Олег", "Табаков", Gender.MALE, 175);

        System.out.println("\n--- Гамлет ---");
        Show drama = new Show("Гамлет", 120, dir);
        drama.addActor(actor1);
        drama.addActor(actor2);
        drama.addActor(actor3);
        drama.printDirectorInfo();
        drama.printActorsList();

        System.out.println("\n--- Замена Иванова → Смирнова ---");
        Actor newActor = new Actor("Анна", "Смирнова", Gender.FEMALE, 168);
        drama.replaceActor(newActor, "Иванова");
        drama.printActorsList();

        System.out.println("\n--- Мюзикл Чикаго ---");
        MusicalShow musical = new MusicalShow("Чикаго", 150, dir, "Джон Кандер", "Мюзикл про гангстеров");
        musical.printLibretto();

        System.out.println("\n--- Балет ---");
        Person chaikovsky = new Person("Петр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Мариус", "Петипа", Gender.MALE);
        Ballet ballet = new Ballet("Лебединое озеро", 180, dir, chaikovsky, "Балет", choreographer);
        System.out.println("Хореограф: " + ballet.getChoreographer());

        System.out.println("\n--- Опера ---");
        Opera opera = new Opera("Кармен", 200, dir, "Бизе", "Опера", 40);
        System.out.println("Размер хора: " + opera.getChoirSize());
    }
}

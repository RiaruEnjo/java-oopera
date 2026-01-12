public class Theatre {
    public static void main(String[] args) {
        System.out.println("=== ТЕАТР ===");

        Director dir = new Director("Иван", "Петров", Gender.МУЖ, 5);

        Actor actor1 = new Actor("Олег", "Табаков", Gender.МУЖ, 175);
        Actor actor2 = new Actor("Мария", "Иванова", Gender.ЖЕН, 165);
        Actor actor3 = new Actor("Олег", "Табаков", Gender.МУЖ, 175); // дубликат

        System.out.println("\n--- Гамлет ---");
        Show drama = new Show("Гамлет", 120, dir);
        drama.addActor(actor1);
        drama.addActor(actor2);
        drama.addActor(actor3); // дубликат → предупреждение!
        drama.printDirectorInfo();
        drama.printActorsList();

        System.out.println("\n--- Замена Иванова → Смирнова ---");
        Actor newActor = new Actor("Анна", "Смирнова", Gender.ЖЕН, 168);
        drama.replaceActor(newActor, "Иванова");
        drama.printActorsList();

        System.out.println("\n--- Мюзикл Чикаго ---");
        MusicalShow musical = new MusicalShow("Чикаго", 150, dir, "Джон Кандер", "Мюзикл про гангстеров");
        musical.printLibretto();

        System.out.println("\n--- Балет ---");
        Ballet ballet = new Ballet("Лебединое озеро", 180, dir, "Чайковский", "Балет", "М. Петипа");
        System.out.println("Хореограф: " + ballet.getChoreographer());

        System.out.println("\n--- Опера ---");
        Opera opera = new Opera("Кармен", 200, dir, "Бизе", "Опера", 40);
        System.out.println("Размер хора: " + opera.getChoirSize());
    }
}

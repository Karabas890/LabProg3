import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Cuckoo cuckoo = new Cuckoo("Кукушка обыкновенная");
        Moomitroll moomitroll = new Moomitroll("Ловить бабочек", "Хемуль");
        House house = new House(Color.BLUE);

        moomitroll.setNewHobby("Слушать кукушек по утрам");
        moomitroll.doHobby();
        moomitroll.watch(cuckoo);
        cuckoo.fly(LocalDateTime.of(2022, 3, 14, 4, 0));
        cuckoo.seat(house);
        cuckoo.makeSound(8, LocalDateTime.of(2022, 3, 14, 4, 0));

    }

}
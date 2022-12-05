import java.time.LocalDateTime;
import java.time.Month;
import java.util.Objects;

public class Cuckoo extends Animal implements Flying {
    String a;

    public Cuckoo(String name) {
        setName(name);
    }

    @Override
    public void fly(LocalDateTime time) {
        int hour = time.getHour();
        if (hour <= 6 && hour >= 3) {
            System.out.println("Кукушка летит, это ее первый полет за сегодня");
        } else {
            System.out.println("Кукушка летит");
        }

    }

    public void walk(LocalDateTime time) {
        int hour = time.getHour();
        if (hour >= 0 && hour <= 8) {
            System.out.println("Кукушка ходит во сне");
        } else {
            System.out.println("Кукушка идет");
        }
    }

    @Override
    public void makeSound(int times, LocalDateTime date) {
        if ((date.getMonth().equals(Month.APRIL)) || (date.getMonth().equals(Month.MARCH)) || (date.getMonth().equals(Month.MAY))) {

            for (int i = 0; i < times; i++) {
                System.out.println("Ку-ку(хрипло)");
            }
        } else {

            for (int i = 0; i < times; i++) {
                System.out.println("Ку-ку(громко)");
            }
        }
    }

    @Override
    public void seat(String place) {
        System.out.println("Кукушка сидит на " + place);
    }

    public void seat(House house) {
        System.out.println("Кукушка сидит на " + house);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuckoo cuckoo = (Cuckoo) o;
        return Objects.equals(a, cuckoo.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    @Override
    public String toString() {
        return "Кукушка";
    }


}

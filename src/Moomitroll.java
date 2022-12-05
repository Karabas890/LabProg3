import java.time.LocalDateTime;
import java.util.Objects;

public class Moomitroll extends Animal implements Moomitrolls {

    private String hobby;

    public Moomitroll(String hobby, String name) {
        this.hobby = hobby;
        setName(name);
    }

    @Override
    public void setNewHobby(String hobby) {
        this.hobby = hobby;
    }


    @Override
    public void walk(LocalDateTime time) {
        int hour = time.getHour();
        if (hour >= 0 && hour <= 8) {
            System.out.println(getName() + " спит и перевернулся на другой бок");
        } else {
            System.out.println(getName() + " идет");
        }

    }

    @Override
    public void doHobby() {
        System.out.println(getName() + " решил заняться своим любимым хобби: " + hobby);
    }

    @Override
    public void sayPhrase(String phrase) {
        System.out.println(getName() + " говорит:" + phrase);
    }

    public void watch(Animal animal) {
        System.out.println(this + " наблюдает за " + animal);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moomitroll that = (Moomitroll) o;
        return Objects.equals(hobby, that.hobby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hobby);
    }

    @Override
    public String toString() {
        return "Мумитролль " + this.getName();
    }
}

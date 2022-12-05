import java.time.LocalDateTime;

public abstract class Animal {
    private String name;

    public abstract void walk(LocalDateTime time);

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}

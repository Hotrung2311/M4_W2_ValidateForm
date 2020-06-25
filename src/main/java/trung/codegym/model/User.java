package trung.codegym.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {

    @NotEmpty
    @Size(min = 2, max = 30)
    private String name;

    @Min(18)
    private int helloage;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.helloage = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return helloage;
    }

    public void setAge(int age) {
        this.helloage = age;
    }
}

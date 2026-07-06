package Person2;

import java.util.Objects;

public class PersonInherit {
    private String name;
    private int age;

    public PersonInherit(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof PersonInherit)){
            return false;
        }
        PersonInherit temp = (PersonInherit) obj;
        return temp.name.equals(name) && temp.age==age;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,age);
    }
}

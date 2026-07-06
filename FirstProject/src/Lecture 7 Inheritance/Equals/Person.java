package Equals;  //‼️.equals only gives value only for String anything else Str + no mixed it gives reference value⬇️
//‼️ Isme hum log equals ke sath hash code ko bhi janenge‼️                                                    BOTTOM
import java.util.Objects;


public class Person {
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) { //👽 we are changing the value of equal here for as it gives reference @jhe739 values
        if (!(obj instanceof Person)){  //👽 instanceof checks if the given object is an object of given class
            return false;               // so obj is an object of Person class
        }
        Person per= (Person) obj;
        return per.name.equals(name) && //
                per.age==age &&
                per.id.equals(id);
    }

    @Override                      // ye har field name,age,id ko ek int hash code de dega jo unique hoga to jab hum
    public int hashCode(){         // check krenge aur hash code hi alag honge to false ho jaega.
        return Objects.hash(name,age,id); // aur hume eq&hash me apni sari field dalne ki zarurat nhi h
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}

//@Override       ⬇️was missing
//public boolean❌equals❌(Object obj){
//  ❌if(!(className instanceof obj)){❌
//    if(!(obj instanceof className)){
//      return false;
//  }
//  className newObj = (className) obj;         name,age are variables we are checking
//  ❌if❌return( newObj.name.equals(name),
//      newObj.age.equals(age))❌{❌;
//          ❌return true;❌
//}
//✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️✔️
//@Override
//public boolean equals(Object obj) {
//    if (!(obj instanceof Person)){
//        return false;
//    }
//    Person per= (Person) obj;
//    return per.name.equals(name) &&
//            per.age==age &&
//            per.id.equals(id);
//}
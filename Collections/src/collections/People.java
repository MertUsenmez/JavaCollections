
package collections;

public class People {
    private String name; 
    private String gender;
    private final int ID;
    private String uyruk;
    private int age;

    public People(String name, String gender, int ID, String uyruk, int age) {
        this.name = name;
        this.gender = gender;
        this.ID = ID;
        this.uyruk = uyruk;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }
    public String getGender() {
        return gender;
    }

    public int getID() {
        return ID;
    }

    public String getUyruk() {
        return uyruk;
    }

    public int getAge() {
        return age;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setUyruk(String uyruk) {
        this.uyruk = uyruk;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "HUMAN{" +"name="+ name + ", gender=" + gender + ", ID=" + ID + ", uyruk=" + uyruk + ", age=" + age + '}';
    }
    
    
    
    
}

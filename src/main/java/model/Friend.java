package model;

public class Friend {
    private String Name;
    private int age;
    private String sex;
    private Car car;

    public Friend() {


    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "model.Friend{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", car=" + car +
                '}';
    }
}

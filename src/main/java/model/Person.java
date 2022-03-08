package model;

import java.util.Arrays;

public class Person {
    int idPerson;
    String firstName;
    String  lastName;
    String  middleName;
    int age;
    String phoneNumber;
    String sex;
    String [] hobbies;
    Friend friend;
    String AdditionalInformation;

    public Person() {

    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public String getAdditionalInformation() {
        return AdditionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        AdditionalInformation = additionalInformation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", sex='" + sex + '\'' +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", friend=" + friend +
                ", AdditionalInformation='" + AdditionalInformation + '\'' +
                '}';
    }
}

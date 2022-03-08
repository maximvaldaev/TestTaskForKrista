import main.JSONParsing;
import model.Person;
import org.junit.jupiter.api.*;

import java.io.FileReader;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class JSONParsingTest {
    static String filePath = "InputData.json";
    @BeforeAll
    static void  getFileReaderTest(){
         FileReader fileReader = JSONParsing.getFileReader(filePath);
         if(fileReader==null){
             fail();
         }
    }

    @Test
    void getIdPerson() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals(1, personArrayList.get(0).getIdPerson());
    }



    @Test
    void setIdPerson() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).setIdPerson(2);
        assertEquals(2, personArrayList.get(0).getIdPerson());
    }

    @Test
    void getFirstName() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals("Максим", personArrayList.get(0).getFirstName());
    }

    @Test
    void setFirstName() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).setFirstName("Валерий");
        assertEquals("Валерий", personArrayList.get(0).getFirstName());
    }

    @Test
    void getLastName() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals("Валдаев", personArrayList.get(0).getLastName());
    }

    @Test
    void setLastName() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).setLastName("Иванов");
        assertEquals("Иванов", personArrayList.get(0).getLastName());
    }

    @Test
    void getMiddleName() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals("Валерьевич", personArrayList.get(0).getMiddleName());
    }

    @Test
    void setMiddleName() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).setMiddleName("Иванович");
        assertEquals("Иванович", personArrayList.get(0).getMiddleName());
    }

    @Test
    void getAge() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals(22, personArrayList.get(0).getAge());
    }

    @Test
    void setAge() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).setAge(25);
        assertEquals(25, personArrayList.get(0).getAge());
    }

    @Test
    void getPhoneNumber() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals("9999998130", personArrayList.get(0).getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).setPhoneNumber("0123456789");
        assertEquals("0123456789", personArrayList.get(0).getPhoneNumber());
    }

    @Test
    void getSex() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals("м", personArrayList.get(0).getSex());
    }

    @Test
    void setSex() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).setSex("ж");
        assertEquals("ж", personArrayList.get(0).getSex());
    }

    @Test
    void getHobbies() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        String[] hobbiesArray = {"Теннис", "Компьюторные игры", "Плавание", "Чтение книг"};
        assertArrayEquals(hobbiesArray, personArrayList.get(0).getHobbies());
    }

    @Test
    void setHobbies() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        String[] hobbiesArray = {"Футбол", "Написание музыки"};
        personArrayList.get(0).setHobbies(hobbiesArray);
        assertArrayEquals(hobbiesArray, personArrayList.get(0).getHobbies());
    }

    @Test
    void getNameFriend() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals("Андрей",personArrayList.get(0).getFriend().getName());
    }

    @Test
    void setNameFriend() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).getFriend().setName("Виталий");
        assertEquals("Виталий",personArrayList.get(0).getFriend().getName());
    }

    @Test
    void getAgeFriend() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals(21,personArrayList.get(0).getFriend().getAge());
    }

    @Test
    void setAgeFriend() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).getFriend().setAge(23);
        assertEquals(23,personArrayList.get(0).getFriend().getAge());
    }

    @Test
    void getSexFriend() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals("м",personArrayList.get(0).getFriend().getSex());
    }

    @Test
    void setSexFriend() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).getFriend().setSex("ж");
        assertEquals("ж",personArrayList.get(0).getFriend().getSex());
    }

    @Test
    void getBrandCar() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals("Mercedes", personArrayList.get(0).getFriend().getCar().getBrand());
    }

    @Test
    void setBrandCar() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).getFriend().getCar().setBrand("Volvo");
        assertEquals("Volvo", personArrayList.get(0).getFriend().getCar().getBrand());
    }

    @Test
    void getModelCar() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals("c200", personArrayList.get(0).getFriend().getCar().getModel());
    }

    @Test
    void setModelCar() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).getFriend().getCar().setModel("Granta");
        assertEquals("Granta", personArrayList.get(0).getFriend().getCar().getModel());
    }

    @Test
    void getYearOfIssueCar() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals(2015, personArrayList.get(0).getFriend().getCar().getYearOfIssue());
    }

    @Test
    void setYearOfIssueCar() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).getFriend().getCar().setYearOfIssue(2021);
        assertEquals(2021, personArrayList.get(0).getFriend().getCar().getYearOfIssue());
    }

    @Test
    void getPowerCar() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals(184, personArrayList.get(0).getFriend().getCar().getPower());
    }

    @Test
    void setPowerCar() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).getFriend().getCar().setPower(249);
        assertEquals(249, personArrayList.get(0).getFriend().getCar().getPower());
    }

    @Test
    void getBodyTypeCar() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals("sedan", personArrayList.get(0).getFriend().getCar().getBodyType());
    }

    @Test
    void setBodyTypeCar() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).getFriend().getCar().setBodyType("coupe");
        assertEquals("coupe", personArrayList.get(0).getFriend().getCar().getBodyType());
    }
    @Test
    void getBodyAdditionalInformation() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        assertEquals(null, personArrayList.get(0).getAdditionalInformation());
    }

    @Test
    void setBodyAdditionalInformation() {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        personArrayList.get(0).setAdditionalInformation("young");
        assertEquals("young", personArrayList.get(0).getAdditionalInformation());
    }
}


package main;

import model.Car;
import model.Friend;
import model.Person;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonValue;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;

public class JSONParsing {


    private static void parseFriend(StringReader stringReader, Friend friend) {
        JsonParser parser = Json.createParser(stringReader);
        while (parser.hasNext()) {
            Event event = parser.next();
            if (event == Event.KEY_NAME) {
                switch (parser.getString()) {
                    case "name":
                        parser.next();
                        friend.setName(parser.getString());
                        break;
                    case "age":
                        parser.next();
                        friend.setAge(parser.getInt());
                        break;
                    case "sex":
                        parser.next();
                        friend.setSex(parser.getString());
                        break;
                    case "car":
                        parser.next();
                        Car car = new Car();
                        parseCar(new StringReader(parser.getObject().toString()), car);
                        friend.setCar(car);
                        break;
                }
            }

        }

    }

    private static void parseCar(StringReader stringReader, Car car) {
        JsonParser parser = Json.createParser(stringReader);
        while (parser.hasNext()) {
            Event event = parser.next();
            if (event == Event.KEY_NAME) {
                switch (parser.getString()) {
                    case "brand":
                        parser.next();
                        car.setBrand(parser.getString());
                        break;
                    case "model":
                        parser.next();
                        car.setModel(parser.getString());
                        break;
                    case "yearOfIssue":
                        parser.next();
                        car.setYearOfIssue(parser.getInt());
                        break;
                    case "power":
                        parser.next();
                        car.setPower(parser.getInt());
                        break;
                    case "bodyType":
                        parser.next();
                        car.setBodyType(parser.getString());
                        break;
                }
            }
        }

    }

    public static ArrayList<Person> parseJson(FileReader fileReader) {
        ArrayList<Person> personArrayList= new ArrayList<>();
        Person person = new Person();
        JsonParser parser = Json.createParser(fileReader);
        while (parser.hasNext()) {
            Event event = parser.next();
            if (event == Event.KEY_NAME) {
                switch (parser.getString()) {
                    case "idPerson":
                        parser.next();
                        person.setIdPerson(parser.getInt());
                        break;
                    case "firstName":
                        parser.next();
                        person.setFirstName(parser.getString());
                        break;
                    case "lastName":
                        parser.next();
                        person.setLastName(parser.getString());
                        break;
                    case "middleName":
                        parser.next();
                        person.setMiddleName(parser.getString());
                        break;
                    case "age":
                        parser.next();
                        person.setAge(parser.getInt());
                        break;
                    case "phoneNumber":
                        parser.next();
                        person.setPhoneNumber(parser.getString());
                        break;
                    case "sex":
                        parser.next();
                        person.setSex(parser.getString());
                        break;
                    case "hobbies":
                        parser.next();
                        person.setHobbies(getStringArray(parser.getArray()));
                        break;
                    case "friend":
                        parser.next();
                        Friend friend = new Friend();
                        parseFriend(new StringReader(parser.getObject().toString()), friend);
                        person.setFriend(friend);
                        break;
                    case "AdditionalInformation":
                        parser.next();
                        if(parser.getValue()!= JsonValue.NULL) {
                            person.setAdditionalInformation(parser.getString());
                        }

                        break;
                }
            }
        }
        personArrayList.add(person);
        return personArrayList;
    }

    private static String[] getStringArray(JsonArray jsonArray) {
        String [] hobbiesArray= new String[jsonArray.size()];
        for (int i=0;i<jsonArray.size();i++){
         hobbiesArray[i]=jsonArray.getString(i);
        }
        return hobbiesArray;
    }

    public static FileReader getFileReader(String filePath) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fileReader;
    }



}


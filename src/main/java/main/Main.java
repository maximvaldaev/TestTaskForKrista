package main;

import model.Person;

import java.util.ArrayList;

public class Main {

    static String filePath = "InputData.json";

    public static void main(String[] args) {
        ArrayList<Person> personArrayList = JSONParsing.parseJson(JSONParsing.getFileReader(filePath));
        System.out.println(personArrayList);
    }

}

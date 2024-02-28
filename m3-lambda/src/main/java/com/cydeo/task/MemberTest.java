package com.cydeo.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        Person p1 = new Person("MIKE",35,Gender.MALE);
        Person p2 = new Person("OZZY",25,Gender.MALE);
        Person p3 = new Person("TOM",15,Gender.MALE);
        Person p4 = new Person("ALLY",45,Gender.FEMALE);

        List<Person> personList = Arrays.asList(p1,p2,p3,p4);

        CheckMember checkMember =  p -> p.getGender()==Gender.MALE && p.getAge() >= 18 && p.getAge() <= 25;
        print(personList, checkMember); //ORRRRRRRR
        System.out.println("***********************************************");

        print(personList,  p -> p.getGender()==Gender.MALE && p.getAge() >= 18 && p.getAge() <= 25);

    }

    private static void print (List<Person> personList, CheckMember checkMember){

        List<Person> result = new ArrayList<>();
        for (Person person : personList){
            if(checkMember.test(person)){
                result.add(person);
            }
        }
        System.out.println(result);


    }


}

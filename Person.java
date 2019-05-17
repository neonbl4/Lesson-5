package ru.geekbrains;

public class Person {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Person(String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public static void main (String[] args){
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "8923123121", 30000, 30);
        persArray[1] = new Person("Ivanov Bolvan", "Engineer", "ivivan2@mailbox.com", "8923123122", 40000, 30);
        persArray[2] = new Person("Ivanov Igor", "Engineer", "ivivan3@mailbox.com", "8923123123", 10000, 70);
        persArray[3] = new Person("Ivanov Taran", "Engineer", "ivivan4@mailbox.com", "8923123124", 50000, 60);
        persArray[4] = new Person("Ivanov Bulvar", "Engineer", "ivivan5@mailbox.com", "8923123125", 60000, 30);


        for (int i = 0; i < 4; i++) {

            if (persArray[i].age > 40) {
                System.out.println(persArray[i].name + ' ' + persArray[i].position + ' ' + persArray[i].email + ' ' + persArray[i].phone + ' ' + persArray[i].salary + ' ' + persArray[i].age);
            }

        }
        }


}

public class Main {
    public static void main(String[] args) {

//        Задание 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

//        Задание 2

        System.out.println(fullName.toUpperCase());

//        Задание 3

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println(fullName);



    }
}
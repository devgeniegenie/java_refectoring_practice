package Review.IntroduceNullObject.before;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person(new Label("David"), new Label("david@gmail.com")),
                new Person(new Label("Lucy"), new Label("lucy@gmail.com")),
                new Person(new Label("maine"))
        };

        for (Person person : people) {
            System.out.println(person.toString());
            person.display();
            System.out.println("");
        }
    }
}

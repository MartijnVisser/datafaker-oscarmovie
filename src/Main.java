import net.datafaker.Faker;

public class Main {
    public static void main(String[] args) {

    Faker faker = new Faker();

    String movie1 = faker.oscarMovie().movieName();
    String movie2 = faker.oscarMovie().movieName();
    String movie3 = faker.oscarMovie().movieName();

    System.out.println(movie1);
    System.out.println(movie2);
    System.out.println(movie3);

    }

}
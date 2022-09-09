package src;

public class hello {
    public static void main(String[] args) {
      Details user = getDetails();
      user.Age();
    }

    public static Details getDetails() {
        return new Name("nidhi",23);

    }
}

import java.util.List;

class BadExample {
    public static void printFirstRedAndBlue(List<Shoe> listOfShoes) {
        for (Shoe shoe : listOfShoes) {
            if (shoe.color.equals("red")) {
                System.out.println("The first red shoe is " + shoe.name);
                break;
            }
        }
        for (Shoe shoe : listOfShoes) {
            if (shoe.color.equals("blue")) {
                System.out.println("The first blue shoe is " + shoe.name);
                break;
            }
        }
    }
}

class Shoe {
    String color;
    String name;
}

import java.util.List;

class BadExample {
    public static void printFirstRed(List<Shoe> listOfShoes) {
        for (Shoe shoe : listOfShoes) {
            if (shoe.color.equals("red")) {
                System.out.println("The first red shoe is " + shoe.name);
                break;
            }
        }
    }
}

class Shoe {
    String color;
    String name;
}

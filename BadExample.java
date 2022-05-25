import java.util.List;

class BadExample {
    private static Shoe firstOfColor(List<Shoe> listOfShoes, String color) {
        for (Shoe shoe : listOfShoes) {
            if (shoe.color.equals(color)) {
                return shoe;
            }
        }
        return null;
    }
    public static void printFirstRedAndBlue(List<Shoe> listOfShoes) {
        System.out.println("First red shoe is " + firstOfColor(listOfShoes, "red").name);
        System.out.println("First blue shoe is " + firstOfColor(listOfShoes, "blue").name);
    }
}

class Shoe {
    String color;
    String name;
}

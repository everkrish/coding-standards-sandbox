import java.util.List;

class BadExample {
    private static @Nullable Shoe firstOfColor(List<Shoe> listOfShoes, String color) {
        for (Shoe shoe : listOfShoes) {
            if (shoe.color.equals(color)) {
                return shoe;
            }
        }
        return null;
    }
    public static void printFirstRed(List<Shoe> listOfShoes) {
        Shoe firstRedShoe = firstOfColor(listOfShoes, "red");
        if (firstRedShoe != null) {
            System.out.println("First red shoe is " + firstRedShoe.name);
        }
    }
}

class Shoe {
    String color;
    String name;
}

import java.util.List;
import java.util.Optional;

class BadExample {
    private static @Nullable Shoe firstOfColor(List<Shoe> listOfShoes, String color) {
        Optional<Shoe> maybeShoe = listOfShoes.stream()
                .filter(shoe -> shoe.color.equals(color))
                .findFirst();
        if (maybeShoe.isEmpty()) {
            return null;
        }
        return maybeShoe.get();
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

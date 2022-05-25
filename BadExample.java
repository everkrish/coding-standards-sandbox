import java.util.List;
import java.util.Optional;

class BadExample {
    private static Optional<Shoe> firstOfColor(List<Shoe> listOfShoes, String color) {
        return listOfShoes.stream()
                .filter(shoe -> shoe.color.equals(color))
                .findFirst();
    }
    public static void printFirstRed(List<Shoe> listOfShoes) {
        Optional<Shoe> firstRedShoe = firstOfColor(listOfShoes, "red");
        if (firstRedShoe.isPresent()) {
            System.out.println("First red shoe is " + firstRedShoe.get().name);
        }
    }
}

class Shoe {
    String color;
    String name;
}

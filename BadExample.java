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
        firstRedShoe.ifPresent(shoe -> System.out.println(String.format("First red shoe is %s", shoe.name)));
    }
}

class Shoe {
    private String color;
    String name;

    /*
     * AVOID!
     * Usually this interface would be used internally by Everlaw, so we can avoid having excess
     * code by making color public.
     */
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

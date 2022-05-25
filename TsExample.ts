interface Shoe {
    color: string,
    name: string
}

function findFirstRed(listOfShoes: unknown[]) {     // Use unknown over any
    const filteredList = listOfShoes.filter(      // Never use `var`. Use `let` or `const instead
        (shoe) => (shoe as Shoe).color === "red"            // The == operator here is not type-safe. Use === instead
    );                                            // Use semicolons; don't depend on automatic semicolon insertion.
    if (filteredList.length > 0) {
        console.log((filteredList[0] as Shoe).name);
    }
}
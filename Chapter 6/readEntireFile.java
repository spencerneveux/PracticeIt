public String readEntireFile(Scanner input) {
    StringBuilder string = new StringBuilder();
    while(input.hasNextLine()) {
        string.append(input.nextLine() + "\n");
    }
    return string.toString();
}

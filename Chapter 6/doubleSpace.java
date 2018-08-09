public void doubleSpace(Scanner input, PrintStream out) {
    while(input.hasNextLine()) {
        String line = input.nextLine();
        out.println(line);
        out.println();
    }
}

public void wordWrap(Scanner input) {
    int lineLimit = 60;
    while(input.hasNextLine()) {
        String line = input.nextLine();
        while (line.length() > lineLimit) {
            System.out.println(line.substring(0, lineLimit));
            line = line.substring(lineLimit);
        }
        System.out.println(line);
    }
}

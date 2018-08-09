public void wordWrap2(Scanner input, PrintStream out) {
    int lineLimit = 60;
    while(input.hasNextLine()) {
        String line = input.nextLine();
        
        while(line.length() > lineLimit) {
            out.println(line.substring(0, lineLimit));
            line = line.substring(lineLimit);
        }
        out.println(line);
    }
}

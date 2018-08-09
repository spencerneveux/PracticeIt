public void flipLines(Scanner input) {
    while(input.hasNextLine()) {
        String firstLine = input.nextLine();
        if (input.hasNextLine()) {
            String secondLine = input.nextLine();
            System.out.println(secondLine);
        }
        System.out.println(firstLine);
    }
}

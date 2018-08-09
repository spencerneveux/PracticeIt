public static void collapseSpaces(Scanner input) {
    while(input.hasNextLine()) {
        String line = input.nextLine();
        Scanner lineSc = new Scanner(line);
       
        while(lineSc.hasNext()) {
            String word = lineSc.next();
            System.out.print(word + " ");
        }
        System.out.println();
    }
}

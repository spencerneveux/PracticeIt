public void coinFlip(Scanner input) {
    while(input.hasNextLine()) {
        String line = input.nextLine();
        
        Scanner lineSc = new Scanner(line);
        int headCount = 0;
        int tailCount = 0;
        int total = 0;
        while(lineSc.hasNext()) {
            total++;
            String coin = lineSc.next().toLowerCase();
            if (coin.equals("h")) {
                headCount++;
            }else {
                tailCount++;
            }
        }
        double percent = (double)(headCount * 100) / total;
        System.out.println(headCount + " heads " + "(" + String.format("%.1f", percent) + "%)");
        if (percent > 50.0) {
            System.out.println("You win!");
        }
            System.out.println();
    }
}

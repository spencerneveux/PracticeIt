public static void plusScores(Scanner input) {
    while(input.hasNextLine()) {
        String name = input.nextLine();
        String marks = input.nextLine();
        int plusCount = 0;
        for (int i = 0; i < marks.length(); i++) {
            if (marks.charAt(i) == '+') {
                plusCount++;
            }
        }
        double percent = (double)(plusCount * 100) / marks.length();
        System.out.println(name + ": " + String.format("%.1f" , percent) + "% plus");
    }
}

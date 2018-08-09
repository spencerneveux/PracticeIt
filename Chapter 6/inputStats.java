public void inputStats(Scanner input) {
    int lineCounter = 0;
    int tokenCounter = 0;
    int wordLength = 0;
    int longestLineCount = 0;
    String longestLine = "";
    while(input.hasNextLine()) {
        lineCounter++;
        String line = input.nextLine();
        
        Scanner words = new Scanner(line);
        while(words.hasNext()) {
            tokenCounter++;
            String word = words.next();
            if (word.length() > wordLength) {
                wordLength = word.length();
            }
        }
        if (tokenCounter >= longestLineCount) {
            longestLineCount = tokenCounter;
            longestLine = line;
        }
        System.out.println("Line " + lineCounter + " has " + tokenCounter + " tokens (longest = " 
                           + wordLength + ")");
        tokenCounter = 0;
        wordLength = 0;
    }
    System.out.print("Longest line: " + longestLine);
}

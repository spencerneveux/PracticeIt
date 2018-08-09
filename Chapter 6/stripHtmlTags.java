public void stripHtmlTags(Scanner input) {
    while(input.hasNextLine()) {
        String line = input.nextLine();
        boolean flag = true;
        
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '<') {
                flag = false;
            }else if (line.charAt(i) == '>') {
                flag = true;
            }else if (flag) {
                System.out.print(line.charAt(i));
            }
        }
        System.out.println();
    }   
}

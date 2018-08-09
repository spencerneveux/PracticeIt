public void boyGirl(Scanner input) {
    int boyCount = 0;
    int girlCount = 0;
    int boySum = 0;
    int girlSum = 0;
    int counter = 0;
    
    while(input.hasNext()) {
        input.next();
        if (counter % 2 == 0) {
            boyCount++;
            boySum += input.nextInt();
        }else {
            girlCount++;
            girlSum += input.nextInt();
        }
        counter++;
    }
    int absDiff = Math.abs(boySum - girlSum);
    System.out.println(boyCount + " boys, " + girlCount + " girls ");
    System.out.println("Difference between boys' and girls' sums: " + absDiff);
}

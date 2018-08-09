public boolean negativeSum(Scanner input) {
    int sum = 0;
    int counter = 0;
    
    while(input.hasNext()) {
        int num = input.nextInt();
        sum += num;
        counter++;
        if (sum < 0) {
            System.out.print(sum + " after " + counter + " steps");
            return true;
        }
    }
    System.out.print("no negative sum");
    return false;
}

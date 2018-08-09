public void evenNumbers(Scanner input) {
    int count = 0;
    int sum = 0;
    int evenCount = 0;
    
    while(input.hasNext()) {
        int num = input.nextInt();
        count++;
        sum += num;
        
        if (num % 2 == 0) {
            evenCount++;
        }
    }
    double evenPercent = (double)(evenCount * 100) / count;
    System.out.println(count + " numbers, sum = " + sum);
    System.out.println(evenCount + " evens (" + String.format("%.2f", evenPercent) + "%)");
}

public void countCoins(Scanner input) {
    int nickelValue = 5;
    int dimeValue = 10;
    int quarterValue = 25;
    int sum = 0;
    
    while(input.hasNext()) {
        int num = input.nextInt();
        String type = input.next().toLowerCase();
        switch(type) {
            case "pennies":
                sum += num;
                break;
            case "nickels":
                sum += num * nickelValue;
                break;
            case "dimes":
                sum += num * dimeValue;
                break;
            case "quarters":
                sum += num * quarterValue;
                break;
        }
    }
        double total = (double)sum / 100;
        System.out.print("Total money: $" + String.format("%.2f", total));
}

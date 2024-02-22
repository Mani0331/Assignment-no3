public class MyClass {
    public static MyClass(String[] args) {
        String currentMonth = "January";
        System.out.println("Month is: " + currentMonth);

        int daysInMonth;

        switch (currentMonth.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                daysInMonth = 31;
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                daysInMonth = 30;
                break;
            case "february":
                daysInMonth = 28; // Assuming it's not a leap year
                break;
            default:
                daysInMonth = -1; // Invalid month
        }

        if (daysInMonth != -1) {
            System.out.println("Number of days in " + currentMonth + " is: " + daysInMonth);
        } else {
            System.out.println("Invalid month: " + currentMonth);
        }
    }
}
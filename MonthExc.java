class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}

class InvalidDayException extends Exception {
    public InvalidDayException(String message) {
        super(message);
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class MonthExc {

    public static void validateDate(int day, int month, int year) throws InvalidDayException, InvalidMonthException {
        boolean leap = (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);

        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid month. Month must be between 1 and 12.");
        }

        int maxDaysInMonth = getMaxDaysInMonth(month, leap);
        if (day < 1 || day > maxDaysInMonth) {
            throw new InvalidDayException("Invalid day. Day must be between 1 and " + maxDaysInMonth + " for month " + month);
        }
    }

    private static int getMaxDaysInMonth(int month, boolean leap) {
        switch (month) {
            case 2:
                return leap ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static void main(String[] args) {
        try {
            if (args.length < 3) {
                throw new InvalidInputException("Insufficient input. Please provide day, month, and year.");
            }

            int day = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            int year = Integer.parseInt(args[2]);

            validateDate(day, month, year);
            System.out.println("Valid input");
        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidDayException | InvalidMonthException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

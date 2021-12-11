package Chapter11.Alone_p362;

class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyDate) {
            MyDate date = (MyDate)obj;
            if(day == date.day && month == date.month && year == date.year) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        MyDate date1 = new MyDate(22, 6, 1999);
        MyDate date2 = new MyDate(22, 6, 1999);
        System.out.println(date1 == date2);
        System.out.println(date1.equals(date2));
    }
}



package Chapter11.Alone_p366;

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
            return (day == date.day && month == date.month && year == date.year);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (year * 10000) + (month * 100) + day;
    }

    public static void main(String[] args) {
        MyDate date1 = new MyDate(22, 6, 1999);
        MyDate date2 = new MyDate(22, 6, 1999);
        System.out.println(date1 == date2);
        System.out.println(date1.equals(date2));

        System.out.println("HashCode of date1 : " + date1.hashCode());
        System.out.println("HashCode of date2 : " + date2.hashCode());
    }
}



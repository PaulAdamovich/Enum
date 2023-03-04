import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SATURDAY);
        today.daysInfo();
        System.out.println(today.weekDay);
        WeekDays w1 = WeekDays.SUNDAY;
        WeekDays w2 = WeekDays.SUNDAY;
        WeekDays w3 = WeekDays.FRIDAY;
        System.out.println(w1==w2);
        System.out.println(w1==w3);
        WeekDays [] array = WeekDays.values();
        System.out.println(Arrays.toString(array));
    }
}

enum WeekDays{
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("bad"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

     String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    }
}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo(){
        switch (weekDay){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to work!");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("You can relaxing");
                break;
        }
        System.out.println("Mood today => " + weekDay.mood);
    }
}
public class DayOfTheYear {

    public static boolean isLeapYear(int year){
        if(year%400==0){
            return true;
        } 
        if(year%100==0){
            return false;
        }
        if(year%4==0){
            return true;
        }
        return false;
    }

    public static int dayOfYear(String date) {
        String[] dateArr = date.split("-");
        int year = Integer.parseInt(dateArr[0]);
        int noOfDays = 0;
        for (int i = 1; i < Integer.parseInt(dateArr[1]); i++) {
            if(i==2 && isLeapYear(year)){
                noOfDays+=29;
            } else if(i==2) {
                noOfDays+=28;
            } else if(i%2==0) {
                if(i==8){
                    noOfDays+=31;
                } else {
                    if(i>8){
                        noOfDays+=31;
                    } else {
                        noOfDays+=30;
                    }
                }
            } else if(i%2!=0) {
                if(i>7){
                    noOfDays+=30;
                } else {
                    noOfDays+=31;
                }
            }
        }
        noOfDays+=Integer.parseInt(dateArr[2]);
        return noOfDays;
    }
    
    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-02-10"));
    }
}

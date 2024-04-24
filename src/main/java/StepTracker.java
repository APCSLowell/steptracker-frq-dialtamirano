import java.util.ArrayList;
public class StepTracker
{
 /* to be implemented here */
 public static int numberOfLeapYears(int y1, int y2){
 int count = 0;
 for(int y = y1; y <= y2; y++){
  if(isLEAPyEAR(y)){
   count++;
  }
 }
  return count;
  }
 public static int dayOfWeek(int month, int day. int year){
  int startDay = firstDayOfYear(year);
   int nthDay = dayOfYear(month,day,year);
   int returnDay = (startDay + nthDay - 1) % 7;
   return returnDay;
 }
} 

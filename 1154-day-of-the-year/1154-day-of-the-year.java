class Solution {
    public int dayOfYear(String date) {
       java.time.LocalDate localdate=java.time.LocalDate.parse(date);
       return localdate.getDayOfYear(); 
    }
}
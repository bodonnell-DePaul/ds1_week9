package sorting.utils;

public class CustomDate {

    public int year;
    public String month;
    public CustomDate(String date)
    {
        if(date.length() > 0)
        {
            String[] split = date.split(",");
            this.year = Integer.parseInt(split[0]);
            try{
            this.month = split[1];
            }
            catch(Exception e){
                e.printStackTrace();
                
                this.month = "-1";
            }
        }

    }

}

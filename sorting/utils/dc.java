package sorting.utils;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Locale;
import sorting.utils.CustomDate;

enum STATUS{
    ALIVE,
    DEAD,
    UNKNOWN
}
public class dc {
    
    public int pageId;
    public String name;
    public String id;
    public String alignment;
    public STATUS alive;
    public int appearances;
    public CustomDate firstAppearance;


    public dc(){

    }
    public dc(String []record){
        //page_id	name	urlslug	ID	ALIGN	EYE	HAIR	SEX	GSM	ALIVE	APPEARANCES	FIRST APPEARANCE	YEAR

        this.pageId = Integer.parseInt(record[0]);
        this.name = record[1];
        this.id = record[3];
        this.alignment = record[4];
        String isAlive = record[9];
        if( isAlive.toLowerCase().contains("living") ){
            this.alive = STATUS.ALIVE;
        }
        else if (isAlive.toLowerCase().contains("deceased")){
            this.alive = STATUS.DEAD;
        }
        else{
            this.alive = STATUS.UNKNOWN;
        }

        try{
        this.appearances = Integer.parseInt(record[10]);
        }
        catch(Exception e){
            e.printStackTrace();
            this.appearances = -1;
        }

        this.firstAppearance = new CustomDate(record[11]);
    }



}

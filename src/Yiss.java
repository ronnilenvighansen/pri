/**
 * Created by Ronni on 05-12-2016.
 */
public class Yiss {
    private String code;
    private int number;
    public Yiss(String code, int number){
        this.code = code;
        setNumber(number);
    }


    private void setNumber(int value){
        if(this.code.equals("1")){
            this.number = value;
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}

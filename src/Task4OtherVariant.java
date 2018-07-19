public class Task4OtherVariant {
    public   String getToyName2(int id){
        String toyName ;

        if(id ==0)
            toyName = "Car";
        else if (id==1)
            toyName = "Lego";
        else if (id ==2)
            toyName = "Doll";
        else if (id ==3)
            toyName = "Puzzle";
        else
            throw new IllegalArgumentException("Incorrect value");

        return toyName;
    }
}

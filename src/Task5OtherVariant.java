public class Task5OtherVariant {
    public  int getToyId2(String name){

        int numb;
        switch(name) {
            case "Car" :
                numb = 0;
                break;
            case "Lego" :
                numb = 1;
                break;
            case "Doll" :
                numb = 2;
                break;
            case "Puzzle" :
                numb = 3;
                break;
            default:
                throw new IllegalArgumentException("Incorrect value");
        }
        return numb;
    }
}

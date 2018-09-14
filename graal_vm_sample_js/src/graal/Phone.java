package graal;

public class Phone {

    private final int number;

    public Phone(int number){

        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String call(String name){

        return "Calling " + name;
    }

}

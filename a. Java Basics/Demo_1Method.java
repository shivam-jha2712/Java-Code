class Computer{
    public void playMusic(){
        System.out.println("Music PLaying..");
    }

    public String getMeAPen(int cost){
        String ans = "No Pen";
        if(cost<10){
            return ans;
        }
        else{
            ans = "Pen";
        }
        return ans;
    }

    // Method Overloading
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public double add(double n1, double n2){
        return n1 + n2 ;
    }
}

public class Demo_1Method {
    public static void main(String[] args) {
        Computer obj = new Computer();

        String str = obj.getMeAPen(15);
        System.out.println(str);
        obj.playMusic();
        // Methods understanding
    }
}

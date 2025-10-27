class Box{
    int x,y,z;
    Box(){
        x=2;
        y=3;
        z=4;
    }
    Box(int a,int b, int c){
        x =a;
        y=b;
        z=c;
    }
    void volume(){
        System.out.println(x*y*z);
    }

}

public class Constructor {
    public static void main(String[] args){
        Box b1 = new Box();
        b1.volume();

        Box b2 = new Box(8,4,2);
        b2.volume();
    }
}

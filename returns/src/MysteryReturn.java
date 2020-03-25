public class MysteryReturn {
    public static void main(String [] args){
    int x =1;
    int y =2;
    int z =3;

    z = mystery (x, z, y); //z=1-1=0; x=2*2+0=4; y=4-1=3; wydruk y z= 4 3, nowe z =4
    System.out.println(x + " " + y + " " +z); //wydruk x y nowe z =1 2 4
    x = mystery (z, z, x); //z=4-1=3; x=2*1+3=5; y=5-1=4; wydruk 4 3, nowe x = 5
    System.out.println(x + " " + y + " " +z); // wydruk nowe x y nowe z = 5 2 4
    y = mystery (y, y, z);//z=2-1=1; x=2*4+1=9; y=9-1=8, wydruk y z = 8 1, nowe y = 9
    System.out.println(x + " " + y + " " +z); //wydruk nowe x nowe y nowe z =5 9 4
    } // z to poprzedni x x to poprzedni y y to poprzedni z
    public  static int mystery(int z, int x, int y) {
        z--;
        x= 2 * y +z;
        y = x - 1;
        System.out.println(y + " " +z);
        return x;
    }
    }


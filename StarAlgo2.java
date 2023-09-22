public class StarAlgo2{
    public static void main(String args[]){
        for(int y = 0; y < 5; y++){
            for(int x = 4; x >=y; x--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
import java.math.*;

/**
 * @author fatih-git
 * */

public class PrimeNum {

    public static void main(String[] args) {

        int sayi=3;
        int mantik;

        System.out.print("2 ");
        while(sayi<=97){

            mantik=1;

            for(int i=2; i<(sayi/2)+1; i++) {

                if(sayi%i==0){
                    mantik=0;
                }

            }

            if(mantik==1){
                System.out.print(sayi+" ");
            }

            sayi++;

        }

    }

}

package arrays;

public class Ex1_OrdemInversa {

    public static void main (String[] args){

        int count = 0;

        int[] vetor = {-5, -6, 15, 58, 8, 4};

        System.out.print("Vetor : ");

        while (count < (vetor.length -1)){

            System.out.print(vetor[count] + "");

            count++;
        }

        for ( int i = (vetor.length - 1) ; i == 0 ; i -- ){

            System.out.print(vetor[i] + "  ");


        }


    }

}

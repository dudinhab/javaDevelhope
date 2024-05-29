public class StartAdvanced {
    public static void main(String[] args) {
        int oddSum = 0;
        int  evenSum =0;
        int myArray[] = new int[]{1,3,1,5,7,2,1,5,9};
        for (int i = 0; i < myArray.length; i++) {
            int single = myArray[i];
            boolean isEven = single%2 == 0;

            //Caso o single for maior que 9, ele vai continuar a contagem do ciclo
            if(single>9){
                continue;
            }

            if (isEven){
                System.out.println(single+" is even!");
                evenSum += single;
            }else{
                System.out.println(single+" is odd");
                oddSum += single;
            }

            //Sai do ciclo for, e nao termina nem ao menos a contagem do ciclo for
            if(oddSum > 15){
                break;
            }
        }
        System.out.println("The odd number sum is: "+ oddSum);
        System.out.println("The even number sum is: "+ evenSum);
    }
}

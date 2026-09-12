package function;



public class Function {

    public boolean isEven(int [] numbers) {

        for (int count = 0; count < numbers.length; count++){
           if(numbers[count] % 2 == 0){
               return true;
           }

        }
        return  false;
    }

    public boolean oddNumbers(int[] numbers) {
        for(int count = 0; count < numbers.length; count++){
            if(numbers[count] % 3 == 0){
                return true;
            }
        }
        return false;
    }
}

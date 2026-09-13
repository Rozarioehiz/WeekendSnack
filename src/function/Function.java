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
    public boolean itPalindrome(int[] numbers) {
        String targetNumber = "";
        String indexNumber = "";
        for (int count = 0; count < numbers.length; count++) {
            targetNumber += numbers[count];
        }
        for (int index = numbers.length - 1; index >= 0; index--) {
            indexNumber += numbers[index];
        }
        if (targetNumber.equals(indexNumber)) {
            return true;
        } else {
            return false;
        }
    }
}

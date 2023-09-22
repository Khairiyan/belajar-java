public class App {
    public static void main(String[] args) throws Exception {
        String s = "asdasdasdasd riyan hoo3212 gggg";

        int hasilCount = countValidWord(s);
        System.out.println("Hasil perhitungan kata valid : " + hasilCount);
    }

    public static int countValidWord(String parameterInput){
        String[] parameterArray = parameterInput.split(" ");
        int countValid = 0;

        for (String tempArrayParam : parameterArray) {
            boolean check = isValidWord(tempArrayParam);
            if(check == true){
                countValid++;
            }
        }
        return countValid;
    }

    public static boolean isValidWord(String parameter){
        System.out.println("parameter : " + parameter);
        int letterCount = 0;
        int digitCount = 0;
        String[] parameterArray = parameter.split("");
        if(parameter.matches(".*[!@#$%^&*].*")){
            return false;
        }

        for (String array : parameterArray) {
            for(char charArray : array.toCharArray()) {
                if(Character.isLetter(charArray)){
                    letterCount++;
                } else if(Character.isDigit(charArray)){
                    digitCount++;
                }
            }
        }

        if(letterCount >= 3 && digitCount > 0){
            return true;
        } else if(letterCount >= 3 ){
            return true;
        } else if(letterCount == 0){
            return false;
        } else {
            return false;
        }

    }
}

public class Main {
    public static void main(String[] args){
        int [] array = {2,3,4,5};
        int resultat = 0;
        for (int i = 0; i<array.length; i++){
            resultat = array[0]*array[1]*array[2]*array[3];
        }
        System.out.println(resultat);
    }
}

public class Soal5 {
    public static void main(String[] args) {
        Data(99,20,5);
    }

    public static void Data(int base, int start, int loop){
        for(int i = start; i <= start + loop - 1; i++){
            int result = base * i;
            System.out.println(base + "x" + i +"="+result);
        }
    }
}
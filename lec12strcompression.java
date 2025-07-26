public class lec12strcompression {
    public static void compression(String y){
        StringBuilder sb=new StringBuilder("");
        int total=0;
        for(int i=0;i<y.length();i++){
            Integer count=1;//1 se syart kiye bc waise comparision best tha 
            while(i<y.length()-1 && y.charAt(i)==y.charAt(i+1)){//i< wala part because last wale ko compare karne ke liye nothing is there
                count++;
                i++;
            }
            sb.append(y.charAt(total));
            sb.append(count);
            total+=count;
        }
        System.out.println(sb);
    }
    public static void main(String args[]){
        String y="aaabbcdd";
        compression(y);
    }
}

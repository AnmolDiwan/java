public class lec12quesuppercase {
    public static void upper(String y){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(y.charAt(0));
        sb.append(ch);
        for(int i=1;i<y.length();i++){
            if(y.charAt(i)==' ' && i<y.length()-1){
                sb.append(y.charAt(i));
                i++;
                sb.append(Character.toUpperCase(y.charAt(i)));
            }
            else{
                sb.append(y.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static void main(String args[]){
        String y="my, name is anmol diwan and i have a big dihh";
        upper(y);
    }
}

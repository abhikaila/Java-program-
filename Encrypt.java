public class Encrypt{
public static void main(String args[]){
String pt="This string",ct=" ",p=" ";
int t[]={1,2,3,4};
//int x=Integer.praseint(args[1]);


for(int i=0;i<(pt.length());i++){
ct=ct+(char)(pt.charAt(i)+t[i%4]);

}


System.out.println(ct);



}
}

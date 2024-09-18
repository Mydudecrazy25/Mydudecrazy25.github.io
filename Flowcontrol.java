//Tristan
//Lists 100 numbers even or odd, and adds together
//Mr. Gross Software Development Class
public class Flowcontrol {
    public static void main(String[] args) {
        int total=0;
        for(int x=1;x<101;x++) {
            total=total+x;
            if(x%2==1){//Modulus (remainder) reminds us which is even/odd
             System.out.println(x+" is odd");
            }else{
             System.out.println(x+" is even");
             }
        }
    System.out.println("the sum of all numbers added together is "+total);
    }
}

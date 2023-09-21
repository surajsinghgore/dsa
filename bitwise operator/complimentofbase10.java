public class complimentofbase10 {
    public static void main(String[] args) {
        int num=10;
       int temp=num;
        int mask=0;

while (temp!=0) {
    
mask=(mask<<1)|1;
    temp=temp>>1;
}

int ans=(~num)&mask;
System.out.println(ans);
    }
}

package JustPrograms;

public class Swap2NumberUsing3rdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=1,b=3,c;
        /*c=a;
        a=b;
        b=c;
        System.out.println("a and b:"+a+b);*/
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a and b:"+a+b);
	}

}

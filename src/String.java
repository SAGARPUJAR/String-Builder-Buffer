import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Strings are reference variable
//Strings are immutable
//String pool
public class String {
    public static void main(java.lang.String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Enter Your Name : ");
        java.lang.String name = bufferedReader.readLine();
        System.out.println("String : "+name);

        //String Builder : is a helper Class
        StringBuilder stringBuilder=new StringBuilder(name);
        stringBuilder.append(", Welcome to Christ");
        System.out.println("String Builder : "+stringBuilder);

        //String Buffer
        StringBuffer stringBuffer=new StringBuffer(name);
        stringBuffer.append(" hellow...");
        System.out.println("String Buffer : "+ stringBuffer);
    }
}
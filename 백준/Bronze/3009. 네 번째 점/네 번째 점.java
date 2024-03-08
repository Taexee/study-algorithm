import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token;

        int x_axis[] = new int[3];
        int y_axis[] = new int[3]; 
        
        for(int i = 0; i < 3; i++) { 
            token = new StringTokenizer(br.readLine());
            x_axis[i] = Integer.parseInt(token.nextToken());
            y_axis[i] = Integer.parseInt(token.nextToken());
        } 

        int x = 0; 
        int y = 0;

        if(x_axis[0] == x_axis[1]){
            x = x_axis[2];
        }else{ 
            x = (x_axis[0] == x_axis[2]) ? (x_axis[1]) : (x_axis[0]);
        }
        
        if(y_axis[0] == y_axis[1]){
            y = y_axis[2];
        }else{
            y = (y_axis[0] == y_axis[2]) ? (y_axis[1]) : (y_axis[0]);
        }

        bw.write(x + " " + y);
        bw.flush();
        bw.close();
    }
}
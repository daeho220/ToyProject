package test;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if(currentChar == 'c' || currentChar == 's' || currentChar == 'z'){
                if(i < word.length()-1 && (word.charAt(i+1) == '=' || word.charAt(i+1) == '-')){
                    i++;
                }
            } else if (currentChar == 'd') {
                if(i < word.length() - 2 && word.charAt(i + 1) == 'z' && word.charAt(i + 2) == '='){
                    i += 2;
                } else if (i < word.length() - 1 && word.charAt(i + 1) == '-') {
                    i++;
                }
            } else if (currentChar == 'l') {
                if (i < word.length() - 1 && word.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if (currentChar == 'n') {
                if (i < word.length() - 1 && word.charAt(i + 1) == 'j') {
                    i++;
                }
            }
            count++;
        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
        br.close();
    }
}

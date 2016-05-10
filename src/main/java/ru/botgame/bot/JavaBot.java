package ru.botgame.bot;

import java.io.*;

/**
 * Created on 10.05.2016.
 */
public class JavaBot {

    public static void main(String[] args) {
        System.out.println("Bot started.");
        while (true) {
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                 BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {
                String input;
                while ((input = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(input);
                    bufferedWriter.newLine();
                }
                break;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

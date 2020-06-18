package userio;

import java.util.Scanner;

public class UserIOImpl implements UserIO {

    Scanner in = new Scanner(System.in);
    int userinput;
    @Override
    public void print(String message) {
        System.out.println("welcome");
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return in.nextLine();
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        do{
            try{
                return userinput = Integer.parseInt(in.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input");
            }
        }while(true);
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        System.out.println(prompt);
        do {
            try{
                userinput = Integer.parseInt(in.nextLine());
                if(min < userinput && max > userinput) {
                    break;
                }
            }catch (NumberFormatException){
                System.out.println("Invalid input");
            }
        }while(true)
        return userinput;
    }

    @Override
    public double readDouble(String prompt) {
        return 0;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        return 0;
    }

    @Override
    public float readFloat(String prompt) {
        return 0;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        return 0;
    }

    @Override
    public long readLong(String prompt) {
        return 0;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        return 0;
    }
}

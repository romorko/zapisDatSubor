package map.vystup.subor;

import java.io.*;

public class Main
{

    public static void main(String[] args)
    {
        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter(new FileWriter("data.out"));
            writer.write("Toto je text ktory chcem zapisat");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Nepodarilo sa vytvorit subor!");
        }
        catch (IOException e)
        {
            System.out.println("Nepodarilo sa zapisat do suboru!");
        }
        finally
        {
            try
            {
                writer.close();
            }
            catch (IOException e)
            {
                System.out.println("Nepodarilo sa zatvorit subor!");
            }

        }

        //bez barfa, len na male mnozstvo dat
        FileWriter fileWriter = null;
        try
        {
            fileWriter = new FileWriter("data1.out");
            fileWriter.write("Toto je text ktory chcem zapisat");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Nepodarilo sa vytvorit subor!");
        }
        catch (IOException e)
        {
            System.out.println("Nepodarilo sa zapisat do suboru!");
        }
        finally
        {
            try
            {
                fileWriter.close();
            }
            catch (IOException e)
            {
                System.out.println("Nepodarilo sa zatvorit subor!");
            }
        }

        //umožňuje využívať formátovaný zápis rovnako ako na konzolu
        try
        {
            FileWriter fileWrite = new FileWriter("data2.out");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print("Toto je text ktory chcem zapisat");
            printWriter.printf("Blog name is %s", "howtodoinjava.com");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        printWriter.close();

    }
}

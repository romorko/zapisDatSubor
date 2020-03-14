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
                if (writer != null)
                {
                    writer.close();
                }
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
                if (fileWriter != null)
                {
                    fileWriter.close();
                }
            }
            catch (IOException e)
            {
                System.out.println("Nepodarilo sa zatvorit subor!");
            }
        }

        //umožňuje využívať formátovaný zápis rovnako ako na konzolu

        PrintWriter printWrite=null;
        try
        {
            FileWriter fileWrite = new FileWriter("data2.out");
            printWrite = new PrintWriter(fileWrite);
            printWrite.print("Toto je text ktory chcem zapisat");
            printWrite.printf("Blog name is %s", "howtodoinjava.com");
        }
        catch (IOException e)
        {
            System.out.println("Nepodarilo sa vytvorit subor!");
        }
        finally
        {
            if (printWrite != null)
            {
                printWrite.close();
            }
        }

    }
}

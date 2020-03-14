package map.vystup.subor;

import java.io.*;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        //inicializácia generátora čísel
        Random rand = new Random();
        //Bafrovaný zápis je treba použiť, ak je množstvo dát veľké, resp. podstatná je rýchlosť zápisu
        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter(new FileWriter("data.out"));
            for(int i = 0; i<1000; ++i)
            {
                //writer zapisuje do súboru reťazce, preto musíme generované číslo previesť na reťazec (pričítaním medzery). Inak sa zapíšu do súboru haky-baky. Skúste... :-)
                writer.write((rand.nextInt(100))+" ");
            }
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
                //súbor môžeme uzavrieť len vtedy, ak sa ho podarilo otvoriť
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

        //tento zápis je bez barfa, preto sa hodí len na malé množstvo dát
        FileWriter fileWriter = null;
        try
        {
            fileWriter = new FileWriter("data1.out");
            //fileWriter.write("Toto je text ktory chcem zapisat");
            for(int i = 0; i<1000; ++i)
            {
                fileWriter.write((rand.nextInt(1000))+" ");
            }
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

        //Využijeme vtedy, ak potrebujeme využívať formátovaný zápis pomocou printf rovnako ako na konzolu

        PrintWriter printWrite=null;
        try
        {
            FileWriter fileWrite = new FileWriter("data2.out");
            printWrite = new PrintWriter(fileWrite);
            int i;
            for(i=0;i<1000;++i)
            {
                printWrite.printf("%d ",rand.nextInt(1000));
            }
            //printWrite.printf("%s","Toto je text ktory chcem zapisat");
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

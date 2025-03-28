package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello, Vsevolod" );
        Tester test = new Tester("Паркес","Варкез","f4","B2",12000);
        test.info(5);
        test.info(7,2);
        test.info(9,5,13);

        Tester.pupa();
    }

}

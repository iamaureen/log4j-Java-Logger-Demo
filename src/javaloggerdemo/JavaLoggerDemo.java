/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloggerdemo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.log4j.Logger;

/**
 *
 * @author Ishrat
 */
public class JavaLoggerDemo {

    /**
     * @param args the command line arguments
     */
    //initializing the logger
    static Logger log = Logger.getLogger(JavaLoggerDemo.class);
    
    public static void main(String[] args) throws IOException {
      
        //logging in different levels
        logDemo();
        //demo of logging exception
        logException();
        //demo of logging exception in case of file read
        logFileError();
        logSQLError();
        
    }
    
    private static void logDemo(){
        log.trace("This is a Trace");
        log.debug("This is a Debug");
        log.info("This is an Info");
        log.warn("This is a Warn");
        log.error("This is an Error");
        log.fatal("This is a Fatal");
        
        //priorities
        //if in the priorities debug is set, debug log will be shown first
        //log4j.rootLogger=DEBUG, stdout, file
        //if in the priorities ERROR is set, only error, fatal log will be shown
        //log4j.rootLogger=ERROR, stdout, file
        
    }
    
    private static void logException(){
        try{
            int i = 10 /0;
        }catch(ArithmeticException ex){
            log.error("Error", ex);
        }
    }

    private static void logFileError() throws FileNotFoundException, IOException {
        
        try{
            FileInputStream fstream = new FileInputStream("input1.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while((strLine=br.readLine())!=null){
                System.out.println(strLine);
            }
            in.close();
        }catch(FileNotFoundException ex){
            log.error("File Not Found", ex);
        }catch(IOException ex){
            log.error("IOException occured", ex);
        }
        
    }

    private static void logSQLError() {
         log.debug("Debug");
         log.info("Info");
    }

     
}

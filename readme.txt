instructions:
-------------
1) download jar file from here:
https://logging.apache.org/log4j/1.2/download.html (zip)

2) unzip it, and add the jar file manually in the project library (netbeans)

3) create a file called log4j.properties, it contains some properties regarding
logging i.e. where should the log file be put, formats etc

sample reference links: 
https://malalanayake.wordpress.com/2012/09/11/log4j-with-netbeans-ide/
http://www.mkyong.com/logging/log4j-log4j-properties-examples/

4) put this log4j.properties file inside the source package (from netbeans), 
screenshot attached

5) if you want to change the location of the logfile text, go to log4j.properties and find
"log4j.appender.file.File" and change it to your desired location. for example:

a) specific drive: log4j.appender.file.File = C:\\log4j-application.log

b) specific folder (inside the application): 
log4j.appender.file.File = folder_name/file_name  
log4j.appender.file.File = log_folder/debug.log

c) inside the application(no folder)
log4j.appender.file.File = debug.log
[it will create the file inside the application folder itself]

6) set priorities of the logging events:
If priority is defined in log4j.properties, only the same or above priority message will be logged.
https://www.mkyong.com/logging/log4j-hello-world-example/

7) log files can be formatted as needed:
change in the properties file
http://www.tutorialspoint.com/log4j/log4j_log_formatting.htm

8) if you want to store the logged events into the database, check this
http://www.tutorialspoint.com/log4j/log4j_logging_database.htm
process:
--------
a)add mysql-connector jar file in the project properties
b)open mysql workbench, create schema 'log4jdemo' and create table 'logs' (check link)
c)edit properties file, add necessary info to access DB




some related links:
http://www.programming-free.com/2012/07/implement-logging-with-log4j-in-java.html
http://veerasundar.com/blog/2009/07/log4j-tutorial-how-to-send-the-log-messages-to-a-file/
http://www.codejava.net/coding/how-to-configure-log4j-as-logging-mechanism-in-java?showall=&start=2#BasicConfiguration

create different log files for different classes:
http://veerasundar.com/blog/2009/08/log4j-tutorial-how-to-send-log-messages-to-different-log-files/
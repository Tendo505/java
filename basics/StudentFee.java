/**
 * @(#)StudentFee.java
 *
 *
 * @author
 * @version 1.00 2026/5/13
 */
//import package
import java.io.*;
public class StudentFee {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/dozle/OneDrive/Documents/java/StudentFeeData.txt");

        if(file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }
        //create file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        //create 30 data
        output.println("DCS241012 Amirul Harith Engineering 500 12 6000");
        output.println("DBA101110 Siti Nurhaliza Business 300 10 3000");
        output.println("DIT231012 Muhammad Sharaff IT 400 14 5600");
        output.println("DEM251127 Nurul Aini Engineering 650 11 7150");
        output.println("DBA101111 Raju Kumar Business 450 9 4050");
        output.println("DIT231013 Aqil Qawiem IT 350 15 5250");
        output.println("DEM251128 Ain Hassan Engineering 750 10 7500");
        output.println("DBA101112 Muhammad Iris Business 250 12 3000");
        output.println("DIT231014 Mohamed Ariffin IT 600 13 7800");
        output.println("DEM251129 Hasan Ali Engineering 400 16 6400");
        output.println("DBA101113 Ali Abidin Business 550 8 4400");
        output.println("DIT231015 Airil Akmal IT 500 12 6000");
        output.println("DEM251130 Amira Hassan Engineering 800 9 7200");
        output.println("DBA101114 Ravi Kumar Business 200 11 2200");
        output.println("DIT231016 Alysha Sofia IT 700 14 9800");
        output.println("DEM251131 Aziz Hassan Engineering 300 17 5100");
        output.println("DBA101115 Dharshan Kumar Business 600 7 4200");
        output.println("DIT231017 Danish Hakimi IT 250 16 4000");
        output.println("DEM251132 Fatimah Hassan Engineering 550 13 7150");
        output.println("DBA101116 Kumar Ravi Business 400 10 4000");
        output.println("DIT231018 Amirul Hakim IT 650 11 7150");
        output.println("DEM251133 Aqeel Haikal Engineering 700 12 8400");
        output.println("DBA101117 Muhammad Hafizul Business 300 14 4200");
        output.println("DIT231019 Marcus Rashford IT 300 15 4500");
        output.println("DEM251134 Lewis Hamilton Engineering 450 14 6300");
        output.println("DBA101118 Leonardo Decaprio Business 500 9 4500");
        output.println("DIT231020 Karim Benzema IT 550 13 7150");
        output.println("DEM251135 Cristiano Ronaldo Engineering 600 11 6600");
        output.println("DBA101119 Lionel Messi Business 350 12 4200");
        output.println("DIT231021 Bruno Mars IT 400 17 6800");
        //close file
        output.close();
    }
}
package com.pluralsight;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderFileManager {

    public void saveReceipt(Order order) {
        //Creating File Name
        String fileName = getReceiptFileName();

        //We determine the file path
        File receptsFolder = new File("receipts");

        if(!receptsFolder.exists()) {
            receptsFolder.mkdirs(); // It will create receipts folder

            //Create the file object
            File receiptFile = new File(receptsFolder, fileName);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(receiptFile))) {
                //write order's information

                writer.write("Thank you for your order!\n\n");
                writer.write("Order Details:\n");
                writer.write(order.toString());  // Write details of order
                writer.write("\nTotal Price: $" + order.calculateTotalPrice() + "\n");
            } catch (IOException e) {
                System.out.println("An error occurred while saving the receipt.");
                e.printStackTrace();
            }
        }
    }
}

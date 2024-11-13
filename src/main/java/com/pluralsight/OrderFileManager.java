package com.pluralsight;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderFileManager {


    public void saveReceipt(Order order) {

        String fileName = getReceiptFileName();


        File receiptsFolder = new File("receipts");
        if (!receiptsFolder.exists()) {
            receiptsFolder.mkdirs();
        }

        File receiptFile = new File(receiptsFolder, fileName);


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(receiptFile))) {

            writer.write("Thank you for your order!\n\n");
            writer.write("Order Details:\n");
            writer.write(order.toString());
            writer.write("\nTotal Price: $" + order.calculateTotalPrice() + "\n");


            System.out.println("Receipt saved as " + receiptFile.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("An error occurred while saving the receipt.");
            e.printStackTrace();
        }
    }


    private String getReceiptFileName() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
        String dateString = sdf.format(new Date());
        return dateString + ".txt";
    }
}

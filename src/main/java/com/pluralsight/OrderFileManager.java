package com.pluralsight;

import java.io.File;

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
        }
    }
}

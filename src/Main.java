import entity.ProductEntity;
import entity.TransactionEntity;
import implement.GeneralImplement;
import implement.TransactionImplement;
import interfaces.GeneralInterface;
import interfaces.TransactionInterface;

import javax.swing.*;

public class Main {

    //psvm
    public static void main(String[] args) {
        //input data produk
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductName("Mie Ayam");
        productEntity.setPrice(10000);
        productEntity.setTax(1000);

        // input transaksi
        TransactionEntity transactionEntity = new TransactionEntity();
        transactionEntity.setProduct(productEntity);
        transactionEntity.setQty(2);
        transactionEntity.setCustomerName("Budiman");

        //save transaction
        TransactionInterface transaction = new TransactionImplement();
        transaction.insert(transactionEntity);


        GeneralInterface gi = new GeneralImplement();
        gi.insert(transaction);


        //get data transaksi
//        for(TransactionEntity trx: transaction.get()){
//            System.out.println("Product " + trx.getProduct().getProductName());
//        }
    }
}

package implement;

import entity.TransactionEntity;
import interfaces.GeneralInterface;

import java.util.ArrayList;
import java.util.List;

public class GeneralImplement implements GeneralInterface {

    private List<TransactionEntity> transactionList = new ArrayList<>();

    @Override
    public void insert(Object obj) {
        if(obj instanceof TransactionEntity){
            transactionList.add(((TransactionEntity)obj));
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void get() {

    }
}

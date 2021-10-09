package models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Item {

    private String type;

    protected final Logger log;

    public Item(String type){
        this.type = type;
        this.log = LogManager.getLogger(this.getClass().getName());
    }

    public Item(){
        this.log = LogManager.getLogger(this.getClass().getName());
    }

    public String getType() {
        return type;
    }

    public Item setType(String type) {
        this.type = type;
        return this;
    }
}

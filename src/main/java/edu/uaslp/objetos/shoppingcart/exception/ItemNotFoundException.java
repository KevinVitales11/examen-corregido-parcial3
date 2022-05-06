package edu.uaslp.objetos.shoppingcart.exception;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(){
        super("ItemNotFoundException");
    }
}
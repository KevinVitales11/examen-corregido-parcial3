package edu.uaslp.objetos.shoppingcart.exception;

public class EmptyShoppingCartException extends RuntimeException{
    public EmptyShoppingCartException(){
        super("EmptyShoppingCartException");
    }
}
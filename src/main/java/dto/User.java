package main.java.dto;

import java.util.List;

public class User extends UserDetails{
    private String name;
    private List<Phone> phones;
    private List<Email> emails;
    private CreditCard creditCard;
    private Order order;
}

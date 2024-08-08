package main.java.dto;

import java.util.List;

public class User extends UserDetails{
    private String name;
    private String email;
    private List<Phone> phones;
    private CreditCard creditCard;
}

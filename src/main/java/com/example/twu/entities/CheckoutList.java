package com.example.twu.entities;

import java.util.List;

public class CheckoutList {
    private List<Checkout> checkoutList;

    public List<Checkout> getCheckoutList() {
        return checkoutList;
    }

    public void addCheckoutList(Checkout list) {
        checkoutList.add(list);
    }
}

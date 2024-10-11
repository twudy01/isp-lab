package isp.lab5.exercise1;

import java.time.LocalDateTime;

public class Order {
    private String orderID;
    private LocalDateTime date;
    private Double totalPrice;
    public Order(String orderID,Double totalPrice){
        this.orderID = orderID;
        this.totalPrice = totalPrice;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderID() {
        return orderID;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

}

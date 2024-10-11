/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise1.services;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

/**
 * Uses Lombok to get rid of boilerplate code.
 *
 * @author mihai.hulea
 * @author radu.miron
 */
@Data // it creates getters, setters, equals(), hashCode() and toString() (at compile time)
@AllArgsConstructor // it creates the constructor with arguments for all the attributes (at compile time)
public class UserPortfolio {
    private BigDecimal cash;

    private Map<String, Integer> shares; // a map of number of shares by stock symbol

    public <K, V> UserPortfolio(BigDecimal bigDecimal, TreeMap<K, V> kvTreeMap) {

    }
    public void buy (String symbol,int quantity,BigDecimal value)
    {
        System.out.println("User is buying: "+symbol+" "+quantity+" "+value.toPlainString());
        this.shares.put(symbol,quantity);
    }
}

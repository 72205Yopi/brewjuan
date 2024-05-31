/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package brewjuan;

import java.sql.Date;

/**
 *
 * @author USER
 */
public class inventoryData {
    private int id;
    private String productId;
    private String productName;
    private int stock;
    private double price;
    private String status;
    private Date date;
    
    public inventoryData(int id, String productId, String productName, 
            int stock, double price, String status, Date date){
        this.id = id;
        this.productId = productId;
        this.productName = productName;
        this.stock = stock;
        this.price = price;
        this.status = status;
        this.date = date;
    }
    
    public int getId(){
        return id;
    }
    public String getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public int getStock(){
        return stock;
    }
    public Double getPrice(){
        return price;
    }
    public String getStatus(){
        return status;
    }
    public Date getDate(){
        return date;
    }
}

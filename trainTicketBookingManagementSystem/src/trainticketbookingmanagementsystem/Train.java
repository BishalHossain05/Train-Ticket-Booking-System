/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketbookingmanagementsystem;

import java.sql.Date;

/**
 *
 * @author MarcoMan
 * PLEASE SUBSCRIBE OUR CHANNEL FOR SUPPORT AND HIT THE LIKE BUTTON THANKS : ) 
 */
public class Train {
    
    private Integer busId;
    private String location;
    private String status;
    private Double price;
    private Date date;
    
    public Train(Integer busId, String location, String status, Double price, Date date){
        this.busId = busId;
        this.location = location;
        this.status = status;
        this.price = price;
        this.date = date;
    }
    
    public Integer getBusId(){
        return busId;
    }
    public String getLocation(){
        return location;
    }
    public String getStatus(){
        return status;
    }
    public Double getPrice(){
        return price;
    }
    public Date getDate(){
        return date;
    }
}

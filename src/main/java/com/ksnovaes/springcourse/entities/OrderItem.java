package com.ksnovaes.springcourse.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ksnovaes.springcourse.entities.pk.OrderItemPK;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();
    private Integer quantiy;
    private Double price;

    public OrderItem() {}

    public OrderItem(Order order, Product product, Integer quantiy, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantiy = quantiy;
        this.price = price;
    }
    @JsonIgnore
    public Order getOrder() {
        return id.getOrder();
    }

    public void setOrder(Order order) {
        id.setOrder(order);
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public void setProduct(Product product) {
        id.setProduct(product);
    }

    public Integer getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(Integer quantiy) {
        this.quantiy = quantiy;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

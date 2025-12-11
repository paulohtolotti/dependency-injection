package com.ph.desafio1.services;

import com.ph.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        double discount = 1 - order.getDiscount() / 100;
        return order.getBasic() * discount + this.shippingService.shipment(order);
    }
}

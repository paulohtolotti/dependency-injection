package com.ph.desafio1.services;

import com.ph.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    /**
     * Método que calcula o custo do frete de um pedido seguindo as regras:
     * a) Frete R$ 20.00 se valor base do pedido for menor que 100;
     * b) Frete R$ 12.00 se o valor base do pedido estiver entre 100 e 200 (exclusivo);
     * c) Frete grátis para compras acima de $200.00
     * @param order objeto representando a Order
     * @return Valor total do frete.
     */

    public double shipment(Order order) {
        if(order.getBasic() < 100) return 20.00;

        if(order.getBasic() < 200) return 12.00;

        return 0.00;
    }
}

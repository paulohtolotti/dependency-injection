package com.ph.desafio1;

import com.ph.desafio1.entities.Order;
import com.ph.desafio1.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

    private OrderService orderService;

    public Desafio1Application(OrderService orderService) {
        this.orderService = orderService;
    }
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Order Id: ");
            int id = sc.nextInt();
            System.out.print("Full Product value: ");
            double basic = sc.nextDouble();
            System.out.print("Discount value (in %): ");
            double discount = sc.nextDouble();

            Order order = new Order(id, basic, discount);
            System.out.println("==============================");
            System.out.println("Order Id: " + order.getCode());
            System.out.printf("Total value: R$%.2f", this.orderService.total(order));

        } catch(RuntimeException err) {
            System.out.println(err.getMessage());

        } finally {
            sc.close();
        }

    }
}

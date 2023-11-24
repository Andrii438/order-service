package com.polarbookshop.orderservice.domain.repository;

import com.polarbookshop.orderservice.domain.entity.Order;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface OrderRepository extends ReactiveCrudRepository<Order, Long> {
}

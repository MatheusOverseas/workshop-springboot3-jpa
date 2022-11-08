package com.projectsjava.course.repositories;

import com.projectsjava.course.entities.OrderItem;
import com.projectsjava.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

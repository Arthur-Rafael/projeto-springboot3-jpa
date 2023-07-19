package arthur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import arthur.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
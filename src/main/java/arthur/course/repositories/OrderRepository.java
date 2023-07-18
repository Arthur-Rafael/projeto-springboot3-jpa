package arthur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import arthur.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
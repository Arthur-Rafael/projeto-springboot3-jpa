package arthur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import arthur.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
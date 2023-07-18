package arthur.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import arthur.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
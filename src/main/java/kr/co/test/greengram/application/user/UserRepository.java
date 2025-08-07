package kr.co.test.greengram.application.user;

import kr.co.test.greengram.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUid(String uid);
}
package pl.studia.przetwarzanie.rozproszone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.studia.przetwarzanie.rozproszone.dto.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}

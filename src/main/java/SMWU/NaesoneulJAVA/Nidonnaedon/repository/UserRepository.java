package SMWU.NaesoneulJAVA.Nidonnaedon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import SMWU.NaesoneulJAVA.Nidonnaedon.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByKakaoId(String kakaoId);
}

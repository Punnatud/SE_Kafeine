package ku.cs.Kafeine.repository;

import ku.cs.Kafeine.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MemberRepository extends JpaRepository<Member, UUID> {
    //select * from member where username = 'username'
   Member findByUsername(String username);
}

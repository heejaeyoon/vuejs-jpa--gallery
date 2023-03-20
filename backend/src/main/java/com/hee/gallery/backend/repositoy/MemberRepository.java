package com.hee.gallery.backend.repositoy;

import com.hee.gallery.backend.entity.Item;
import com.hee.gallery.backend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Member findByEmailAndPassword(String email, String password);
}

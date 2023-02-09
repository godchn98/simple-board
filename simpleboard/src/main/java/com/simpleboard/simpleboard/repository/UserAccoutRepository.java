package com.simpleboard.simpleboard.repository;

import com.simpleboard.simpleboard.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccoutRepository extends JpaRepository<UserAccount, String> {
}

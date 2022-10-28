package com.wallet.virtualwallet.repository;

import com.wallet.virtualwallet.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

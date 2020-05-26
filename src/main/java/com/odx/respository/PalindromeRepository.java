package com.odx.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odx.model.PalindromeModel;
@Repository
public interface PalindromeRepository extends JpaRepository<PalindromeModel, Long> {

}

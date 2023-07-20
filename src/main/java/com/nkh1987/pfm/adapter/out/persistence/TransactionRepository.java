package com.nkh1987.pfm.adapter.out.persistence;

import com.nkh1987.pfm.adapter.out.persistence.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
}

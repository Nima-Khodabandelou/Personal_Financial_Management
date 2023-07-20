package com.nkh1987.pfm.core.domain.model.account;

import com.nkh1987.pfm.adapter.out.persistence.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
}

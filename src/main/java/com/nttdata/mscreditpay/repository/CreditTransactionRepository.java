package com.nttdata.mscreditpay.repository;

import com.nttdata.mscreditpay.entity.CreditTransaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CreditTransactionRepository extends ReactiveMongoRepository<CreditTransaction, String> {

    Flux<CreditTransaction> findByCreditId(String id);

}

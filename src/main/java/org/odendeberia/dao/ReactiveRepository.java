package org.odendeberia.dao;

import org.odendeberia.domain.Entity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Set;

public interface ReactiveRepository<ID, K extends Entity<ID>> {

    Flux<K> findAll();
    Flux<K> findAllById(Set<? extends ID> id);
    Mono<K> findById(ID id);
    Mono<K> save(K k);
    Mono<Void> delete(ID id);
    Mono<Void> delete(K k);
    Mono<K> update(ID id, K k);
    Mono<Void> deleteAll();
}

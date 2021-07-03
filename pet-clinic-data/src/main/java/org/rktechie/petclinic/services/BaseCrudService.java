package org.rktechie.petclinic.services;

import java.util.Set;

public interface BaseCrudService<T, ID> {
    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);

}

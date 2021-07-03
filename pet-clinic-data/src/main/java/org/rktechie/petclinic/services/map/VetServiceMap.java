package org.rktechie.petclinic.services.map;

import org.rktechie.petclinic.model.Vet;
import org.rktechie.petclinic.services.BaseCrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements BaseCrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
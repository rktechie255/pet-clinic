package org.rktechie.petclinic.services.map;

import org.rktechie.petclinic.model.Owner;
import org.rktechie.petclinic.services.BaseCrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements BaseCrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}

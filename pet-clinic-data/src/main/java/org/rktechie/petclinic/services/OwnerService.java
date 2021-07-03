package org.rktechie.petclinic.services;

import org.rktechie.petclinic.model.Owner;

public interface OwnerService extends BaseCrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}

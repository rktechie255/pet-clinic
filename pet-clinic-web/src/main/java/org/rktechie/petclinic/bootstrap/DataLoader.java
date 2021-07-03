package org.rktechie.petclinic.bootstrap;

import org.rktechie.petclinic.model.Owner;
import org.rktechie.petclinic.model.Vet;
import org.rktechie.petclinic.services.OwnerService;
import org.rktechie.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("================Owner data-set=========================");
        Owner owner1 = new Owner();
        owner1.setFirstName("American");
        owner1.setLastName("Curl");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("American");
        owner2.setLastName("Shorthair");
        ownerService.save(owner2);
        System.out.println("==============================================================");

        System.out.println("================Vet data-set=========================");
        Vet vet1 = new Vet();
        vet1.setFirstName("Dilute");
        vet1.setLastName("Calico");

        Vet vet2 = new Vet();
        vet2.setFirstName("Domestic");
        vet2.setLastName("Long Hair");

    }
}

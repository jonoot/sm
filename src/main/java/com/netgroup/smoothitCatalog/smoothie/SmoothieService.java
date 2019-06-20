package com.netgroup.smoothitCatalog.smoothie;

import org.springframework.stereotype.Service;

@Service
public class SmoothieService {

    public final SmoothieRepository smoothieRepository;

    public SmoothieService(SmoothieRepository smoothieRepository) {
        this.smoothieRepository = smoothieRepository;
    }

    public Iterable<Smoothie> getSmoothies() {
        return smoothieRepository.findAll();
    }


    public Smoothie create(Smoothie smoothie) {
        return smoothieRepository.save(smoothie);
    }

    public void delete(Long id) {
        smoothieRepository.deleteById(id);
    }
}

package com.netgroup.smoothitCatalog.smoothie;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "smoothie")
public class SmoothieController {

    public final SmoothieService smoothieService;

    public SmoothieController(SmoothieService smoothieService) {
        this.smoothieService = smoothieService;
    }

    @GetMapping
    public Iterable<Smoothie> getSmoothies() {
        return smoothieService.getSmoothies();
    }

    @PostMapping
    public Smoothie createSmoothie(@RequestBody Smoothie smoothie) {
        smoothieService.create(smoothie);
        return smoothie;
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        smoothieService.delete(id);
    }

}

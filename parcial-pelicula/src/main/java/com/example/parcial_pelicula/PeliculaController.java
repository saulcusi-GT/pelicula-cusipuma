package com.example.parcial_pelicula;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {

    private List<Pelicula> lista = new ArrayList<>();

    public PeliculaController() {
        lista.add(new Pelicula("Inception", "Nolan", 148, "ciencia ficcion", "Para>13"));
        lista.add(new Pelicula("Titanic", "James Cameron", 195, "Romance", "Para>13"));
    }

    @PostMapping
    public Pelicula agregar(@RequestBody Pelicula p) {
        lista.add(p);
        return p;
    }


    @GetMapping
    public List<Pelicula> listar() {
        return lista;
    }


    @PutMapping("/{index}")
    public Pelicula actualizar(@PathVariable int index, @RequestBody Pelicula p) {
        lista.set(index, p);
        return p;
    }


    @DeleteMapping("/{index}")
    public String eliminar(@PathVariable int index) {
        lista.remove(index);
        return "Eliminado";
    }
}

package com.comerciosapi.comercioapo.Controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comerciosapi.comercioapo.models.Comercio;
import com.comerciosapi.comercioapo.repositories.ComercioRepository;

@RestController
@RequestMapping("/comercio")
public class ComercioController {
    

    private final ComercioRepository comercioRepository;

    public ComercioController(ComercioRepository comercioRepository){
        this.comercioRepository = comercioRepository;
    }

    @GetMapping("/")
    public ResponseEntity<Object>getAllComercio(){
        return ResponseEntity.status(HttpStatus.OK).body(comercioRepository.findAll());
    }


    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<Object>getByCategoria(@PathVariable(value = "categoria") String categoria){
        
        try {
            return ResponseEntity.status(HttpStatus.OK).body(comercioRepository.findByCategoria(categoria));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não foi encontrado nenhum registro com a categoria informada");
        }
       
    }

    @GetMapping("/cidade/{cidade}")
    public ResponseEntity<Object>getByCidade(@PathVariable(value = "cidade") String cidade){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(comercioRepository.findByCidade(cidade));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.OK).body("Não foi encontrado nenhum registro com a cidade informada");
        }
    }

    @GetMapping("/bairro/{bairro}")
    public ResponseEntity<Object>getByBairro(@PathVariable(value = "bairro") String bairro){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(comercioRepository.findByBairro(bairro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.OK).body("Não foi encontrado nenhum registro com o bairro informado");
        }
    }

    @PostMapping("/")
    public ResponseEntity<Object>saveComercio(@RequestBody Comercio comercio){
        return ResponseEntity.status(HttpStatus.OK).body(comercioRepository.save(comercio));
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Object>removeComercio(@PathVariable(value = "id") Long id){
        Optional<Comercio>cOptional = comercioRepository.findById(id);
        if(!cOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Comercio Not found");
        }
        var comercio = cOptional.get();
        comercioRepository.delete(comercio);
        return ResponseEntity.status(HttpStatus.OK).body("Comercio deletado com sucesso!");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Object>updateComercio(@RequestBody Comercio comercio, @PathVariable(value = "id") Long id){
        Optional<Comercio>cOptional = comercioRepository.findById(id);
        if(!cOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Comercio Not found");
        }
        var comerci = cOptional.get();
        comerci.setNome(comercio.getNome());
        comerci.setTelefone(comercio.getTelefone());
        comerci.setEndereco(comercio.getEndereco());
        comerci.setBairro(comercio.getBairro());
        comerci.setCidade(comercio.getCidade());
        comerci.setCategoria(comercio.getCategoria());

        return ResponseEntity.status(HttpStatus.OK).body(comercioRepository.save(comerci));
    }


}

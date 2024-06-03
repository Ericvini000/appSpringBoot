package br.com.basicapp.appSpringBoot;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {
    private ArrayList<PacienteModel> pacientes = new ArrayList<>();

    @GetMapping
    public ArrayList<PacienteModel> read(){
        return pacientes;
    }

    @PostMapping
    public PacienteModel create(@RequestBody PacienteModel payload) {
        long proximoId = pacientes.size() +1;
        
        payload.setId(proximoId);

        pacientes.add(payload);
        
        return payload;
    }
}

package com.example.frota.caminhao;
import org.springframework.stereotype.Service;

@Service

public class CaminhaoService {
private CaminhaoRepository repository;

public Caminhao save(Caminhao caminhao) {
	
	return repository.save(caminhao);

}	
} 
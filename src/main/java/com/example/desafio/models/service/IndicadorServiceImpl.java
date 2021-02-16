package com.example.desafio.models.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.desafio.models.Indicador;
import com.example.desafio.models.Serie;
import com.example.desafio.models.entity.IndicadorEntity;
import com.example.desafio.repository.IndicadorRepository;


@Service
public class IndicadorServiceImpl implements IndicadorService {

	@Autowired
	private RestTemplate clienteRest;
	
	@Autowired
	private IndicadorRepository indicadorRepository;

	@Override
	public Indicador findByTypeAndDate(String type, String date) {

		Map<String, String> pathVariables = new HashMap<>();
		pathVariables.put("tipo_indicador", type);
		pathVariables.put("dd-mm-yyyy", date);
		
		String id = type+date;
		Indicador i;
		 Optional<IndicadorEntity>op =indicadorRepository.findById(id);
		
		if(op.isPresent()) {
			Serie[] serie = {new Serie(op.get().getFecha(),op.get().getValor())};
			i = new Indicador(op.get().getVersion(),"bd oracle",op.get().getCodigo(),op.get().getNombre(),op.get().getUnidadMedida(),serie);
		}else {
			i = clienteRest.getForObject("https://mindicador.cl/api/{tipo_indicador}/{dd-mm-yyyy}", Indicador.class,
					pathVariables);
			if(i.getSerie().length!=0) {
			IndicadorEntity indicadordao = new IndicadorEntity(id, i.getVersion(), i.getAutor(), i.getCodigo(), i.getNombre(), i.getUnidadMedida(),i.getSerie()[0].getFecha(),i.getSerie()[0].getValor());
			indicadorRepository.save(indicadordao);}
		}
		

		return i;

	}
}

package com.gbtec.gestaofornecedores.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gbtec.gestaofornecedores.model.Conta;
import com.gbtec.gestaofornecedores.model.Endereco;
import com.gbtec.gestaofornecedores.model.Fornecedor;
import com.gbtec.gestaofornecedores.model.dto.ContaDTO;
import com.gbtec.gestaofornecedores.model.dto.FornecedorDTO;
import com.gbtec.gestaofornecedores.repository.ContaRepository;
import com.gbtec.gestaofornecedores.repository.EnderecoRepository;
import com.gbtec.gestaofornecedores.repository.FornecedorRepository;

@Service
public class FornecedorService {
    
    private final FornecedorRepository fornecedorRepository;
    private final ContaRepository contaRepository;
    private final EnderecoRepository enderecoRepository;
	private ViaCepService viaCepService;

    @Autowired
    public FornecedorService(FornecedorRepository fornecedorRepository, ContaRepository contaRepository, EnderecoRepository enderecoRepository, ViaCepService viaCepService) {
        this.fornecedorRepository = fornecedorRepository;
        this.contaRepository = contaRepository;
        this.enderecoRepository = enderecoRepository;
        this.viaCepService = viaCepService;
    }

    @Transactional(readOnly = true)
    public List<Fornecedor> listAll(){
        return fornecedorRepository.findAll();
    }
    public Fornecedor save(FornecedorDTO fornecedorDTO) {
        Fornecedor fornecedor = fromDTO(fornecedorDTO);
        
        Set<Conta> contas = new HashSet<>();
        for(ContaDTO contaDTO : fornecedorDTO.getContas()){
            contas.add(new Conta(null,contaDTO.getBanco(),contaDTO.getAgencia(), contaDTO.getNumero(), contaDTO.getTipo(), fornecedor));
        }
        
        fornecedor.getContas().addAll(contas); 
       
        fornecedorRepository.save(fornecedor);
        contaRepository.saveAll(contas);
 
        return fornecedor;
    }

    private Fornecedor fromDTO(FornecedorDTO fornecedorDTO) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome(fornecedorDTO.getNome());
        fornecedor.setNomeFantasia(fornecedorDTO.getNomeFantasia());
        fornecedor.setTipo(fornecedorDTO.getTipoFornecedor());
        fornecedor.setCpfCnpj(fornecedorDTO.getCpfCnpj());
           
        Endereco novoEndereco = viaCepService.consultarCep(fornecedorDTO.getCep());
        
        novoEndereco.setLogradouro(fornecedorDTO.getLogradouro());
        novoEndereco.setComplemento(fornecedorDTO.getComplemento());
        novoEndereco.setBairro(fornecedorDTO.getBairro());
        enderecoRepository.save(novoEndereco);
		
        fornecedor.setEndereco(novoEndereco);
       
        return fornecedor;
    }
}

package br.com.devbodybuilder.getninjas.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.devbodybuilder.getninjas.modelo.AssistenciaTecnica;
import br.com.devbodybuilder.getninjas.modelo.Cliente;
import br.com.devbodybuilder.getninjas.modelo.Servico;
import br.com.devbodybuilder.getninjas.modelo.Validator;

public class ValidatorTeste {

	@Test 
	public void deveAceitarNumerosFormatadosComoData() {
		AssistenciaTecnica AulaDePiano = new AssistenciaTecnica("03/03/2021");
		
		assertEquals("03/03/2021", AulaDePiano.getData());
		}
	
	@Test
	public void deveAceitarCepECelularSemEspacoOuHifen() {
		Cliente Kenzinho = new Cliente("04704902", "kenzo.inoue@me.com", "11942110303");
		
		assertEquals("04704902", Kenzinho.getCep());
		assertEquals("11942110303", Kenzinho.getCelular());
		}
	
	@Test
	public void deveAceitarCepECelularComEspaco() {
		Cliente Kenzinho = new Cliente("04704 902", "kenzo.inoue@me.com", "11 94211 0303");
		
		assertEquals("04704 902", Kenzinho.getCep());
		assertEquals("11 94211 0303", Kenzinho.getCelular());
		}
	
	@Test
	public void deveAceitarCepECelularComHifen() {
		Cliente Kenzinho = new Cliente("04704-902", "kenzo.inoue@me.com", "11-94211-0303");
		
		assertEquals("04704-902", Kenzinho.getCep());
		assertEquals("11-94211-0303", Kenzinho.getCelular());
		}
	
	@Test
	public void deveAceitarCepECelularComEspacoEHifen() {
		Cliente Kenzinho = new Cliente("04704-902", "kenzo.inoue@me.com", "11 94211-0303");
		
		assertEquals("04704-902", Kenzinho.getCep());
		assertEquals("11 94211-0303", Kenzinho.getCelular());
		}
	
	@Test
	public void deveAceitarEmailComArroba() {
		Cliente Kenzinho = new Cliente("04704-902", "kenzo.inoue@me.com", "11 94211-0303");
		
		assertEquals("kenzo.inoue@me.com", Kenzinho.getEmail());
	}
}
	
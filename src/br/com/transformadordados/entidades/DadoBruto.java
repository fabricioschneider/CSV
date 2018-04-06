package br.com.transformadordados.entidades;

public class DadoBruto {
	public long COD_CLIENTE;
	public String NOME;
	public String CPF;
	public String EMAIL;
	public String USERNAME;
	public String PASSWORD;
	public String DATA_NASCIMENTO;
	public String DATA_CAD_CLI;
	public String DATA_CAD_END;
	public long COD_ENDERECO;
	public String RUA;
	public String NUMERO;
	public String COMPLEMENTO;
	public String CEP;
	public long COD_CIDADE;
	public String NOME_CIDADE;
	public String UF;
	public String ESTADO;
	public String REGIAO;
	public long NUM_PEDIDO;
	public String DATA_EMISSAO;
	public long COD_PRODUTO;
	public String TITULO;
	public int ANO_LANCAMENTO;
	public String IMPORTADO;
	public int PRAZO_ENTREGA;
	public int NUM_AUTORES;
	public double VALOR_UNITARIO;
	public int QUANTIDADE;
	public String SEXO;
	public int IDADE;
	
	public long getCOD_CLIENTE() {
		return COD_CLIENTE;
	}
	public String getNOME() {
		return '"' + NOME + '"';
	}
	public String getCPF() {
		return '"' + CPF + '"';
	}
	public String getEMAIL() {
		return '"' + EMAIL + '"';
	}
	public String getUSERNAME() {
		return '"' + USERNAME + '"';
	}
	public String getPASSWORD() {
		return '"' +PASSWORD + '"';
	}
	public String getDATA_NASCIMENTO() {
		return DATA_NASCIMENTO;
	}
	public String getDATA_CAD_CLI() {
		return DATA_CAD_CLI;
	}
	public String getDATA_CAD_END() {
		return DATA_CAD_END;
	}
	public long getCOD_ENDERECO() {
		return COD_ENDERECO;
	}
	public String getRUA() {
		return '"' + RUA + '"';
	}
	public String getNUMERO() {
		return NUMERO;
	}
	public String getCOMPLEMENTO() {
		return '"' + COMPLEMENTO + '"';
	}
	public String getCEP() {
		return '"' + CEP + '"';
	}
	public long getCOD_CIDADE() {
		return COD_CIDADE;
	}
	public String getNOME_CIDADE() {
		return '"' + NOME_CIDADE + '"';
	}
	public String getUF() {
		return '"' + UF + '"';
	}
	public String getESTADO() {
		return '"' + ESTADO + '"';
	}
	public String getREGIAO() {
		return '"' + REGIAO + '"';
	}
	public long getNUM_PEDIDO() {
		return NUM_PEDIDO;
	}
	public String getDATA_EMISSAO() {
		return DATA_EMISSAO;
	}
	public long getCOD_PRODUTO() {
		return COD_PRODUTO;
	}
	public String getTITULO() {
		return '"' + TITULO + '"';
	}
	public int getANO_LANCAMENTO() {
		return ANO_LANCAMENTO;
	}
	public String getIMPORTADO() {
		return '"' + IMPORTADO + '"';
	}
	public int getPRAZO_ENTREGA() {
		return PRAZO_ENTREGA;
	}
	public int getNUM_AUTORES() {
		return NUM_AUTORES;
	}
	public double getVALOR_UNITARIO() {
		return VALOR_UNITARIO;
	}
	public int getQUANTIDADE() {
		return QUANTIDADE;
	}
	public String getSEXO() {
		return '"' + SEXO + '"';
	}
	public int getIDADE() {
		return IDADE;
	}

}
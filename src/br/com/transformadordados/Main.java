package br.com.transformadordados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.com.transformadordados.entidades.DadoBruto;
import br.com.transformadordados.utils.StringFormater;

public class Main {

	public static void main(String[] args) {
		String nome = "dados.txt";

		System.out.printf("\nConteúdo do arquivo texto:\n");
		try {
			FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);

			FileWriter arq_escrita = new FileWriter("saida_sql.txt");
			PrintWriter gravarArq = new PrintWriter(arq_escrita);
			String linha = lerArq.readLine();
			linha = lerArq.readLine();
			while (linha != null) {
				String[] dados = linha.split(",");
				DadoBruto db = new DadoBruto();
				int i = 0;
				db.COD_CLIENTE = Long.parseLong(dados[i++]);
				db.NOME = dados[i++];
				db.CPF = dados[i++];
				db.EMAIL = dados[i++];
				db.USERNAME = dados[i++];
				db.PASSWORD = dados[i++];
				db.DATA_NASCIMENTO = dados[i++];
				db.DATA_CAD_CLI = dados[i++];
				db.DATA_CAD_END = dados[i++];
				db.COD_ENDERECO = Long.parseLong(dados[i++]);
				db.RUA = dados[i++];
				db.NUMERO = dados[i++];
				db.COMPLEMENTO = dados[i++];
				db.CEP = dados[i++];
				db.COD_CIDADE = Long.parseLong(dados[i++]);
				db.NOME_CIDADE = dados[i++];
				db.UF = dados[i++];
				db.ESTADO = dados[i++];
				db.REGIAO = dados[i++];
				db.NUM_PEDIDO = Long.parseLong(dados[i++]);
				db.DATA_EMISSAO = dados[i++];
				db.COD_PRODUTO = Long.parseLong(dados[i++]);
				db.TITULO = dados[i++];
				while(!dados[i].matches("^[0-9]*$"))
					db.TITULO = db.TITULO + dados[i++];

				db.ANO_LANCAMENTO = Integer.parseInt(dados[i++]);
				db.IMPORTADO = dados[i++];
				db.PRAZO_ENTREGA = Integer.parseInt(dados[i++]);
				db.NUM_AUTORES = Integer.parseInt(dados[i++]);
				db.VALOR_UNITARIO = Double.parseDouble(dados[i++]);
				db.QUANTIDADE = Integer.parseInt(dados[i++]);
				db.SEXO = dados[i++];
				db.IDADE = Integer.parseInt(dados[i++]);

				String sql = "insert into cliente(COD_CLIENTE,NOME,CPF,EMAIL,USERNAME,PASSWORD,DATA_NASCIMENTO,DATA_CAD_CLI,DATA_CAD_END,COD_ENDERECO) values (@COD_CLIENTE,@NOME,@CPF,@EMAIL,@USERNAME,@PASSWORD,@DATA_NASCIMENTO,@DATA_CAD_CLI,@DATA_CAD_END,@COD_ENDERECO);";
				sql += "\n";
								
				//FABRICIO
				sql += "insert into endereco(COD_ENDERECO,RUA,NUMERO,COMPLEMENTO,CEP) values (@COD_ENDERECO,@RUA,@NUMERO,@COMPLEMENTO,@CEP); ";
				sql += "\n";
				
				
				sql += "insert into cidade(NOME_CIDADE, UF, ESTADO,REGIAO) values (@NOME_CIDADE,@UF,@ESTADO,@REGIAO);";
				sql += "\n";
				
				sql += "insert into pedido(NUM_PEDIDO,DATA_EMISSAO) values (@NM_PEDIDO,@DATA_EMISSAO);";
				sql += "\n";
				
				sql += "insert into produto(COD_PRODUTO, TITULO,ANO_LANCAMENTO,IMPORTADO,PRAZO_ENTREGA) values (@COD_PRODUTO, @TITULO,@ANO_LANCAMENTO,@IMPORTADO,@PRAZO_ENTREGA);";
				sql += "\n";
				
				
				//FABRICIO
				
				sql = sql.replace("@COD_CLIENTE", String.valueOf(db.getCOD_CLIENTE()));
				sql = sql.replace("@NOME", db.getNOME());
				sql = sql.replace("@CPF", StringFormater.formataVarchar(db.getCPF()));
				sql = sql.replace("@EMAIL", db.getEMAIL());
				sql = sql.replace("@USERNAME", db.getUSERNAME());
				sql = sql.replace("@PASSWORD", db.getPASSWORD());
				sql = sql.replace("@DATA_NASCIMENTO", StringFormater.formataData(db.getDATA_NASCIMENTO()));
				sql = sql.replace("@DATA_CAD_CLI", db.getDATA_CAD_CLI());
				sql = sql.replace("@DATA_CAD_END", db.getDATA_CAD_END());
				sql = sql.replace("@COD_ENDERECO", String.valueOf(db.getCOD_ENDERECO()));
				
				//FABRICIO
				sql = sql.replace("@RUA", String.valueOf(db.getRUA()));
				sql = sql.replace("@NUMERO", db.getNUMERO());
				sql = sql.replace("@COMPLEMENTO", db.getCOMPLEMENTO());
				sql = sql.replace("@CEP", String.valueOf(db.getCEP()));
				sql = sql.replace("@COD_CIDADE", String.valueOf(db.getCOD_CIDADE()));
				sql = sql.replace("@NOME_CIDADE", db.getNOME_CIDADE());
				sql = sql.replace("@UF", db.getUF());
				sql = sql.replace("@ESTADO", db.getESTADO());
				sql = sql.replace("@REGIAO", db.getREGIAO());
				sql = sql.replace("@NUM_PEDIDO", String.valueOf(db.getNUM_PEDIDO()));
				sql = sql.replace("@DATA_EMISSAO", StringFormater.formataData(db.getDATA_EMISSAO()));
				sql = sql.replace("@COD_PRODUTO", String.valueOf(db.getCOD_PRODUTO()));
				sql = sql.replace("@TITULO", db.getTITULO());
				//FABRICIO
				
				
				linha = lerArq.readLine();

				gravarArq.printf(sql);
				gravarArq.printf("\n-------------\n");

			}
			System.out.println("Fim");
			gravarArq.close();
			arq.close();
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}

	}

}

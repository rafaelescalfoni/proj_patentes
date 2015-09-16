package br.ufrj.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.ufrj.dao.DAOFactory;
import br.ufrj.model.Patente;

@Resource
public class PatenteController {

	private final Result result;
	//private final DAOFactory daoFactory;
	
	public PatenteController(Result result) {//, DAOFactory daoFactory) {
		this.result = result;
		//this.daoFactory = daoFactory;
	}
	
	@Get @Path("/patentes/query/{keyword}")
	public void list(String keyword){
		
		System.out.println("entrou no método list");
		/*
		String strQuery = "FROM Patente p WHERE p.titulo like :keyword ";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("keyword", keyword);
		*/
		Patente p1, p2, p3;
		p1 = new Patente(1l);
		p2 = new Patente(2l);
		p3 = new Patente(3l);
		
		p1.setTitulo("ARGAMASSA FOTOCATAL�TICA PARA ESTRUTURAS DE CONCRETO EM GERAL");
		p1.setResumo("ARGAMASSA FOTOCATAL�TICA PARA ESTRUTURAS DE CONCRETO EM GERAL. Descreve-se a presente patente de inven��o como uma argamassa fotocatal�tica para estruturas de concreto em geral que, de acordo com as suas caracter�sticas, possui como pr�nc�pio b�sico uma argamassa fotocatal�tica na forma de massa consistente mais ou mesmo pl�stica com formula��o b�sica a base de di�xido de tit�nio TiO~ 2~ a ser aplicada em campo como revestimento sobre estruturas de concreto na constru��o civil como postes, barragens e pr�dios entre outros, com vistas a possibilitar a sua administra��o como revestimento de forma extremamente pr�tica, segura e precisa sobre as superf�cies destas estruturas de concreto como um ativo retentor e redutor dos gases poluentes ou gases do efeito estufa em especial os compostos nitrsos NO, aliado ao potencial fotocatal�tico de di�xido de tit�nio TiO~ 2~ e ao conceito d eecologicamente correto e, tendo como base, uma argamassa fotocatal�tica com grande resist�ncia, seguran�a e versatibilidade.");
		p1.setClassificacao("C04B 12/02 C04B 12/02 Cimentos n�o abrangidos pelos grupos Cimentos de fosfato ;C04B 12/02 Cimentos n�o abrangidos pelos grupos Cimentos de fosfato ;");
		p1.setDataDeposito("11/12/2012");
		p1.setNomeDepositante("INSTITUTO DE TECNOLOGIA PARA O DESENVOLVIMENTO - LACTEC (BR/PR) / COMPANHIA DE ELETRICIDADE DA BAHIA - COELBA (BR/BA)");
		p1.setNomeInventor("KLEBER FRANKE PORTELLA / MARCELLE MAIA BONATO / KELLY JACQUELINE CAMPOS BRAMBILLA / MARIANA D�REY GAIV�O PORTELLA / PRINCIA APARECIDA MORAIS PEREIRA / Jos� Maur�lio da Silva / DAILTON PEDREIRA CERQUEIRA / JEANNETTE CRUZ MONTEIRO DOS SANTOS / LEONARDO EUST�QUIO RODRIGUES / JULIO C�SAR MENDES / Eliseu Esmanhoto");
		p1.setNumPedido("BR 10 2012 031537 8 A2");
		p1.setOutros("Nome do Procurador:  VALOR PROPRIEDADE INTELECTUAL S/S LTDA PETI��ES Leia-me S� ser�o identificados nesta consulta os documentos (peti��es) apresentados por meio do sistema de Guia de Recolhimento da Uni�o - GRU - em vigor desde 2006. Documentos anteriores a esta data podem n�o estar relacionados.Leia-meLeia-meS� ser�o identificados nesta consulta os documentos (peti��es) apresentados por meio do sistema de Guia de Recolhimento da Uni�o - GRU - em vigor desde 2006. Documentos anteriores a esta data podem n�o estar relacionados.PgoProtocoloDataImgServi�oClienteDeliveryInforma��es do Banco: 341 - Banco Ita� S.A. Data: 11/02/2015 Valor: R$295.0Informa��es do Banco:Informa��es do Banco:341 - Banco Ita� S.A. Data: 11/02/2015 Valor: R$295.080015003457511/02/2015-220 Descri��o do Servi�o 220 Anuidade de pedido de patente de inven��o no prazo ordin�rioDescri��o do Servi�oDescri��o do Servi�o220 Anuidade de pedido de patente de inven��o no prazo ordin�rioCOMPANHIA DE ELETRICIDADE DO ESTADO DA BAHIA-COELBAInforma��es do Banco: 341 - Banco Ita� S.A. Data: 11/11/2014 Valor: R$590.0Informa��es do Banco:Informa��es do Banco:341 - Banco Ita� S.A. Data: 11/11/2014 Valor: R$590.080014026571011/11/2014-203 Descri��o do Servi�o 203 Pedido de exame de inven��oDescri��o do Servi�oDescri��o do Servi�o203 Pedido de exame de inven��oCOMPANHIA DE ELETRICIDADE DO ESTADO DA BAHIA-COELBAInforma��es do Banco: 341 - Banco Ita� S.A. Data: 11/12/2012 Valor: R$235.0Informa��es do Banco:Informa��es do Banco:341 - Banco Ita� S.A. Data: 11/12/2012 Valor: R$235.001512000340011/12/2012-200 Descri��o do Servi�o 200 Pedido nacional de Inven��o, Modelo de Utilidade, Certificado de Adi��o de Inven��o e entrada na fase nacional do PCTDescri��o do Servi�oDescri��o do Servi�o200 Pedido nacional de Inven��o, Modelo de Utilidade, Certificado de Adi��o de Inven��o e entrada na fase nacional do PCTCOMPANHIA DE ELETRICIDADE DO ESTADO DA BAHIA-COELBA PUBLICA��ESRPIData RPIDespachoComplemento do Despacho227802/09/20143.1 Descri��o Despacho 3.1 Publica��o do Pedido de Patente ou de Certificado de Adi��o de Inven��o. Publica��o do pedido depositado (Art. 30 da LPI), podendo ser adquirido no Banco de Patentes do Centro de Documenta��o e Informa��o Tecnol�gica do INPI - CEDIN - o folheto com o relat�rio descritivo, reivindica��es, desenhos e resumo do pedido, por quem se interessar. N�o sendo o exame requerido, pelo depositante ou qualquer interessado, no prazo de 36 (trinta e seis) meses do dep�sito, o pedido ser� arquivado. Publicado o arquivamento do pedido, poder� ser requerido, no prazo de 60 (sessenta) dias, o seu desarquivamento. N�o sendo o requerido o desarquivamento no prazo anteriormente citado, o pedido ser� considerado definitivamente arquivado.Descri��o DespachoDescri��o Despacho3.1 Publica��o do Pedido de Patente ou de Certificado de Adi��o de Inven��o. Publica��o do pedido depositado (Art. 30 da LPI), podendo ser adquirido no Banco de Patentes do Centro de Documenta��o e Informa��o Tecnol�gica do INPI - CEDIN - o folheto com o relat�rio descritivo, reivindica��es, desenhos e resumo do pedido, por quem se interessar. N�o sendo o exame requerido, pelo depositante ou qualquer interessado, no prazo de 36 (trinta e seis) meses do dep�sito, o pedido ser� arquivado. Publicado o arquivamento do pedido, poder� ser requerido, no prazo de 60 (sessenta) dias, o seu desarquivamento. N�o sendo o requerido o desarquivamento no prazo anteriormente citado, o pedido ser� considerado definitivamente arquivado.224010/12/20132.1 Descri��o Despacho 2.1 Notifica��o de Dep�sito de Pedido de Patente ou de Certificado de Adi��o de Inven��o. Notifica��o de dep�sito de pedido de patente ou de certificado de adi��o de inven��o. O pedido de patente ser� mantido em sigilo durante 18 (dezoito) meses a contar da data da prioridade mais antiga. Decorrido esse prazo, ser� publicado para conhecimento p�blico. O depositante pode, por�m, requerer a antecipa��o da publica��o. O prazo de sigilo de 18 (dezoito) meses para o pedido de Certificado de Adi��o de Invenc�o � contado da data do dep�sito do pedido principal. Quando houver ocorrido a publica�ao do pedido principal, o pedido de Certificado de Adi��o de Invenc�o ser� imediatamente publicado. Os dep�sitos s�o designados de acordo com a natureza requerida: Inven��o (PI), Modelo de Utilidade (MU) e Certificado de Adi��o de Invenc�o (C ). Os pedidos depositados atrav�s do PCT s�o notificados no subitem 1.3.Descri��o DespachoDescri��o Despacho2.1 Notifica��o de Dep�sito de Pedido de Patente ou de Certificado de Adi��o de Inven��o. Notifica��o de dep�sito de pedido de patente ou de certificado de adi��o de inven��o. O pedido de patente ser� mantido em sigilo durante 18 (dezoito) meses a contar da data da prioridade mais antiga. Decorrido esse prazo, ser� publicado para conhecimento p�blico. O depositante pode, por�m, requerer a antecipa��o da publica��o. O prazo de sigilo de 18 (dezoito) meses para o pedido de Certificado de Adi��o de Invenc�o � contado da data do dep�sito do pedido principal. Quando houver ocorrido a publica�ao do pedido principal, o pedido de Certificado de Adi��o de Invenc�o ser� imediatamente publicado. Os dep�sitos s�o designados de acordo com a natureza requerida: Inven��o (PI), Modelo de Utilidade (MU) e Certificado de Adi��o de Invenc�o (C ). Os pedidos depositados atrav�s do PCT s�o notificados no subitem 1.3.220830/04/20132.10 Descri��o Despacho 2.10 Entrada do Pedido de Patente ou Certificado de Adi��o de Inven��oDescri��o DespachoDescri��o Despacho2.10 Entrada do Pedido de Patente ou Certificado de Adi��o de Inven��oN�mero de Protocolo 15120003400 em 11/12/2012 12:48(PR).DOCUMENTOS22782278  Dados atualizados at� 02/06/2015 - N� da Revista: 2317");
		
		p2.setTitulo("M�DULO DE AQUECIMENTO PARA A EVAPORA��O DE UM COMPOSTO DISSOLVIDO NO �LEO CONTIDO EM UM C�RTER DE UM MOTOR A COMBUST�O, C�RTER DE �LEO PARA MOTOR A COMBUST�O, MOTOR A COMBUST�O INTERNA COMPREENDENDO UM C�RTER E VE�CULO AUTOMOTIVO EQUIPADO COM O REFERIDO MOTOR");
		p2.setResumo("M�DULO DE AQUECIMENTO PARA EVAPORA��O DE UM COMPOSTO DISSOLVIDO NO �LEO CONTIDO EM UM C�RTER DE UM MOTOR � COMBUST�O, C�RTER DE �LEO PARA MOTOR � COMBUST�O INTERNA COMPREENDENDO UM C�RTER E VE�CULO AUTOMOTIVO EQUIPADO COM O REFERIDO MOTOR. A presente se refere a um m�dulo de aquecimento para a evapora��o de um composto dissolvido no �leo contido em um c�rter (7) de modo � combust�o. Destinado a ser implantado no referido c�rter (7), caracterizado por compreender um recinto (1) destinado a ser imerso no �leo e no qual � disposto um meio de aquecimento (2) , o recinto (1) compreendendo um orif�cio inferior (3) para a entrada do �leo no recinto (1), um conduto (4) ressentido na parte alta do recinto (1), destinado a ser ligado � um circuito de tratamento do g�s do c�rter, um orif�cio superior (8) para a sa�da do �leo do recinto (1), dotado de um meio de obtura��o (6) apto a se abrir � uma temperatura interna do recinto (1) determinado. A inven��o refere-se tamb�m � um c�rter, um motor � combust�o, e um ve�culo automotivo associados.");
		p2.setClassificacao("F01M 13/00 F01M 13/00 Ventila��o ou aera��o do carter ;F01M 13/00 Ventila��o ou aera��o do carter ;");
		p2.setDataDeposito("05/12/2012");
		p2.setNomeDepositante("PEUGEOT CITRO�N AUTOMOBILES SA (FR)");
		p2.setNomeInventor("Matthieu Fuin");
		p2.setNumPedido("BR 10 2012 031374 0 A2");
		p2.setOutros("Nome do Procurador:  Nascimento Advogados PETI��ES Leia-me S� ser�o identificados nesta consulta os documentos (peti��es) apresentados por meio do sistema de Guia de Recolhimento da Uni�o - GRU - em vigor desde 2006. Documentos anteriores a esta data podem n�o estar relacionados.Leia-meLeia-meS� ser�o identificados nesta consulta os documentos (peti��es) apresentados por meio do sistema de Guia de Recolhimento da Uni�o - GRU - em vigor desde 2006. Documentos anteriores a esta data podem n�o estar relacionados.PgoProtocoloDataImgServi�oClienteDeliveryInforma��es do Banco: 237 - Banco Bradesco S.A. Data: 05/12/2014 Valor: R$295.0Informa��es do Banco:Informa��es do Banco:237 - Banco Bradesco S.A. Data: 05/12/2014 Valor: R$295.080014029359205/12/2014-220 Descri��o do Servi�o 220 Anuidade de pedido de patente de inven��o no prazo ordin�rioDescri��o do Servi�oDescri��o do Servi�o220 Anuidade de pedido de patente de inven��o no prazo ordin�rioPEUGEOT CITROEN AUTOMOBILES SAInforma��es do Banco: 237 - Banco Bradesco S.A. Data: 29/01/2013 Valor: R$120.0Informa��es do Banco:Informa��es do Banco:237 - Banco Bradesco S.A. Data: 29/01/2013 Valor: R$120.001813000288130/01/2013-260 Descri��o do Servi�o 260 Outras peti��esDescri��o do Servi�oDescri��o do Servi�o260 Outras peti��esPEUGEOT CITROEN AUTOMOBILES SAInforma��es do Banco: 237 - Banco Bradesco S.A. Data: 05/12/2012 Valor: R$235.0Informa��es do Banco:Informa��es do Banco:237 - Banco Bradesco S.A. Data: 05/12/2012 Valor: R$235.002012011413010/12/2012-200 Descri��o do Servi�o 200 Pedido nacional de Inven��o, Modelo de Utilidade, Certificado de Adi��o de Inven��o e entrada na fase nacional do PCTDescri��o do Servi�oDescri��o do Servi�o200 Pedido nacional de Inven��o, Modelo de Utilidade, Certificado de Adi��o de Inven��o e entrada na fase nacional do PCTPEUGEOT CITRO�N AUTOMOBILES SA PUBLICA��ESRPIData RPIDespachoComplemento do Despacho226213/05/20143.1 Descri��o Despacho 3.1 Publica��o do Pedido de Patente ou de Certificado de Adi��o de Inven��o. Publica��o do pedido depositado (Art. 30 da LPI), podendo ser adquirido no Banco de Patentes do Centro de Documenta��o e Informa��o Tecnol�gica do INPI - CEDIN - o folheto com o relat�rio descritivo, reivindica��es, desenhos e resumo do pedido, por quem se interessar. N�o sendo o exame requerido, pelo depositante ou qualquer interessado, no prazo de 36 (trinta e seis) meses do dep�sito, o pedido ser� arquivado. Publicado o arquivamento do pedido, poder� ser requerido, no prazo de 60 (sessenta) dias, o seu desarquivamento. N�o sendo o requerido o desarquivamento no prazo anteriormente citado, o pedido ser� considerado definitivamente arquivado.Descri��o DespachoDescri��o Despacho3.1 Publica��o do Pedido de Patente ou de Certificado de Adi��o de Inven��o. Publica��o do pedido depositado (Art. 30 da LPI), podendo ser adquirido no Banco de Patentes do Centro de Documenta��o e Informa��o Tecnol�gica do INPI - CEDIN - o folheto com o relat�rio descritivo, reivindica��es, desenhos e resumo do pedido, por quem se interessar. N�o sendo o exame requerido, pelo depositante ou qualquer interessado, no prazo de 36 (trinta e seis) meses do dep�sito, o pedido ser� arquivado. Publicado o arquivamento do pedido, poder� ser requerido, no prazo de 60 (sessenta) dias, o seu desarquivamento. N�o sendo o requerido o desarquivamento no prazo anteriormente citado, o pedido ser� considerado definitivamente arquivado.222313/08/20132.1 Descri��o Despacho 2.1 Notifica��o de Dep�sito de Pedido de Patente ou de Certificado de Adi��o de Inven��o. Notifica��o de dep�sito de pedido de patente ou de certificado de adi��o de inven��o. O pedido de patente ser� mantido em sigilo durante 18 (dezoito) meses a contar da data da prioridade mais antiga. Decorrido esse prazo, ser� publicado para conhecimento p�blico. O depositante pode, por�m, requerer a antecipa��o da publica��o. O prazo de sigilo de 18 (dezoito) meses para o pedido de Certificado de Adi��o de Invenc�o � contado da data do dep�sito do pedido principal. Quando houver ocorrido a publica�ao do pedido principal, o pedido de Certificado de Adi��o de Invenc�o ser� imediatamente publicado. Os dep�sitos s�o designados de acordo com a natureza requerida: Inven��o (PI), Modelo de Utilidade (MU) e Certificado de Adi��o de Invenc�o (C ). Os pedidos depositados atrav�s do PCT s�o notificados no subitem 1.3.Descri��o DespachoDescri��o Despacho2.1 Notifica��o de Dep�sito de Pedido de Patente ou de Certificado de Adi��o de Inven��o. Notifica��o de dep�sito de pedido de patente ou de certificado de adi��o de inven��o. O pedido de patente ser� mantido em sigilo durante 18 (dezoito) meses a contar da data da prioridade mais antiga. Decorrido esse prazo, ser� publicado para conhecimento p�blico. O depositante pode, por�m, requerer a antecipa��o da publica��o. O prazo de sigilo de 18 (dezoito) meses para o pedido de Certificado de Adi��o de Invenc�o � contado da data do dep�sito do pedido principal. Quando houver ocorrido a publica�ao do pedido principal, o pedido de Certificado de Adi��o de Invenc�o ser� imediatamente publicado. Os dep�sitos s�o designados de acordo com a natureza requerida: Inven��o (PI), Modelo de Utilidade (MU) e Certificado de Adi��o de Invenc�o (C ). Os pedidos depositados atrav�s do PCT s�o notificados no subitem 1.3.220830/04/20132.10 Descri��o Despacho 2.10 Entrada do Pedido de Patente ou Certificado de Adi��o de Inven��oDescri��o DespachoDescri��o Despacho2.10 Entrada do Pedido de Patente ou Certificado de Adi��o de Inven��oN�mero do Aviso de Recebimento SX244726389BRDOCUMENTOS22622262  Dados atualizados at� 02/06/2015 - N� da Revista: 2317");
		
		p3.setTitulo("PROCESSO DE RECICLAGEM DE ALUM�NIO COMPOSTO");
		p3.setResumo("PROCESSO DE RECICLAGEM DE ALUM�NIO COMPOSTO. O processo pedido de privil�gio de inven��o � destinado ao setor industrial e tem por objetivo promover o reaproveitamento de pain�is de alum�nio composto (ACM) geralmente empregados nos setores da comunica��o visual, constru��o civil, entre outros, visando, acima de tudo, contribuir de maneira positiva com o meio ambiente. Dessa forma, o presente invento � capaz de promover novas funcionalidades e aplica��es a materiais de descarte disponibilizados em grande abund�ncia, entretanto pouco explorados nos ditas atuais, contribuindo e colaborando com a preserva��o do meio ambiente e sustentabilidade do planeta.");
		p3.setClassificacao("C22B 7/04 ;  C22B 7/04 Processamento de mat�rias-primas outras que n�o min�rios por ex., sucata, a fim de produzir metais n�o ferrosos ou seus compostos Processamento de esc�rias ; C01F 7/00 C01F 7/00 Compostos de alum�nio ;C22B 7/04 Processamento de mat�rias-primas outras que n�o min�rios por ex., sucata, a fim de produzir metais n�o ferrosos ou seus compostos Processamento de esc�rias ;C01F 7/00 Compostos de alum�nio ;");
		p3.setDataDeposito("07/12/2012");
		p3.setNomeDepositante("Bruna Napoli (BR/PR) / Luis Paulo de Oliveira Marques (BR/PR)");
		p3.setNomeInventor("Bruna Napoli / Luis Paulo de Oliveira Marques");
		p3.setNumPedido("BR 10 2012 031205 0 A2");
		p3.setOutros("(74)  Nome do Procurador:  Marcos Antonio Nunes PETI��ES Leia-me S� ser�o identificados nesta consulta os documentos (peti��es) apresentados por meio do sistema de Guia de Recolhimento da Uni�o - GRU - em vigor desde 2006. Documentos anteriores a esta data podem n�o estar relacionados.Leia-meLeia-meS� ser�o identificados nesta consulta os documentos (peti��es) apresentados por meio do sistema de Guia de Recolhimento da Uni�o - GRU - em vigor desde 2006. Documentos anteriores a esta data podem n�o estar relacionados.PgoProtocoloDataImgServi�oClienteDeliveryInforma��es do Banco: 001 - Banco do Brasil S.A. Data: 06/03/2015 Valor: R$118.0Informa��es do Banco:Informa��es do Banco:001 - Banco do Brasil S.A. Data: 06/03/2015 Valor: R$118.080015005458006/03/2015-220 Descri��o do Servi�o 220 Anuidade de pedido de patente de inven��o no prazo ordin�rioDescri��o do Servi�oDescri��o do Servi�o220 Anuidade de pedido de patente de inven��o no prazo ordin�rioBruna NapoliInforma��es do Banco: 341 - Banco Ita� S.A. Data: 27/08/2014 Valor: R$7.0Informa��es do Banco:Informa��es do Banco:341 - Banco Ita� S.A. Data: 27/08/2014 Valor: R$7.001814001567927/08/2014-824 Descri��o do Servi�o 824 C�pia reprogr�fica simplesDescri��o do Servi�oDescri��o do Servi�o824 C�pia reprogr�fica simplesMara Barbosa PeixotoInforma��es do Banco: 001 - Banco do Brasil S.A. Data: 07/12/2012 Valor: R$95.0Informa��es do Banco:Informa��es do Banco:001 - Banco do Brasil S.A. Data: 07/12/2012 Valor: R$95.001512000337507/12/2012-200 Descri��o do Servi�o 200 Pedido nacional de Inven��o, Modelo de Utilidade, Certificado de Adi��o de Inven��o e entrada na fase nacional do PCTDescri��o do Servi�oDescri��o do Servi�o200 Pedido nacional de Inven��o, Modelo de Utilidade, Certificado de Adi��o de Inven��o e entrada na fase nacional do PCTBruna Napoli PUBLICA��ESRPIData RPIDespachoComplemento do Despacho227802/09/20143.1 Descri��o Despacho 3.1 Publica��o do Pedido de Patente ou de Certificado de Adi��o de Inven��o. Publica��o do pedido depositado (Art. 30 da LPI), podendo ser adquirido no Banco de Patentes do Centro de Documenta��o e Informa��o Tecnol�gica do INPI - CEDIN - o folheto com o relat�rio descritivo, reivindica��es, desenhos e resumo do pedido, por quem se interessar. N�o sendo o exame requerido, pelo depositante ou qualquer interessado, no prazo de 36 (trinta e seis) meses do dep�sito, o pedido ser� arquivado. Publicado o arquivamento do pedido, poder� ser requerido, no prazo de 60 (sessenta) dias, o seu desarquivamento. N�o sendo o requerido o desarquivamento no prazo anteriormente citado, o pedido ser� considerado definitivamente arquivado.Descri��o DespachoDescri��o Despacho3.1 Publica��o do Pedido de Patente ou de Certificado de Adi��o de Inven��o. Publica��o do pedido depositado (Art. 30 da LPI), podendo ser adquirido no Banco de Patentes do Centro de Documenta��o e Informa��o Tecnol�gica do INPI - CEDIN - o folheto com o relat�rio descritivo, reivindica��es, desenhos e resumo do pedido, por quem se interessar. N�o sendo o exame requerido, pelo depositante ou qualquer interessado, no prazo de 36 (trinta e seis) meses do dep�sito, o pedido ser� arquivado. Publicado o arquivamento do pedido, poder� ser requerido, no prazo de 60 (sessenta) dias, o seu desarquivamento. N�o sendo o requerido o desarquivamento no prazo anteriormente citado, o pedido ser� considerado definitivamente arquivado.224010/12/20132.1 Descri��o Despacho 2.1 Notifica��o de Dep�sito de Pedido de Patente ou de Certificado de Adi��o de Inven��o. Notifica��o de dep�sito de pedido de patente ou de certificado de adi��o de inven��o. O pedido de patente ser� mantido em sigilo durante 18 (dezoito) meses a contar da data da prioridade mais antiga. Decorrido esse prazo, ser� publicado para conhecimento p�blico. O depositante pode, por�m, requerer a antecipa��o da publica��o. O prazo de sigilo de 18 (dezoito) meses para o pedido de Certificado de Adi��o de Invenc�o � contado da data do dep�sito do pedido principal. Quando houver ocorrido a publica�ao do pedido principal, o pedido de Certificado de Adi��o de Invenc�o ser� imediatamente publicado. Os dep�sitos s�o designados de acordo com a natureza requerida: Inven��o (PI), Modelo de Utilidade (MU) e Certificado de Adi��o de Invenc�o (C ). Os pedidos depositados atrav�s do PCT s�o notificados no subitem 1.3.Descri��o DespachoDescri��o Despacho2.1 Notifica��o de Dep�sito de Pedido de Patente ou de Certificado de Adi��o de Inven��o. Notifica��o de dep�sito de pedido de patente ou de certificado de adi��o de inven��o. O pedido de patente ser� mantido em sigilo durante 18 (dezoito) meses a contar da data da prioridade mais antiga. Decorrido esse prazo, ser� publicado para conhecimento p�blico. O depositante pode, por�m, requerer a antecipa��o da publica��o. O prazo de sigilo de 18 (dezoito) meses para o pedido de Certificado de Adi��o de Invenc�o � contado da data do dep�sito do pedido principal. Quando houver ocorrido a publica�ao do pedido principal, o pedido de Certificado de Adi��o de Invenc�o ser� imediatamente publicado. Os dep�sitos s�o designados de acordo com a natureza requerida: Inven��o (PI), Modelo de Utilidade (MU) e Certificado de Adi��o de Invenc�o (C ). Os pedidos depositados atrav�s do PCT s�o notificados no subitem 1.3.220830/04/20132.10 Descri��o Despacho 2.10 Entrada do Pedido de Patente ou Certificado de Adi��o de Inven��oDescri��o DespachoDescri��o Despacho2.10 Entrada do Pedido de Patente ou Certificado de Adi��o de Inven��oN�mero de Protocolo 15120003375 em 07/12/2012 02:30(PR).DOCUMENTOS22782278  Dados atualizados at� 02/06/2015 - N� da Revista: 2317");
		
		List<Patente> list = new ArrayList<Patente>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		
		
		String listaStr = "{ \"responseHeader\": "
						+ "{"
						+	"\"status\":0,"
						+ 	"\"QTime\":0,"
						+ 	"\"params\":"
						+	"{"
						+	"\"q\":\"" 
						+ keyword 
						+ 	"\","
						+	"\"indent\":\"true\","
						+ 	"\"wt\":\"json\" "
						+ 	"}"
						+ "},"
						+ "\"response\":{ "
						+ "\"numFound\":5,"
						+ "\"start\":0, "
						+ "\"docs\":";
					
		result.use(Results.json()).withoutRoot().from(list).serialize();
		//listaStr += result.use(Results.json()).withoutRoot().from(list).serialize();
		//listaStr += "}}";
		
		result.include("lista", listaStr);
		
		result.use(Results.json()).from(listaStr).serialize();
		
	}
 	
}

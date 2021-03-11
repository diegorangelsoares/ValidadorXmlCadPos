# ValidadorXmlCadPos
Aplicativo para validar arquivo .xml

Esse aplicativo tem como objetivo validar os dados de um tipo de xml específico fornecido pela Boa Vista sobre cadastro positivo.

  1. Antes de compilar o projeto certifique os dados de conexão da base Oracle a qual será consultada no arquivo Fabrica/DadosConexoes.java.

  2. Certifique o caminho da pasta de log no arquivo Control/LerArquivoXML. De preferencia cria uma pasta XMLsPositivo.

    CAMINHO_ARQUIVOS = "/home/local/CONDUCTOR/diego.freire/Documentos/XMLsPositivo/"
    
  3. Altere o nome do arquivo xml que irá validar no Main.java na variável 'nomeArquivo'.
  
Ass.
Diego Rangel

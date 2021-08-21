#language: pt

Funcionalidade: Operação de Recebíveis

######################TESTES DE SAÚDE(HEALTH CHECK) #################

@saude
Cenario: Validar Saude do EndPoint de Negociação

  Dado que existe uma operação NRC
  Quando eu realizar uma consulta desta operação
  Entao  deve ser retornado o status code duzentos


#######################TESTES DE CONTRATO############################

@contrato
Cenario: Validar Contrato da Consulta de Operação com Sucesso

  Dado que existe uma operação NRC
  Quando eu realizar uma consulta desta operação
  Entao  os dados do contrato foram retornados com sucesso

###########################TESTES FUNCIONAIS########################

@funcional
Cenario: Consultar Operação

  Dado que existe uma operação NRC
  Quando eu realizar uma consulta desta operação
  Entao  os dados da operação devem ser exibidos
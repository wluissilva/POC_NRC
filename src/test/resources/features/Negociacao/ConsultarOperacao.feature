#language: pt

Funcionalidade: Operação de Recebíveis

######################TESTES DE SAÚDE(HEALTH CHECK) #################

  @saude
  Esquema do Cenario: Validar Saude do EndPoint de Negociação

    Dado que existe uma operação com os dados "<nuEc>", "<nuOperacao>", "<dataInicio>", "<dataFim>"
    Quando eu realizar uma consulta desta operação
    Entao  deve ser retornado o status code duzentos

    Exemplos:

      | nuEc       | nuOperacao | dataInicio | dataFim    |
      | 2005190360 | 474861     | 2021-04-24 | 2021-04-30 |


#######################TESTES DE CONTRATO############################

  @contrato
  Esquema do Cenario: Validar Contrato da Consulta de Operação com Sucesso

    Dado que existe uma operação com os dados "<nuEc>", "<nuOperacao>", "<dataInicio>", "<dataFim>"
    Quando eu realizar uma consulta desta operação
    Entao  os dados do contrato foram retornados com sucesso

    Exemplos:

      | nuEc       | nuOperacao | dataInicio | dataFim    |
      | 2005190360 | 474861     | 2021-04-24 | 2021-04-30 |
      | 2005190360 | 474861     | 2021-04-30 | 2021-05-01 |



###########################TESTES FUNCIONAIS########################

  @funcional
  Esquema do Cenario: Consultar Operação

    Dado que existe uma operação com os dados "<nuEc>", "<nuOperacao>", "<dataInicio>", "<dataFim>"
    Quando eu realizar uma consulta desta operação
    Entao  os dados da operação devem ser exibidos

    Exemplos:

      | nuEc       | nuOperacao | dataInicio | dataFim    |
      | 2005190360 | 474861     | 2021-04-24 | 2021-04-30 |
      | 2005190360 | 474861     | 2021-04-30 | 2021-05-01 |

  @funcional
  Esquema do Cenario: Consultar Operação com dados

    Dado que existe uma operação com os dados "<nuEc>", "<nuOperacao>", "<dataInicio>", "<dataFim>"
    Quando eu realizar uma consulta desta operação
    Entao  os dados da operação devem ser exibidos

    Exemplos:

      | nuEc       | nuOperacao | dataInicio | dataFim    |
      | 2005190360 | 474861     | 2021-04-24 | 2021-04-30 |
      | 2005190360 | 474861     | 2021-04-30 | 2021-05-01 |
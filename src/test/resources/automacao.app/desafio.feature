#language: pt

    Funcionalidade: Desafio automacao app

      @Automacao
      Esquema do Cenário: Criar um cadastro
        Dado que eu acesse a página de Login do app
        E clique em registrar um novo usuário
        Quando preencher as informacoes obrigatorias "<NOME>" "<TELEFONE>" "<EMAIL>" "<SENHA>"
        E clicar em Registrar
        Então deve aparecer um popup com a "<MENSAGEM>"

        Exemplos:
          | NOME     | TELEFONE | EMAIL                 | SENHA | MENSAGEM                |
          | Leonardo | 96542234 | leonardo@teste.com.br | 12345 | Registration Successful |


      @Automacao
      Esquema do Cenário: Realizar Login
        Dado que eu acesse a página de Login do app
        Quando preencher as informacoes de Login "<EMAIL>" "<SENHA>"
        E eu clicar em login
        E deve aparecer um popup com a "<MENSAGEM>"
        Então devo visualizar a area logada

        Exemplos:
          | EMAIL                 | SENHA | MENSAGEM     |
          | leonardo@teste.com.br | 12345 | Login sucess |

      @Automacao
      Esquema do Cenário: Realizar login com um usuário inválido
        Dado que eu acesse a página de Login do app
        Quando preencher as informacoes de Login "<USUARIO>" "<SENHA>"
        E eu clicar em login
        Então deve aparecer um popup com a "<MENSAGEM>"

        Exemplos:
          | USUARIO               | SENHA | MENSAGEM    |
          | leonardo@teste.com.br | 13456 | Login error |
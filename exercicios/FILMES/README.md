## Exercicios M2S1(Módulo 2 - Semana 1)

## Ex 1 - Lista de filmes e séries
Criar um ArrayList para armazenar uma lista de filmes e séries.
Utilizando um laço de repetição, pedir ao usuário que informe alguns filmes/séries ou um comando para sair (pode ser "0", mas fique à vontade para mudar).

Para isso, criar funções para:

-Adicionar filme/série na lista
-Ao sair listar os filmes/séries inseridos

## Ex 2 - Lista de filmes e séries - Com menu de opções
Vamos melhorar nosso sistema!

O usuário precisa manipular a lista de filmes/séries, portanto precisaremos adicionar a funcionalidade de um menu de opções:
Opções (números são sugestões para executar as ações):
    - (1) Listar
    - (2) Adicionar
    - (0) Sair
Quando a opção escolhida for "Listar", utilizar a função de listagem criada no Exercício 1.
Quando a opção escolhida for "Adicionar", utilizar a função criada para adicionar no Exercício 1.
Altere a função listar para que seja exibido o índice ao lado de cada item, usaremos posteriormente.

## Ex 3 - Lista de filmes e séries - Nova opção no menu
Após esta refatoração realizada no Exercício 2, adicione uma opção no menu para que o filme/série seja removido
Nova opção (números são sugestões para executar as ações):
    - (3) Remover
Criar 2 novas funções:
    "listarPedirIndice":
        -> utilizar a função de listagem (com índices - conforme alterado no Execício 2)
        -> pedir ao usuário que escolha um item da lista
        -> retornar o índice escolhido
    "removerItemLista":
        -> utilizar a função "listarPedirIndice"
       -> utilizar a função "removerItem" (próxima função a ser criada) e passar como parâmetro o índice retornado da "listarPedirIndice"
    "removerItem":
        -> precisa receber o índice por parâmetros
        -> na sequência realizar a remoção do item existente no índice

## Ex 4 - Lista de filmes e séries assistidos
Continuando nosso projeto!
Vamos criar uma nova lista para armazenar os filmes e séries que já foram assistidos pelo usuário.
Após criar a lista, será necessário adicionar mais opções no menu:
Novas opção (números são sugestões para executar as ações):
    - (4) Marcar como assistido
    - (5) Listar assistidos
Criar novas funções
    "marcarComoAssistido"
        > utilizar a função "listarPedirIndice" (criada no Exercício 3)
        > adicionar na nova lista de filmes assistidos o filme/série escolhido pelo usuário
        > remover item da lista de filmes/séries utilizando a função "removerItem" (criada no Exercício 3)
Dessa forma o filme/série será movido para a nova lista.

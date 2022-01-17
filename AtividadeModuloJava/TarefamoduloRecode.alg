algoritmo "Recode viajens"
// Função : cadastro de clientes e seus destinos
// Autor : Renan Terleski Teixeira
// Data : 21/10/2021

var
cliente, destino, ida, volt: vetor [1..3] de caractere
op, i, c: inteiro
inicio
Escreval ("Olá, bem vindo a Recode viajens, primeiramente cadastre os clientes;")
Para i <- 1 ate 3 faca
   escreva ("Informe o nome do cliente", i,":")
   leia (cliente[i])
   escreval ("Infrome o destino:")
   leia (destino[i])
   escreval ("Informe data de partida:")
   leia (ida[i])
   escreval ("Informe data de retorno:")
   leia (volt[i])
fimpara
Escreval ("Menu:")
Escreval (" 1 - Cadastro de novos clientes e destinos; ")
Escreval (" 2 - Consulta cronograma de viajens atual; ")
Escreval (" 3 - Encerrar programa.")
leia (op)
escolha op
caso 1
   para i <- 1 ate 3 faca
      escreva ("Informe o nome do cliente", i,":")
      leia (cliente[i])
      escreval ("Infrome o destino:")
      leia (destino[i])
      escreval ("Informe data de partida:")
      leia (ida[i])
      escreval ("Informe data de retorno:")
      leia (volt[i])
   fimpara
caso 2
   para c <- 1 ate 3 faca
      escreva ("Nome do cliente: ", cliente[c])
      escreval ("Destino: ", destino[c])
      escreval ("Data de partida: ", ida[c])
      escreval ("Data de retorno: ", volt[c])
   fimpara
caso 3
   escreva ("PROGRAMA ENCERRADO")

fimescolha




fimalgoritmo

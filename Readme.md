# Calculadora API

TODO(MNahVR): Visando a manutenção do caráter prático da disciplina de GQSO, teremos um software-alvo (calculadora API), onde trabalharemos nela durante todo o ano. 
## Neste software devemos atender os seguintes requisitos funcionais:


* API HTTP (inspirada em REST) para calculadora com as 2 operações

* Operações:

```
GET /soma/1.5/2.3  → retorna “3.8”
GET /sub/2/1 → retorna “1”
```

* Operandos e retorno números decimais representados com ponto como delimitador

* Entradas inválidas devem retornar o código de status HTTP 400 (bad request). 

```
Exemplos:
GET /soma/a/1.0
GET /soma
GET /soma/1.0
```

## Além destes, devemos atender os seguintes requisitos não funcionais:

* Código fonte livre e aberto

* Licença MIT (permissiva)

* Usando o repositório online

* Usando integração e entrega contínuas


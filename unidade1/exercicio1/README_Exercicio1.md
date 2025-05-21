### analise_algoritmos_fernandoFelipe - Exercício 1

Considerando os valores do alvo buscado como: 8, 98, 998, 9998, 99998 e 999998 respectivamente foram coletados os seguintes resultados:

Alvo buscado: 8
- Linear: índice 8, tempo 1400 nanosegundos - Com tamanho 10
- Binária: índice 4, tempo 8800 nanosegundos - Com tamanho 10

Alvo buscado: 98
- Linear: índice 98, tempo 1100 nanosegundos - Com tamanho 100
- Binária: índice 49, tempo 1100 nanosegundos - Com tamanho 100

Alvo buscado: 998
- Linear: índice 998, tempo 6500 nanosegundos - Com tamanho 1000
- Binária: índice 499, tempo 500 nanosegundos - Com tamanho 1000

Alvo buscado: 9998
- Linear: índice 9998, tempo 63900 nanosegundos - Com tamanho 10000
- Binária: índice 4999, tempo 500 nanosegundos - Com tamanho 10000

Alvo buscado: 99998
- Linear: índice 99998, tempo 710200 nanosegundos - Com tamanho 100000
- Binária: índice 49999, tempo 2200 nanosegundos - Com tamanho 100000

Alvo buscado: 999998
- Linear: índice 999998, tempo 270200 nanosegundos - Com tamanho 1000000
- Binária: índice 499999, tempo 74700 nanosegundos - Com tamanho 1000000


#### Investigando força bruta - Fernando Felipe da Silva
| Tamanho do Vetor | Busca Linear (ms) | Busca Binária (ms) |
|------------------|-------------------|--------------------|
| 10               | 0,0014            | 0,0088             |
| 100              | 0,0011            | 0,0011             |
| 1.000            | 0,0065            | 0,0005             |
| 10.000           | 0,0639            | 0,0005             |
| 100.000          | 0,7102            | 0,0022             |
| 1.000.000        | 0,2702            | 0,0747             |

A ordem de complexidade da busca linear, com o próprio nome já diz, é O(n). Sendo assim, o número de operações cresce de acordo com o número de elementos. Diferente da busca binária, que usa O(log n) com o "dividir para conquistar", pegando problemas grandes e quebrando em problemas menores, se tornando muito mais eficiente que o O(n) conforme o número de elementos vai crescendo.

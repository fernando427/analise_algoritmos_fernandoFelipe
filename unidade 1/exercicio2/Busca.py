import random
import time

tamanho = 10000000
vetor = [random.randint(0, 10000000) for _ in range(tamanho)]
posicao_busca = 33
encontrado = False

inicio_busca_linear = time.time_ns()
for numero in vetor:
    if numero == posicao_busca:
        print(f"{posicao_busca} está na lista")
        encontrado = True

if not encontrado:
    print(f"{posicao_busca} não está na lista")

tempo_busca_linear = time.time_ns() - inicio_busca_linear
print(f"Linear: índice {posicao_busca}, tempo {tempo_busca_linear} nanosegundos")
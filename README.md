# kart-rank
Projeto desafio Kark Rank

### Passos para execução:

1 - Rodar o comando mvn install

2 - Ir para a pasta target e rodar o comando: java -cp rank-kart.jar br.com.kart.rank.AppMain “LOCAL DO ARQUIVO DE LOG”

OBS: O local do arquivo deve ser informado completo, ex: C:/Users/User/Documents/kart-rank-1.txt

### Implementações

* Posição Chegada, Código Piloto, Nome Piloto, Qtde Voltas Completadas e Tempo Total de Prova
- Descobrir a melhor volta de cada piloto
+ Descobrir a melhor volta da corrida
+ Calcular a velocidade média de cada piloto durante toda corrida
+ Descobrir quanto tempo cada piloto chegou após o vencedor

## Testes unitários

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running DateTimeUtilTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.175 sec
Running LogProcessorTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.099 sec
Running NumberUtilTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.002 sec
Running RaceProcessorTest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 sec

Results :

Tests run: 8, Failures: 0, Errors: 0, Skipped: 0

```

### Saída do log

```----------------------------------------------------------------------------------
Position: 1 038 - F.MASSA Laps: 4 - Total Time: 04:11.578 - Best Lap:01:02.769 - Speed Average: 44.24575

Position: 2 002 - K.RAIKKONEN Laps: 4 - Total Time: 04:15.153 - Best Lap:01:03.076 - Speed Average: 43.62725 - Time Behind Winner: 00:03.575

Position: 3 033 - R.BARRICHELLO Laps: 4 - Total Time: 04:16.080 - Best Lap:01:03.716 - Speed Average: 43.468 - Time Behind Winner: 00:04.502

Position: 4 023 - M.WEBBER Laps: 4 - Total Time: 04:17.722 - Best Lap:01:04.216 - Speed Average: 43.191254 - Time Behind Winner: 00:06.144

Position: 5 026 - A.COSTA Laps: 4 - Total Time: 04:17.782 - Best Lap:01:02.152 - Speed Average: 43.7545 - Time Behind Winner: 00:06.204

Position: 6 015 - F.ALONSO Laps: 4 - Total Time: 04:54.221 - Best Lap:01:07.011 - Speed Average: 38.06625 - Time Behind Winner: 00:42.643

Position: 7 011 - S.VETTEL Laps: 3 - Total Time: 06:27.276 - Best Lap:01:18.097 - Speed Average: 25.745667 - Time Behind Winner: 02:15.698

Best Race Lap: 01:02.152 026 - A.COSTA
----------------------------------------------------------------------------------```

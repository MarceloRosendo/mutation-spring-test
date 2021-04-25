# Testes de mutação 
Integrantes:
 - Marcelo Maximiano Carvalho Rosendo
 - Erick Henrique Leal
 - Eduardo Ferreira Rodrigues
 - Marcos Oliveira Santos de Jesus

## Como testar?

 1. Importe o projeto em uma IDE de sua preferencia, lembrando que se trata de um projeto spring boot
 2. Caso não vá executar o projeto via IDE utilize o command line do [maven](https://maven.apache.org/install.html)
 3. Execute o comando que roda todos os testes unitários cobrindo com os testes de mutação (execute todos os comando no root do projeto):
> pitest:mutationCoverage -f pom.xml
 4. Execute o comando abaixo para gerar um relatório dos testes de mutação
 > pitest:report -f pom.xml

## Onde estão os arquivos?
Os arquivos do projeto estarão no root do projeto github, mas também podem ser encontrados nos locais designados pela framework spring boot

 - Testes unitários por classe:

> mutation-spring-test/src/test/java/com/example

 - Classes com a solução dos problemas:
> mutation-spring-test/src/main/java/com/example/mutationspringtest/methods
 - Os arquivos com os resultados dos testes de mutação estão em 
 > mutation-spring-test/target/pit-reports


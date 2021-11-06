# backend-challenge

## DESCRIÇÃO/PROBLEMA: 

Esta aplicação é parte do processo de avaliação do Iti Digital, onde a função é validar senhas, seguindo os critérios: 

Nove ou mais caracteres
Ao menos 1 dígito
Ao menos 1 letra minúscula
Ao menos 1 letra maiúscula
Ao menos 1 caractere especial
Considere como especial os seguintes caracteres: !@#$%^&*()-+
Não possuir caracteres repetidos dentro do conjunto

Exemplo:

IsValid("") // false  
IsValid("aa") // false  
IsValid("ab") // false  
IsValid("AAAbbbCc") // false  
IsValid("AbTp9!foo") // false  
IsValid("AbTp9!foA") // false
IsValid("AbTp9 fok") // false
IsValid("AbTp9!fok") // true


>> Esta aplicação foi desenhada e desenvolvida utilizando as melhores práticas de desenvolvimento. 
Sua estrutura é orientada a Domímio, onde a regra de negócio é feito um contrato, onde os demais módulos independentes fazem cada um seu trabalho, sem acoplamento. 
Ou seja, desta forma, é possível refatorar determinados módulos sem afetar o funcionamento de outros. 

### Divisão do Modelo da Arquitetura: 

> domain
	- Modelo: modelo de domino, o mapeamento da entidade
	- Service: com as regras de negocio
	 
	 Interfaces: 
		Service
		Repository

> infra
   - Repository IMPLEMENTANDO a interface do domain, abstraindo a parte com o banco
   - Injeção da dependencia do repository, tipo o JPA ou outra coisa

> api
   - App: Especie de conversor, comunicação entre o model e controler, utilizando a abstração e tratativa de erros e DTOS
   - Controller: Apenas chama o app, com o resultado já convertido. 
   


## REQUSITOS: 

- Baixe o OpenJDK 17 (https://jdk.java.net/17/) para a versão do seu SO
- Indique na variavel de ambiente JAVA_HOME o caminho do JDK (https://confluence.atlassian.com/confbr1/configurando-a-variavel-java_home-no-windows-933709538.html)


## COMO EXECUTAR: 

- Acesse a pasta raíz do projeto e digite o comando gradlew bootRun para que a aplicação seja executada. A porta configurada é a 8080. 
- Uma vez no ar, acesse a api http://localhost:8080/valida-senha, passando o password: 

Content-Type: application/json

{
    "password" : "AbTp!9fok"
}

### Via Swagger: 
 - Se preferir, acesse o endereço do swagger e acesse: 
    http://localhost:8080/swagger-ui.html#/ 
    
  - Em Password Validate POST > valida-senha

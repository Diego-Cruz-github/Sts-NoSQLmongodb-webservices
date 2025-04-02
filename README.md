# Sts-NoSQLmongodb-webservices

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Diego-Cruz-github/webservice-spboot3-jpa/blob/main/LICENSE) 

# Sobre o projeto

Este é um projeto de backend Spring Tool Suite (STS) Java que implementa uma API RESTful, simulando uma rede social com posts e comentários, utilizando o MongoDB como banco de dados NoSQL. O projeto demonstra a capacidade de construir serviços web escaláveis utilizando Spring Web Services, aliados a flexibilidade do MongoDB para armazenar e recuperar dados.

A arquitetura do projeto é estruturada em camadas lógicas (resources, services, repositories), seguindo as melhores práticas de desenvolvimento para garantir a manutenibilidade e escalabilidade da aplicação.

* **Resources:** Camada responsável por expor os endpoints da API RESTful e receber as requisições HTTP.
* **Services:** Camada que contém a lógica de negócios da aplicação, realizando as operações necessárias e interagindo com a camada de repositórios.
* **Repositories:** Camada que abstrai o acesso ao banco de dados MongoDB, utilizando o Spring Data MongoDB para persistir e recuperar os dados.

O projeto também inclui tratamento de exceções, que pode ser estendido com testes de unidade e integração para garantir a qualidade e confiabilidade da aplicação.

## Funcionalidades Principais

* **CRUD Completo:** A API oferece operações completas de Create, Read, Update e Delete (CRUD) para as entidades do domínio.
* **Controladores REST:** A API RESTful expõe endpoints bem definidos para interagir com as entidades do domínio.
* **Persistência de Dados:** O projeto utiliza o Spring Data MongoDB para mapear as entidades Java para coleções no MongoDB, permitindo a persistência e recuperação de dados de forma eficiente.

* **Tratamento de Exceções:** O projeto implementa um tratamento de exceções robusto, garantindo que os erros sejam tratados de forma adequada e que as respostas da API sejam informativas.
* **Flexibilidade do MongoDB:** Utiliza a flexibilidade do MongoDB para armazenar dados em formato JSON, permitindo a criação de esquemas dinâmicos e a adaptação a diferentes necessidades de dados.

## Modelo conceitual

* O modelo conceitual foi desenvolvido utilizando diagramas UML, facilitando a visualização e o entendimento da estrutura do sistema. Devido à natureza do MongoDB, o modelo é mais focado em coleções e documentos JSON.

* ![Domain Model](https://github.com/Diego-Cruz-github/Sts-NoSQLmongodb-webservices/blob/master/Captura%20de%20tela%202025-04-02%20184357.png)
* ![Domain Instance](https://github.com/Diego-Cruz-github/Sts-NoSQLmongodb-webservices/blob/master/Captura%20de%20tela%202025-04-02%20184541.png)


  

# Tecnologias utilizadas

* Java
* Spring Tool Suite (STS)
* Spring Web Services
* Spring Data MongoDB
* MongoDB
* Maven
* Postman

## Como executar o projeto

1.  **Clone o repositório:**

    \`\`\`bash
    git clone https://github.com/Diego-Cruz-github/Sts-NoSQLmongodb-webservices.git
    \`\`\`

2.  **Navegue até o diretório do projeto:**

    \`\`\`bash
    cd Sts-NoSQLmongodb-webservices
    \`\`\`

3.  **Execute o projeto com Maven:**

    \`\`\`bash
    ./mvnw spring-boot:run
    \`\`\`

4.  **A API estará disponível em \`http://localhost:8080\`.**

5.  **Banco de Dados MongoDB:**

    * Certifique-se de que o MongoDB esteja instalado e em execução na porta padrão (27017) ou configure a conexão no arquivo `application.properties` ou `application.yml`.

6.  **Testes com Postman:**

    * Utilize o Postman para testar os endpoints da API.
    * Importe a coleção do Postman (se disponível) para facilitar os testes.
    * Realize requisições para os endpoints REST para verificar as funcionalidades da API.

**Observações Adicionais:**

* **Arquivo \`application.properties\` ou \`application.yml\`:**
    * Verifique o arquivo de configuração para quaisquer propriedades adicionais que precisem ser configuradas, como variáveis de ambiente ou configurações de segurança.

## Endpoints da API

* **GET /items:** Retorna uma lista de todos os itens.
    * Exemplo de requisição: \`http://localhost:8080/items\`
    * Exemplo de resposta: \`\[{"\_id": "...", "name": "Item 1", ...}, {"\_id": "...", "name": "Item 2", ...}\]\`

* **POST /items:** Cria um novo item.
    * Exemplo de requisição:

        \`\`\`json
        {
            "name": "Novo Item",
            "description": "Descrição do novo item"
        }
        \`\`\`

    * Exemplo de resposta: \`{"\_id": "...", "name": "Novo Item", "description": "Descrição do novo item"}\`

* **GET /items/{id}:** Retorna um item específico pelo ID.
    * Exemplo de requisição: \`http://localhost:8080/items/{id}\`
    * Exemplo de resposta: \`{"\_id": "...", "name": "Item 1", "description": "Descrição do item 1"}\`

# Autor
Diego Fonte Boa Cruz

www.linkedin.com/in/diegof90

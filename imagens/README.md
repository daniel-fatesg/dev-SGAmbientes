<div align="center" style="background-color: #e6eaf4;">
    <img src="imagens/logo-faculdade-300.png" 
         alt="Texto alternativo" 
         title="Sistema de Controle de Acesso a Ambientes"/>
</div>
<br>
<br>
<br>
<div align="center">
    <img src="imagens/controle-acesso.png" alt="Texto alternativo" />
</div>
<br>
<h2> Sistema de Controle de Acesso a Ambientes </h2>
<h3> 1 - Visão Geral do Software </h3>

<p>
Controlar o acesso a ambientes de sala de aula, surge da necessidade de garantir a segurança do ambiente, dos equipamentos, dos alunos, docentes e funcionários da instituição. Dentro deste contexto, uma necessidade primordial é assegurar o acesso restrito a ambientes de pessoas autorizadas, de modo a garantir a privacidade e proteção aos recursos de valor dentro desses ambientes. Há também a necessidade de monitorar o histórioco de acesso aos ambientes, registrando-se a data, horário e usuário que acessou um determinado ambiente.
</p>

<h4> 1.1 - Objetivo do Software </h4>

<p>
   O objetivo do Sistema de Controle de Acesso a Ambientes é gerenciar o acesso a sala de aula, utilizando reconhecimento facial. Sua função principal consiste em reconher a face do usário, autorizar o  acesso, comandar a liberação da tranca eletromagnética do ambiente e manter o histórico com data, horário e usuário que acessou aquele espaço.
</p>
<div align="center">
    <img src="imagens/sgambiente.png" alt="Texto alternativo" />
</div>

<h4> 1.2 - Escopo do Projeto e Requisitos de Software </h4>
<p>Os requisitos funcionais descrevem as funções, que o sistema deve executar e as tarefas que ele deve realizar. Neste documento, apresentaremos os requisitos funcionais do Sistema de Controle de Acesso a Ambientes, definidos a partir das necessidades do cliente vinculado a este projeto. Além das principais necessidades e requisitos funcionais,  apresentaremos uma descrição detalhada de como o modelo Entidade-Relacionamento (ER) foi desenvolvido para atender a esses requisitos, incluindo as entidades, relacionamentos e atributos necessários para armazenar e gerenciar as informações do sistema.</p>
<br>
<p>
Após diversas reuniões com o cliente, restringiu-se o escopo deste projeto a implementação de um aplicação web que contemple as necessidades detalhadas abaixo:
</p>
<br>
<ul>
<li> permitir o cadastro de diferentes tipos de ambientes, como sala de aula, laboratórios e  auditórios;
</li>
<li>
permitir o cadastro de usuários com diferentes perfis de acesso, tal como professor, aluno e funcionários;
</li>
<li>
liberar o acesso aos ambientes utilizando  reconhecimento facial;
</li>
<li>
manter o histórico de acesso a cada ambiente, registrando-se data, horário e usuário que a acessou;
</li>
<li>
permitir o cadastro do embarcado e o seu vinculo a um ambiente. O embarcado deve  comandar a liberação da tranca eletromagnética para o acesso a sala de aula.
</li>

</ul>
<br>
<br>
<p> Fundamentado nas necessidades levantadas com o cliente, foram identificados os seguintes requisitos funcionais :
<br>
<br>
<div align="center">
<table>
    <thead>
    <tr>
        <th>ID</>
        <th> Nome </th>
        <th>DESCRIÇÃO</>
    </tr>
    </thead>
    <tbody>
        <tr>
            <td><b>RF01</b></td>
            <td><b>Manter usuários</b></td>
            <td>O sistema deve permitir incluir, excluir, atualizar e buscar informações do usuário, como nome, cpf, celular e e-mail. A busca será realizada pelo e-mail e os dados persistidos em um banco de dados</td>
        </tr>
        <tr>
            <td><b>RF02</b></td>
            <td><b>Autenticar usuários</b></td>
            <td>A autenticação do usuário deve verificada ;</td>
        </tr>
        <tr>
            <td><b>RF03</b></td>
            <td><b>Manter perfil de usuários</b></td>
            <td>o sistema deve permitir incluir, excluir, atualizar e buscar informações do usuário: nome, cpf, celular e e-mail;</td>
        </tr>
        <tr>
            <td><b>RF04</b></td>
            <td><b>Manter contato</b></td>
            <td>o sistema deve permitir incluir, excluir, atualizar e buscar informações do usuário: nome, cpf, celular e e-mail;</td>
        </tr>
    </tbody>
</table>
</div>
<br>
<h4> 1.4 - Modelo de Domínio </h2>
<p>A documentação do modelo Entidade-Relacionamento (ER) é uma etapa crucial no processo de desenvolvimento de um sistema de informação. O modelo ER é usado para representar a estrutura do banco de dados, incluindo as entidades, relacionamentos e atributos. A partir desse modelo, é possível criar um esquema de banco de dados que possa ser implementado em um sistema de gerenciamento de banco de dados (SGBD). Neste documento, apresentaremos o modelo ER para Sistema de Controle de Acesso a Ambientes que contém a descrição detalhada dessa estrutura, incluindo as entidades, relacionamentos, chaves primárias e estrangeiras.</p>
<div align="center">
    <img src="imagens/entidades.png" alt="Texto alternativo" />
</div>
<br>
<h3> 2 - Arquitetura do Software </h2>
<p> A arquitetura de software de uma aplicação é o conjunto de decisões de design que definem como os diferentes componentes do sistema se relacionam e interagem entre si. Ela é responsável por garantir que a aplicação seja escalável, segura e capaz de lidar com as demandas dos usuários de forma eficiente. A documentação técnica da arquitetura de software é uma parte fundamental do processo de desenvolvimento, pois ajuda a equipe a entender como o sistema funciona e como cada componente se relaciona com os demais. Neste documento, serão descritos os principais componentes da arquitetura da aplicação, como eles se comunicam e quais são as suas responsabilidades. Além disso, serão apresentadas as principais tecnologias utilizadas na implementação da arquitetura, assim como as decisões de design que levaram à escolha dessas tecnologias.</p>

<div align="center">
    <img src="imagens/arquitetura-software.png" alt="Texto alternativo" />
</div>
<h4> 1.2 - Tecnologias da implementação </h2>
<br>
<p>A definição das tecnologias ao implementar um aplicativo web é crucial para garantir eficiência, escalabilidade, segurança e uma boa experiência do usuário. A escolha adequada das tecnologias alinhadas aos requisitos do projeto, integração com outros sistemas, segurança avançada e interfaces responsivas é fundamental para o sucesso do desenvolvimento. Além disso, a seleção de tecnologias populares e bem suportadas agiliza o processo, permite maior interoperabilidade e facilita a resolução de problemas. Dentro deste contexto, definiu-se o uso das tecnologias abaxio para que se alcance com êxito a escalabilidade, eficiência, segurança e usabilidade do aplicativo web em desenvolvimento.</p>
<br>
<ul>
<li><b>Docker: </b>Docker é uma plataforma de virtualização de contêineres que permite empacotar e distribuir aplicativos em ambientes isolados. Ele fornece uma maneira fácil e eficiente de criar, implantar e executar aplicativos em diferentes sistemas operacionais, garantindo consistência e portabilidade.</li>
<li><b>Angular:</b> Angular é um framework de desenvolvimento web front-end mantido pelo Google. Ele permite a criação de aplicações web dinâmicas e responsivas por meio do uso de componentes reutilizáveis. Com recursos como data binding, injeção de dependência e roteamento, o Angular simplifica o desenvolvimento de interfaces de usuário complexas.
</li>
<li><b>Spring Boot:</b> Spring Boot é um framework de desenvolvimento de aplicativos Java que simplifica a criação de aplicativos autônomos e prontos para produção. Ele fornece uma configuração rápida e automática de componentes comuns do ecossistema Spring, permitindo que os desenvolvedores se concentrem na lógica de negócios em vez de configurar e integrar diferentes camadas do aplicativo.</li>
<li><b>PostgreSQL:</b> PostgreSQL é um sistema de gerenciamento de banco de dados relacional de código aberto e altamente escalável. Ele oferece suporte a recursos avançados, como consultas complexas, transações ACID, replicação e extensibilidade. O PostgreSQL é amplamente utilizado em aplicações que exigem um banco de dados confiável e poderoso, fornecendo uma sólida base para armazenamento e manipulação de dados.</li>
</ul>
<br>
<h3> Referências </h3>
<br>
<ol>
<li>Docker. Disponível em: https://www.docker.com/. Acesso em: 05 maio 2023.</li>
<li>Angular. Disponível em: https://angular.io/. Acesso em: 05 maio 2023.</li>
<li>Spring Boot. Disponível em: https://spring.io/projects/spring-boot. Acesso em: 05 maio </li>
<li>PostgreSQL. Disponível em: https://www.postgresql.org/. Acesso em: 05 maio 2023.</li>
<li>TypeScript. Disponível em: https://www.typescriptlang.org/. Acesso em: 05 maio 2023.</li>
<li>Java. Disponível em: https://www.java.com/. Acesso em: 05 maio 2023.</li>
</ol>
<br>
<h3> Contatos </h3>
<br>
<p><b>Daniel Corrêa da Silva</b></p>
<ul>
<li>E-mail: danielcs.senai@fieg.com.br</li>
</ul>


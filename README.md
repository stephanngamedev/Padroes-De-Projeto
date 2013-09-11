Padrões de Projeto
==================
<h2>Princípios de projeto</h2>
<ul>
  <li>
    <h4>Identifique os aspectos de seu aplicativo que variam e separe-os do que permanece igual</h4>
    <p>Se houver algum aspecto de seu código que está mudando, você sabe que tem um comportamento que precisa ser retirado e separado do que não muda.<br/>
  Pegue as partes que variam e encapsule-as para depois poder alterar ou estender as partes que variam sem afetar as partes que não variam.</p>
  </li>
  <li>
    <h4>Programe para uma interface, não uma implementação</h4>
    <p>Explore o polimorfismo programando um supertipo de modo que o objeto em tempo de execução real não fique preso no código.<br/>
    O tipo declarado das variáveis deve ser um supertipo, geralmente uma classe ou interface abstrata, de modo que os objetos atribuídos a essas variáveis possam ser de qualquer implementação concreta do supertipo, o que significa que a classe que os declara não tem que conhecer os tipo de objeto reais</p>
  </li>
</ul>
  

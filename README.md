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

	<li>
		<h4>Dê prioridade à composição</h4>
		<p>Criar sistemas usando composições dá a você muito mais flexibilidade. Além de permitir encapsular uma família de algoritmos em seu próprio conjunto de classes, permite alterar o comportamento no tempo de execução desde que o objeto com o qual você estiver compondo implemente a interface de comportamento certa.</p>
	</li>
</ul>

<h2>Padrões de projetos</h2>
<ul>
	<li>
		<h4>Strategy</h4>
		<p>O padrão Strategy define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. O Strategy deixa o algoritmo variar independentemente dos clientes que o utilizam.</p>
	</li>
</ul>
  

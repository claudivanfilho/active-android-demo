## ActiveAndroid-Exemplo

O ActiveAndroid é uma ORM(Object-relational mapping) que permite salvar e recuperar os registros do banco de dados SQLite sem ter que escrever uma única instrução SQL.

> Seu uso e instalação e extremamente facil e intuitivo.

basicamente funciona da seguinte forma:

- Sua classe à ser persistida deve tem um extends de Model 
como por exemplo nessa classe -> https://github.com/ClaudivanFilho/ActiveAndroid-Exemplo/blob/master/src/com/timemanager/model/Atividade.java

- e para fazer persistir ou mesmo deletar do banco de dados, utiliza os comandos save ou delete
como por exemplo, nesse trecho de codigo aqui -> https://github.com/ClaudivanFilho/ActiveAndroid-Exemplo/blob/master/src/com/timemanager/MainActivity.java#L64

> AA também proporciona fascilidade nos relacionamente oneToMany e ManyToMany

mais detalhes aqui -> https://github.com/pardom/ActiveAndroid/wiki/Creating-your-database-model#relationships

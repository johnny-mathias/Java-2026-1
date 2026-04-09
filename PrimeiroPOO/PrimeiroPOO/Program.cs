using PrimeiroPOO.Domain.Entities;
using System;

namespace PrimeiroPOO
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Produto livro1 = new Livro("O Senhor dos Anéis 1", 10, "J.R.R. Tolkien");
            Produto livro2 = new Livro("O Senhor dos Anéis 2", 10, "J.R.R. Tolkien");
            Produto livro3 = new Livro("O Senhor dos Anéis 3", 10, "J.R.R. Tolkien");
        }
    }
}














//POO - Programação Orientada a Objetos
//Herança,
//- Classe > Animal (nome,tipo,peso,tamanho,cor,cor dos olhos) Comer()
//- Classe > Animal > Cachorro (tamanho da pata,tamanho do rabo) > (nome,tipo,peso,tamanho,cor,cor dos olhos)
//- Classe > Animal > Gato (tamanho da pata,tamanho do rabo) > (nome,tipo,peso,tamanho,cor,cor dos olhos)
//- Classe > Animal > Gaviao (cor bico) > (nome,tipo,peso,tamanho,cor,cor dos olhos)


//-----------------
//Encapsulamento
//-Public, Private, Protected, Internal, Protected Internal, Private Protected
//o metodo pegava essa frase que estou digitando agora
//Public > O metodo pegava essa frase que estou digitando agora.
//Private > 
// Pessoa Comer()

//----------------
//Abstração,
//DB.Context ORACLE > Abstrata
//alter table(), update.delete(), begin transation(), commit(), rollback(), etc()

//Aluno, AlunoService,
//AlunoRespository,ProfessorRepository
//alter table(), update.delete(), begin transation(), commit(), rollback(), etc()

//CarroService : PintarService > Pintar() {apertar spray}
// public override void Pintar() { tudo que é relacionado a pintar carro }


//----------------
//Polimorfismo
//Animal
//--Comer()  
//--fazerbarulho()  
//--Respirar()  

//Cachorro : Animal
//--Comer(ração de cachorro)  

//Gato : Animal
//--fazerbarulho(miar)  


//Suporte para fone
//formato (tamanho, peso, cor, etc),nome,material


// tipo,tamanho,peso,cor,material - SUPORTE
//suporte para fone,7cm,10g,branco,plastico
//suporte para fone,8cm,10g,branco,plastico
//suporte para fone,9cm,10g,branco,plastico
//suporte para fone,10cm,10g,branco,plastico
//suporte para garrafa,15,10g,preta,plastico abs
//suporte para monitor,14cm,1,5,preta,metal

//Alunos > Objeto
//nome, idade,altura, peso, sexo, etc


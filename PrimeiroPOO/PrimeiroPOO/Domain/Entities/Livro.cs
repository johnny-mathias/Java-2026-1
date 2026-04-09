using System;
using System.Collections.Generic;
using System.Text;

namespace PrimeiroPOO.Domain.Entities
{
    //Herança > Livro herda de Produto, ou seja, Livro é um tipo de Produto, e pode usar os atributos e métodos da classe Produto.
    internal class Livro : Produto
    {
        public string Autor { get; set; }

        public Livro(string titulo, decimal precoBase, string autor) : base(titulo, precoBase)
        {
            Autor = autor;
        }

        public override decimal CalcularAluguel(int dias)
         => PrecoBase * dias;
    }
}



using System;
using System.Collections.Generic;
using System.Text;

namespace PrimeiroPOO.Domain.Entities
{
    //(Classe abstrata) > Não pode ser instanciada, ou seja, não pode criar um objeto do tipo Produto, mas pode ser herdada por outras classes.
    public abstract class Produto
    {
        public Guid Id { get; protected set; }
        public string Titulo { get; protected set; }
        public decimal PrecoBase { get; protected set; }

        protected Produto(string titulo,decimal precoBase) 
        {
            Id = Guid.NewGuid();
            Titulo = titulo;
            PrecoBase = precoBase;
        }

        // Polimorfismo
        public abstract decimal CalcularAluguel(int dias);

    }
}

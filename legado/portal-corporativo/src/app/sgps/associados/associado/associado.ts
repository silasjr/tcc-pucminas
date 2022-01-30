export interface Associado {
  id?: number;
  nome: string;
  dataNascimento: string;
  sexo: string;
  cpf: string;
  email?: string;
  telefone1?: string;
  telefone2: string;
  planoDeSaude: {
    tipoPlano: string;
    statusPlano: string;
    tipoAcomodacao: string;
    abrangencia: string;
    dtInicioVigencia: Date;
    dtFimVigencia?: Date;
  };
  endereco: {
    cep: string;
    uf: string;
    logradouro: string;
    municipio: {
      id: string;
      nome: string;
    };
    bairro: string;
    numero: string;
    complemento?: string;
  };
}

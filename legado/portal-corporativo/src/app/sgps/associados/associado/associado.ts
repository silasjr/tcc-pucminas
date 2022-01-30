export interface Associado {
  id: number;
  tipoPlano: string;
  statusPlano: string;
  tipoAcomodacao: string;
  abrangencia: string;
  dataInicioVigencia: Date;
  dataFimVigencia: Date;
  nome: string;
  dataNascimento: string;
  sexo: string;
  cpf: string;
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

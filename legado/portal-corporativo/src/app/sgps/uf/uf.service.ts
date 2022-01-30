import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { UF } from './uf';
import { Municipio } from './municipio';

const API = 'http://localhost:8080/api/v1';

@Injectable({ providedIn: 'root' })
export class UFService {
  constructor(private http: HttpClient) {}

  listAll() {
    return this.http.get<UF[]>(API + '/ufs');
  }

  listMunicipiosPorSiglaUF(siglaUF: string) {
    return this.http.get<Municipio[]>(API + `/ufs/${siglaUF}/municipios`);
  }
}

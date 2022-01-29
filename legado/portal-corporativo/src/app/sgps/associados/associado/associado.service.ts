import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Associado } from './associado';

const API = 'http://localhost:3000';

@Injectable({ providedIn: 'root' })
export class AssociadoService {
  constructor(private http: HttpClient) {}

  listAll() {
    return this.http.get<Associado[]>(API + '/associados');
  }
}

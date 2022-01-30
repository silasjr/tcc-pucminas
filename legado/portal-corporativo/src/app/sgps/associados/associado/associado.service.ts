import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Associado } from './associado';
import { tap } from 'rxjs/operators';

const API = 'http://localhost:8080/api/v1';

@Injectable({ providedIn: 'root' })
export class AssociadoService {
  constructor(private http: HttpClient) {}

  listAll() {
    return this.http.get<Associado[]>(API + '/associados');
  }

  salvar(associado: Associado) {
    return this.http
      .post(API + '/associados', associado, { observe: 'response' })
      .pipe(
        tap((res: any) => {
          console.log(`Associado salvo com sucesso`);
        })
      );
  }
}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { tap } from 'rxjs/operators';
import { UsuarioService } from '../usuario/usuario.service';

const API_URL = 'http://localhost:8080/api/v1';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  constructor(
    private http: HttpClient,
    private usuarioService: UsuarioService
  ) {}

  authenticate(username: string, password: string) {
    return this.http
      .post(
        API_URL + '/auth/token',
        { username, password },
        { observe: 'response' }
      )
      .pipe(
        tap((res: any) => {
          const authToken = res.body.accessToken;
          this.usuarioService.setToken(authToken);
          console.log(`User ${username} authenticated with token ${authToken}`);
        })
      );
  }
}
